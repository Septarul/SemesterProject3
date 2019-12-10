package Model.Domain;

public class User {
    private int id;
    private String username;
    private String fullname;
    private String email;
    private String password;
    private String role;

    public User(int id,String username,String fullname,String email,String password,String role){
        this.id=id;
        this.username=username;
        this.fullname=fullname;
        this.email=email;
        this.password=password;
        this.role=role;
    }
    public User(){
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}