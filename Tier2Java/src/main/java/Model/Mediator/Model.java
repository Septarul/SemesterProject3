package Model.Mediator;

import Model.Domain.Item;
import Model.Domain.Order;
import Model.Domain.User;
import com.fasterxml.jackson.core.JsonProcessingException;

import java.util.ArrayList;

public interface Model {

    ArrayList<User> getAllUsers() throws JsonProcessingException;
    ArrayList<Item> getAllItems();
    ArrayList<Order> getAllOrders();
    User getUserById(int id);
    Item getItemById(int id);
    Order getOrderById(int id);
    String registerUser(User user);
    boolean addItem(Item item);
    boolean addOrder(Order order);
    boolean updateUser(User user,int id);
    boolean updateItem(Item item,int id);
    boolean restockItem(int id,int nrofitems);
    boolean updateOrderDetails(Order order,int id);
    ArrayList<Item> getOrderItems(int Orderid);
    ArrayList<Order> getUsersOrders(int Userid);
    ArrayList<User> getNormalUsers();
    boolean deleteOrder(int id);
    boolean deleteUser(int id);
    boolean deleteItem(int id);
    String loginUser(User user);


}
