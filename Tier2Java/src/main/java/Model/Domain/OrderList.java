package Model.Domain;

import java.util.ArrayList;

public class OrderList {

    private ArrayList<Order> orders;

    public OrderList(){
        orders=new ArrayList<>();
    }

    public ArrayList<Order> getList(){
        return orders;
    }
}
