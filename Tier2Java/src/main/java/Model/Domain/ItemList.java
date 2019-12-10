package Model.Domain;

import java.util.ArrayList;

public class ItemList {
    private ArrayList<Item> items;

    public ItemList(){
        items=new ArrayList<>();
    }

    public ArrayList<Item> getList(){
        return items;
    }
}
