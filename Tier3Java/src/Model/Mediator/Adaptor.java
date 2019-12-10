package Model.Mediator;

import Model.Domain.Item;
import Model.Domain.Order;
import Model.Domain.User;
import com.google.gson.Gson;

import java.sql.SQLException;
import java.util.ArrayList;


public class Adaptor implements Model {
    private Database database;
    private Gson gson;

    public Adaptor(Database database){
        this.gson=new Gson();
        this.database=database;
    }


    @Override
    public Package getAllUsers() {
        ArrayList<User> users;
        try {
            users = database.getAllUsers();
            return new Package(gson.toJson(users),"GET_USERS","SUCCESS");
        } catch (SQLException e) {
            e.printStackTrace();
            return new Package("DATABASE_ERROR");
        }
    }

    @Override
    public Package getAllItems() {
        ArrayList<Item> items;
        try {
            items = database.getAllItems();
            return new Package(gson.toJson(items),"GET_ITEMS","SUCCESS");
        } catch (SQLException e) {
            e.printStackTrace();
            return new Package("DATABASE_ERROR");
        }

    }

    @Override
    public Package getAllOrders() {
        ArrayList<Order> orders;
        try {
            orders = database.getAllOrders();
            return new Package(gson.toJson(orders),"GET_ORDERS","SUCCESS");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return new Package("DATABASE_ERROR");
    }

    @Override
    public Package getUserById(int id) {
        String user= null;
        try {
            user = gson.toJson(database.getUserById(id));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return new Package(user,"GET_USER","SUCCESS");
    }

    @Override
    public Package getItemById(int id) {
        String item;
        try {
            item = gson.toJson(database.getItemById(id));
            if(item!=null)
            return new Package(item,"GET_ITEM","SUCCESS");
            else return new Package("ITEM_ID_INVALID");
        } catch (SQLException e) {
            e.printStackTrace();
            return new Package("DATABASE_ERROR");
        }

    }

    @Override
    public Package getOrderById(int id) {
        String order;
        try {
            order = gson.toJson(database.getOrderById(id));
            if(order!=null)
            return new Package(order,"GET_ORDER","SUCCESS");
            else return new Package("ORDER_ID_INVALID");
        } catch (SQLException e) {
            e.printStackTrace();
            return new Package("DATABASE_ERROR");
        }

    }

    @Override
    public Package registerUser(User user) {
        try {
            database.registerUser(user);
            return new Package("SUCCESS");
        } catch (SQLException e) {
            e.printStackTrace();
            return new Package("Username in use.");
        }

    }

    @Override
    public Package addItem(Item item) {
        try {
            database.addItem(item);
            return new Package("SUCCESS");
        } catch (SQLException e) {
            e.printStackTrace();
            return new Package("DATABASE_ERROR");
        }
    }

    @Override
    public Package addOrder(Order order) {
        try{
        database.addOrder(order);
        return new Package("SUCCESS");
        }
        catch (Exception e){
            e.printStackTrace();
            return new Package("DATABASE_ERROR");
        }
    }

    @Override
    public Package updateUser(User user) {
        try{
       database.updateUser(user);
        return new Package("SUCCESS");}
        catch (Exception e){
            e.printStackTrace();
            return new Package("DATABASE_ERROR");
        }
    }

    @Override
    public Package updateItem(Item item) {
        try {
            database.updateItem(item);
            return new Package("SUCCESS");
        }catch (Exception e){
            e.printStackTrace();
            return new Package("DATABASE_ERROR");
        }
    }


    @Override
    public Package updateOrderDetails(Order order) {
        try {
            database.updateOrderDetails(order);
            return new Package("SUCCESS");
        }catch (Exception e){
            e.printStackTrace();
            return new Package("DATABASE_ERROR");}
    }



    @Override
    public Package getUsersOrders(int userid) {
        try {
            ArrayList<Order> orders = database.getUserOrders(userid);
            return new Package(gson.toJson(orders), "GET_USER_ORDERS", "SUCCESS");
        }catch (Exception e){e.printStackTrace();
            return new Package("DATABASE_ERROR");
        }
        }


    @Override
    public Package deleteOrder(int id) {
        try {
             database.deleteOrder(id);
            return new Package("SUCCESS");
        }catch (Exception e){e.printStackTrace();
            return new Package("DATABASE_ERROR");}
        }

    @Override
    public Package deleteUser(int id) {
        try{
        database.deleteUser(id);
        return new Package("SUCCESS");
    }catch (Exception e){e.printStackTrace();
        return new Package("DATABASE_ERROR");}
    }

    @Override
    public Package deleteItem(int id) {
        try{
        database.deleteItem(id);
        return new Package("SUCCESS");
        }catch (Exception e){e.printStackTrace();
            return new Package("DATABASE_ERROR");}
    }

    @Override
    public Package loginUser(String username) {
        try{
        User user=database.getUserByUsername(username);
        return new Package(gson.toJson(user),"LOGIN","SUCCESS");
        }catch (Exception e){e.printStackTrace();
            return new Package("DATABASE_ERROR");}
    }
}
