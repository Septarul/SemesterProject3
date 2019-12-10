package Main;

import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

import Model.Domain.Item;
import Model.Domain.Order;
import Model.Domain.User;
import Model.Mediator.ModelManager;
import com.google.gson.Gson;
import org.springframework.context.annotation.Bean;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
public class GreetingController {
    private final ModelManager model = new ModelManager();
    private Gson gson=new Gson();


    @RequestMapping(value = "/greeting", method = RequestMethod.GET)
    public String greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        //User user=new User(2,"userr","full","ema","parolas","user");
        return name;
        //   return new Greeting(counter.incrementAndGet(),String.format(template, name));
    }

    @PostMapping("/greeting")
    public User newUser(@RequestBody User newUser) {
        User user = new User(2, "userr", "full", "ema", "parolas", "user");
        return user;
    }

    @RequestMapping(value = "/users", method = RequestMethod.POST)
    //  consumes = MediaType.APPLICATION_JSON_VALUE)
    public String registerUser(@RequestBody String newUser) {
        System.out.println(newUser);
        Gson g = new Gson();
        User user = g.fromJson(newUser, User.class);
        return model.registerUser(user);
        //return model.add(newUser);
    }
    @RequestMapping(value = "/users", method = GET)
    public ArrayList<User> newUser() {
        return model.getAllUsers();
    }
    @GetMapping("/orders")
    public ArrayList<Order> getOrders() {
        return model.getAllOrders();
    }

   /*
    @GetMapping("/orders")
    public ArrayList<Order> getUsersOrders(@RequestParam(required = true, defaultValue = "0") Integer id) {
        return model.getUsersOrders(id);
    }

    */

    @PostMapping("/orders/{id}")
    public boolean addOrder(@RequestBody String newOrder) {
        Order order=gson.fromJson(newOrder,Order.class);
        return model.addOrder(order);
    }

    @GetMapping("/items")
    @ResponseBody
    public ArrayList<Item> getAllItems() {
        return model.getAllItems();
    }

    @GetMapping("/items/{id}")
    public Item getItem(@PathVariable int id) {
        Item item = model.getItemById(id);
        return item;
    }

    @PostMapping("/items")
    public boolean getAllItems(@RequestBody String newItem) {
        Item item=gson.fromJson(newItem,Item.class);
        return model.addItem(item);
    }

    @GetMapping("/users/{id}")
    public User getUser(@PathVariable int id) {
        User user = model.getUserById(id);
        return user;
    }

    @PutMapping("/users/{id}")
    public boolean replaceEmployee(@RequestBody User newUser, @PathVariable int id) {
        User old = model.getUserById(id);
        if (old != null) {
            old.setEmail(newUser.getEmail());
            return model.updateUser(newUser,id);
        } else {
            newUser.setId(id);
            User nn = newUser;
            return false;

        }
    }

    @DeleteMapping("/users/{id}")
    public boolean deleteUser(@PathVariable int id) {
        return model.deleteUser(id);
    }

    @DeleteMapping("/items/{id}")
    public boolean deleteItem(@PathVariable int id) { return model.deleteItem(id); }

    @DeleteMapping("/orders/{id}")
    public boolean deleteOrder(@PathVariable int id) {
        return model.deleteItem(id);
    }
}