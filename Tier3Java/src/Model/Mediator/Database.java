package Model.Mediator;

import Model.Domain.Item;
import Model.Domain.Order;
import Model.Domain.User;

import java.sql.*;
import java.util.ArrayList;

public class Database
{
    Connection connection = null;
    Statement statement = null;
    ResultSet resultSet = null;

    public Database(String password)
    {
        try
        {
            Class.forName("org.postgresql.Driver");

        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        try
        {
            String databaseUrl = "jdbc:postgresql://localhost:5432/postgres";
            String user = "postgres";

            this.connection = DriverManager.getConnection(databaseUrl, user, password);
            System.out.println("Connection established to: " + databaseUrl);
        }
        catch (Exception exception)
        {
            System.out.println("Connection failed");
            exception.printStackTrace();
        }
    }


    public ArrayList<User> getAllUsers() throws SQLException {
        ArrayList<User> users = new ArrayList<>();
            statement = connection.createStatement();
            String sql = "select * from sepdb.users";
            resultSet = statement.executeQuery(sql);
            while (resultSet.next())
            {

                User user = new User(resultSet.getInt(1), resultSet.getString(2),
                        resultSet.getString(3), resultSet.getString(4), resultSet.getString(5),
                        resultSet.getString(6));
                users.add(user);
            }
        return users;
    }

    public ArrayList<Item> getAllItems() throws SQLException
    {
        ArrayList<Item> items = new ArrayList<>();
        statement = connection.createStatement();
        String sql = "select * from sepdb.item";
        resultSet = statement.executeQuery(sql);
        while (resultSet.next())
        {

            Item item = new Item(resultSet.getInt(1), resultSet.getString(2),
                    resultSet.getString(3), resultSet.getFloat(4), resultSet.getString(5),
                    resultSet.getString(6), resultSet.getInt(7), resultSet.getString(8),
                    resultSet.getInt(9));
            items.add(item);
        }
        return items;
    }

    public ArrayList<Order> getAllOrders() throws SQLException
    {
        ResultSet resultSet2;
        ArrayList<Order> orders = new ArrayList<>();
        statement = connection.createStatement();
        String sql = "select * from sepdb.orders";
        resultSet = statement.executeQuery(sql);
        while (resultSet.next())
        {
            String sql2 = "select * from sepdb.orderhasitems join sepdb.item on sepdb.orderhasitems.item_id=sepdb.item.id where " +
                    "sepdb.orderhasitems.order_id="+resultSet.getInt(1);
            resultSet2=statement.executeQuery(sql2);
            ArrayList<Item> items=new ArrayList<>();
            int[] count=new int[100];
            int i=0;
            while(resultSet2.next()){
                Item item = new Item(resultSet2.getInt(4), resultSet2.getString(5),
                        resultSet2.getString(6), resultSet2.getFloat(7), resultSet2.getString(8),
                        resultSet2.getString(9), resultSet2.getInt(10), resultSet2.getString(11),
                        resultSet2.getInt(12));
                items.add(item);
                count[i]=resultSet2.getInt(3);
                i++;
            }
            String sql3="select * from sepdb.userhasorder where order_id="+resultSet.getInt(1);
            resultSet2=statement.executeQuery(sql3);
            Order order = new Order(resultSet.getInt(1),resultSet2.getInt(1), resultSet.getString(2),
                    resultSet.getString(3), resultSet.getFloat(4), resultSet.getInt(5),
                    resultSet.getInt(6), resultSet.getBoolean(7),items,count);
            orders.add(order);
        }
        return orders;
    }

    public User getUserById(int id) throws SQLException
    {
        statement = connection.createStatement();
        String sql = "select * from sepdb.users where Id=" + id;
        resultSet = statement.executeQuery(sql);
        User user = new User(resultSet.getInt(1), resultSet.getString(2), resultSet.getString(3), resultSet.getString(4), resultSet.getString(5),
                resultSet.getString(6));
        return user;
    }

    public Item getItemById(int id) throws SQLException
    {
        statement = connection.createStatement();
        String sql = "select * from sepdb.items where Id=" + id;
        resultSet = statement.executeQuery(sql);
        Item item = new Item(resultSet.getInt(1), resultSet.getString(2),
                resultSet.getString(3), resultSet.getFloat(4), resultSet.getString(5),
                resultSet.getString(6), resultSet.getInt(7), resultSet.getString(8),
                resultSet.getInt(9));
        return item;
    }

    public Order getOrderById(int id) throws SQLException
    {
        ResultSet resultSet2;
        statement = connection.createStatement();
        String sql = "select * from sepdb.orders where Id=" + id;
        resultSet = statement.executeQuery(sql);
        while (resultSet.next())
        {
            String sql2 = "select * from sepdb.orderhasitems join sepdb.item on sepdb.orderhasitems.item_id=sepdb.item.id where " +
                    "sepdb.orderhasitems.order_id="+resultSet.getInt(1);
            resultSet2=statement.executeQuery(sql2);
            ArrayList<Item> items=new ArrayList<>();
            int[] count=new int[100];
            int i=0;
            while(resultSet2.next()){
                Item item = new Item(resultSet2.getInt(4), resultSet2.getString(5),
                        resultSet2.getString(6), resultSet2.getFloat(7), resultSet2.getString(8),
                        resultSet2.getString(9), resultSet2.getInt(10), resultSet2.getString(11),
                        resultSet2.getInt(12));
                items.add(item);
                count[i]=resultSet2.getInt(3);
                i++;
            }
            String sql3="select * from sepdb.userhasorder where order_id="+resultSet.getInt(1);
            resultSet2=statement.executeQuery(sql3);
            Order order = new Order(resultSet.getInt(1),resultSet2.getInt(1), resultSet.getString(2),
                    resultSet.getString(3), resultSet.getFloat(4), resultSet.getInt(5),
                    resultSet.getInt(6), resultSet.getBoolean(7),items,count);
            return order;
        }
      return null;
    }

    public void registerUser(User user) throws SQLException
    {
        statement = connection.createStatement();
        String sql =
                "insert into sepdb.users(username, fullname, email, password) values (('"
                        + user.getUsername() + "' , '" + user.getFullname() + "' , " + "'"
                        + user.getEmail() + "', '" + user.getPassword() + "'))";
        resultSet = statement.executeQuery(sql);
    }

    public void addItem(Item item) throws SQLException
    {
        statement = connection.createStatement();
        String sql =
                "insert into sepdb.item (name, category, price, description, url, quantity, quantitytype,nrofitems) values (('"
                        +item.getName()+"', '"+item.getCategory()+"', '"+item.getPrice()+"' , '"+item.getDescription()+"' , '"+item.getUrl()+"' , "
                        + "'"+item.getQuantity()+"' , '"+item.getQuantitytype()+"' , '"+item.getNrofitems()+"'))";
        resultSet = statement.executeQuery(sql);
    }

    public void updateItem(Item item) throws SQLException
    {
        statement=connection.createStatement();
        String sql="update sepdb.item set name= '"+item.getName()+"' , category='"+item.getCategory()+"', price='"+item.getPrice()+"' , "
                + " description = '"+item.getDescription()+"' , url='"+item.getUrl()+"', quantity = '"+item.getQuantity()+"' , quantitytype = '"+item.getQuantitytype()+"'"
                + " nrofitems='"+item.getNrofitems()+"' where id=" + item.getId();
        resultSet=statement.executeQuery(sql);
    }

    public boolean restockItem(Item item, int nrofitems) throws SQLException
    {
        statement=connection.createStatement();
        String sql= "update sepdb.item set nrofitems = '"+nrofitems+"' where id=" + item.getId();
        resultSet=statement.executeQuery(sql);
        return true;
    }

    public void updateOrderDetails(Order order) throws SQLException
    {
        statement=connection.createStatement();
        String sql= "update sepdb.orders set address = '"+order.getAdress()+"', invoiceadress= '"+order.getInvoiceadress()+"', totalprice='"+order.getTotalprice()+"', "
                + "totalitems ='"+order.getTotalitems()+"' , phone='"+order.getPhone()+"', delivered= '"+order.isDelivered()+"' where id=" +order.getId();
        resultSet=statement.executeQuery(sql);

    }


    public void addOrder(Order order) throws SQLException {

        statement=connection.createStatement();
        String sql= "insert into sepdb.orders(adress, invoiceadress, totalprice,totalitems,phone)\n" +
                "VALUES ('"+order.getAdress()+"','"+order.getInvoiceadress()+"','"+order.getTotalprice()+"','"+order.getTotalitems()+"','"+order.getPhone()+"')";
        statement.execute(sql);

        sql="select * from sepdb.orders";
        resultSet=statement.executeQuery(sql);
        int id=0;
        while (resultSet.next())
        {id=resultSet.getInt(1);
        }
        sql="insert into userhasorder (user_id, order_id) values ("+order.getUserId()+","+id+")";
        statement.execute(sql);

        for(int i=0;i<order.getItems().size();i++) {

            sql = "insert into orderhasitems (order_id, item_id,item_count) values (" + id + "," + order.getItems().get(i).getId() + "," + order.getItemsCount()[i] + ")";
            statement.execute(sql);
        }

    }

    public void updateUser(User user) throws SQLException {
        statement=connection.createStatement();
        String sql= "update sepdb.users set username = '"+user.getUsername()+"', fullname= '"+user.getFullname()+"', email='"+user.getEmail()+"', "
                + "password='"+user.getPassword()+"'where id="+user.getId();
        statement.execute(sql);

    }

    public void deleteOrder(int id) throws SQLException {
        statement=connection.createStatement();
        String sql= "delete from sepdb.orders where id = "+id;
        statement.execute(sql);
    }

    public void deleteUser(int id) throws SQLException {
        statement=connection.createStatement();
        String sql= "delete from sepdb.users where id = "+id;
        statement.execute(sql);
    }

    public void deleteItem(int id) throws SQLException {
        statement=connection.createStatement();
        String sql= "delete from sepdb.item where id = "+id;
        statement.execute(sql);
    }

    public User getUserByUsername(String username) throws SQLException {
        statement = connection.createStatement();
        String sql = "select * from sepdb.users where username=" + username;
        resultSet = statement.executeQuery(sql);
        User user = new User(resultSet.getInt(1), resultSet.getString(2), resultSet.getString(3), resultSet.getString(4), resultSet.getString(5),
                resultSet.getString(6));
        return user;
    }

    public ArrayList<Order> getUserOrders(int userid) throws SQLException {
        ResultSet resultSet2;
        ArrayList<Order> orders = new ArrayList<>();
        statement = connection.createStatement();
        String sql = "select * from sepdb.userhasorders join sepdb.orders on sepdb.userhasorders.order_id=sepdb.orders.id" +
                " where sepdb.userhasorders.user_id="+userid;
        resultSet = statement.executeQuery(sql);
        while (resultSet.next())
        {
            String sql2 = "select * from sepdb.orderhasitems join sepdb.item on sepdb.orderhasitems.item_id=sepdb.item.id where " +
                    "sepdb.orderhasitems.order_id="+resultSet.getInt(1);
            resultSet2=statement.executeQuery(sql2);
            ArrayList<Item> items=new ArrayList<>();
            int[] count=new int[100];
            int i=0;
            while(resultSet2.next()){
                Item item = new Item(resultSet2.getInt(4), resultSet2.getString(5),
                        resultSet2.getString(6), resultSet2.getFloat(7), resultSet2.getString(8),
                        resultSet2.getString(9), resultSet2.getInt(10), resultSet2.getString(11),
                        resultSet2.getInt(12));
                items.add(item);
                count[i]=resultSet2.getInt(3);
                i++;
            }
            String sql3="select * from sepdb.userhasorder where order_id="+resultSet.getInt(1);
            resultSet2=statement.executeQuery(sql3);
            Order order = new Order(resultSet.getInt(1),resultSet2.getInt(1), resultSet.getString(2),
                    resultSet.getString(3), resultSet.getFloat(4), resultSet.getInt(5),
                    resultSet.getInt(6), resultSet.getBoolean(7),items,count);
            orders.add(order);
        }
        return orders;
    }
}


