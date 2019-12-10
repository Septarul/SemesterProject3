package Model.Domain;

import java.util.ArrayList;

public class Order {
private int Id;
private int userId;
private String Adress;
private String Invoiceadress;
private float Totalprice;
private int Totalitems;
private int Phone;
private boolean Delivered;
private ArrayList<Item> Items;
private int[] itemsCount;

    public Order(int id ,int userId,String adress, String invoiceadress, Float totalprice, int totalitems, int phone,boolean delivered,ArrayList<Item> items,int[] itemscount) {
        this.Id = id;
        this.userId=userId;
        this.Adress = adress;
        this.Invoiceadress = invoiceadress;
        this.Totalprice = totalprice;
        this.Totalitems = totalitems;
        this.Phone = phone;
        this.Delivered=delivered;
        this.Items=items;
        this.itemsCount=itemscount;
    }

    public Order(int userId,String adress, String invoiceadress, Float totalprice, int totalitems, int phone,boolean delivered,ArrayList<Item> items,int[] itemscount) {
        this.Id = 0;
        this.userId=userId;
        this.Adress = adress;
        this.Invoiceadress = invoiceadress;
        this.Totalprice = totalprice;
        this.Totalitems = totalitems;
        this.Phone = phone;
        this.Delivered=delivered;
        this.Items=items;
        this.itemsCount=itemscount;
    }
    public Order(int id ,int userId,String adress, String invoiceadress, Float totalprice, int totalitems, int phone,boolean delivered,ArrayList<Item> items) {
        this.Id = id;
        this.userId=userId;
        this.Adress = adress;
        this.Invoiceadress = invoiceadress;
        this.Totalprice = totalprice;
        this.Totalitems = totalitems;
        this.Phone = phone;
        this.Delivered=delivered;
        this.Items=items;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getAdress() {
        return Adress;
    }

    public void setAdress(String adress) {
        Adress = adress;
    }

    public String getInvoiceadress() {
        return Invoiceadress;
    }

    public void setInvoiceadress(String invoiceadress) {
        Invoiceadress = invoiceadress;
    }

    public float getTotalprice() {
        return Totalprice;
    }

    public void setTotalprice(float totalprice) {
        Totalprice = totalprice;
    }

    public int getTotalitems() {
        return Totalitems;
    }

    public void setTotalitems(int totalitems) {
        Totalitems = totalitems;
    }

    public int getPhone() {
        return Phone;
    }

    public void setPhone(int phone) {
        Phone = phone;
    }

    public boolean isDelivered() {
        return Delivered;
    }

    public void setDelivered(boolean delivered) {
        Delivered = delivered;
    }

    public ArrayList<Item> getItems() {
        return Items;
    }

    public void setItems(ArrayList<Item> items) {
        Items = items;
    }

    public int[] getItemsCount() {
        return itemsCount;
    }

    public void setItemsCount(int[] itemsCount) {
        this.itemsCount = itemsCount;
    }
}
