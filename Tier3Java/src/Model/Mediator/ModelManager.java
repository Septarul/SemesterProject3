package Model.Mediator;

import Model.Domain.Item;
import Model.Domain.User;
import com.google.gson.Gson;

import java.util.ArrayList;


public class ModelManager implements Model {
    private ArrayList<User> users = new ArrayList<>();
    private SocketClient socket;
    private Gson gson;


    public ModelManager() {
        gson = new Gson();
        this.socket = new SocketClient(this);
        User user=getAllUsers();
        System.out.println(user.getFullname()+user.getId());
        System.out.println("Model constructor");
    }


    @Override
    public User getAllUsers() {
        User useradd=new User(2,"Testeanu","fullnav","emaaaa","parolasaa","userinio");
        String milmoi=gson.toJson(useradd);
        Package pack = new Package(milmoi,"GET", "USERS",2);
        String request = gson.toJson(pack);
        Package response = socket.sendAndReceive(request);
        if (response != null) {
            User user=gson.fromJson(response.getJson(), User.class);
            //  users = Arrays.asList(mapper.readValue(response.getJson(), User[].class));
            //UserList userslist=gson.fromJson(response.getJson(), UserList.class);
            // System.out.println(response.getArgument());
            return user;//list.getList();
        }

        return null;
    }

    @Override
    public ArrayList<Item> getAllItems() {
        ArrayList<Item> items;
        Package pack = new Package("GET", "ITEMS");
        String request = gson.toJson(pack);
        Package response = socket.sendAndReceive(request);
        if (response != null) {
            try {

            return null;
        }catch (Exception e){}
        return null;
    }
        return null;
    }
}
