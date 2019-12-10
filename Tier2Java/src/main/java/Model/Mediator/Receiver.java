package Model.Mediator;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

import java.io.IOException;
import java.io.InputStream;

public class Receiver implements Runnable{

    private Gson gson;
    private InputStream input;
    private Model model;



    public Receiver(InputStream input,ModelManager model){
        gson=new Gson();
        this.input=input;
        this.model=model;
    }

    @Override
    public void run() {
        while (true){
            try {
               // Package response = reading();
             //  if(response!=null){
                    //readPackage();
              //  }
            }catch (Exception e){e.printStackTrace();}
        }

    }

    private Package reading() throws IOException {
        //translating input
        byte[] lenBytes = new byte[4];
        input.read(lenBytes, 0, 4);
        int len = (((lenBytes[3] & 0xff) << 24) | ((lenBytes[2] & 0xff) << 16) |
                ((lenBytes[1] & 0xff) << 8) | (lenBytes[0] & 0xff));
        byte[] receivedBytes = new byte[len];
        input.read(receivedBytes, 0, len);
        String json = new String(receivedBytes, 0, len);
        Package pack = gson.fromJson(json, Package.class);
        System.out.println(pack.getArgument()+pack.getTask());
        System.out.println(json);
        System.out.println("readfromreceiver");

        if(pack.getTask().equals("UPDATE")){
        return pack;}
        else{
            return null;
        }
    }

}
