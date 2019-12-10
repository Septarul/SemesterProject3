package Model.Mediator;

import Model.Domain.User;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

import java.io.*;
import java.net.Socket;

public class SocketClient {

    private Gson gson;
    final int PORT = 6789;
    final String HOST = "localhost";
    private InputStream input;
    private OutputStream output;
    private static SocketClient instance;

    public SocketClient() {
        try {
            gson=new Gson();
            Socket socket = new Socket(HOST, PORT);
            input = socket.getInputStream();
            output = socket.getOutputStream();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Package sendAndReceive(String request) {
        try {
            send(request);
        } catch (Exception e) {e.printStackTrace();System.out.println("send exeept");
        }
        try {
            return read();
        } catch (Exception e) {e.printStackTrace();System.out.println("read exeept");
        }
        return null;
    }

       /* public synchronized static SocketClient getInstance(){
            if (instance== null){
                instance= new SocketClient();
            }
            return instance;
        }

   /* public void send(){
    User student=new User();
    Gson gson= new Gson();
    String json= gson.toJson(student);
    output.println(json);
        String serverReply= null;
        try {
            serverReply = input.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        User reply = gson.fromJson(serverReply, User.class);
    }

    */

    public void send(String toSend) throws IOException {
        //  Package company = new ObjectMapper().readValue(toSend, Package.class);
        System.out.println(toSend);
        byte[] toSendBytes = toSend.getBytes();
        int toSendLen = toSendBytes.length;
        byte[] toSendLenBytes = new byte[4];
        toSendLenBytes[0] = (byte) (toSendLen & 0xff);
        toSendLenBytes[1] = (byte) ((toSendLen >> 8) & 0xff);
        toSendLenBytes[2] = (byte) ((toSendLen >> 16) & 0xff);
        toSendLenBytes[3] = (byte) ((toSendLen >> 24) & 0xff);
        output.write(toSendLenBytes);
        output.write(toSendBytes);
        output.flush();
    }

    private Package read() throws IOException {
        //translating input
        byte[] lenBytes = new byte[4];
        input.read(lenBytes, 0, 4);
        int len = (((lenBytes[3] & 0xff) << 24) | ((lenBytes[2] & 0xff) << 16) |
                ((lenBytes[1] & 0xff) << 8) | (lenBytes[0] & 0xff));
        byte[] receivedBytes = new byte[len];
        input.read(receivedBytes, 0, len);
        String json = new String(receivedBytes, 0, len);
        Package pack = gson.fromJson(json, Package.class);
        System.out.println(json);
        return pack;
    }


}
