package Model.Domain;

import java.util.ArrayList;

public class UserList {
    private ArrayList<User> users;

    public UserList(){
        users=new ArrayList<>();
    }

    public ArrayList<User> getList(){
        return users;
    }
}
