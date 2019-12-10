package Model.Server;

import Model.Domain.Item;
import Model.Domain.Order;
import Model.Mediator.Adaptor;
import Model.Mediator.Database;
import Model.Mediator.Model;
import com.google.gson.Gson;
import Model.Domain.User;
import Model.Mediator.Package;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClientHandler implements Runnable {
    private InputStream input;
    private OutputStream output;
    private Gson gson;
    private Model adaptor;

    public ClientHandler(Socket socket, Database database) throws IOException {
        gson=new Gson();
        this.adaptor=new Adaptor(database);
        this.input = socket.getInputStream();
        this.output=socket.getOutputStream();
    }

    @Override
    public void run() {
        while (true) {
            String json= null;
            try {
                json = reading();
            } catch (IOException e) {
                e.printStackTrace();
            }
            Package pack = gson.fromJson(json, Package.class);
            System.out.println(pack.getArgument()+pack.getJson()+pack.getTask()+pack.getArgument2());
            User user = gson.fromJson(pack.getJson(), User.class);
            System.out.println(user.getFullname()+user.getPassword()+user.getUsername());
            if(pack.getArgument2()==2) {
                try {
                    User userad=new User(2,"userr","full","ema","parolas","user");
                    User useradd=new User(2,"userr","full","ema","parolas","user");
                    String jayjay=gson.toJson(userad);
                    Package pacak=new Package(jayjay,"asd","SUCCESS");
                    String response= gson.toJson(pacak);
                    send(response);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }


        }
    }
    private String reading() throws IOException {
        //translating input
        byte[] lenBytes = new byte[4];
        input.read(lenBytes, 0, 4);
        int len = (((lenBytes[3] & 0xff) << 24) | ((lenBytes[2] & 0xff) << 16) |
                ((lenBytes[1] & 0xff) << 8) | (lenBytes[0] & 0xff));
        byte[] receivedBytes = new byte[len];
        input.read(receivedBytes, 0, len);
        String json = new String(receivedBytes, 0, len);
        return json;}


    private void send(String toSend) throws IOException {
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
    }


    private Package readPackage(Package pack){
        if (pack==null)
            return new Package("BAD");
        switch (pack.getTask()){
            case "GET":  switch (pack.getArgument()){
                case "USERS":return adaptor.getAllUsers();
                case "ITEMS":return adaptor.getAllItems();
                case "ORDERS":return adaptor.getAllOrders();
                case "USER":if(pack.getArgument2()!=0)return adaptor.getUserById(pack.getArgument2());
                                    return adaptor.loginUser(pack.getJson());
                case "ITEM":return adaptor.getItemById(pack.getArgument2());
                case "ORDER":return adaptor.getOrderById(pack.getArgument2());
                case "USER_ORDERS": return adaptor.getUsersOrders(pack.getArgument2());

            }
            case "REGISTER":switch (pack.getArgument()){
                case "USER":return adaptor.registerUser(gson.fromJson(pack.getJson(),User.class));
                case "ITEM":return adaptor.addItem(gson.fromJson(pack.getJson(), Item.class));
                case "ORDER":return adaptor.addOrder(gson.fromJson(pack.getJson(), Order.class));
            }
            case "UPDATE":switch (pack.getArgument()){
                case "USER":return adaptor.updateUser(gson.fromJson(pack.getJson(),User.class));
                case "ITEM":return adaptor.updateItem(gson.fromJson(pack.getJson(), Item.class));
                case "ORDER":return adaptor.updateOrderDetails(gson.fromJson(pack.getJson(), Order.class));
            }
            case "DELETE":switch (pack.getArgument()){
                case "USER":return adaptor.deleteUser(pack.getArgument2());
                case "ORDER":return adaptor.deleteOrder(pack.getArgument2());
                case "ITEM":return adaptor.deleteItem(pack.getArgument2());
            }
        }
        return new Package("BAD");
    }

}
