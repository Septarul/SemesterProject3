package Model.Domain;

public class Item {
    private int Id;
    private String Name;
    private String Category;
    private float Price;
    private String Description;
    private String Url;
    private int Nrofitems;

    public Item(int id, String name, String category, Float price, String description, int nrofitems) {
        this.Id = id;
        this.Name = name;
        this.Category = category;
        this.Price = price;
        this.Description = description;
        this.Nrofitems = nrofitems;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        Category = category;
    }

    public float getPrice() {
        return Price;
    }

    public void setPrice(float price) {
        Price = price;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getUrl() {
        return Url;
    }

    public void setUrl(String url) {
        Url = url;
    }

    public int getNrofitems() {
        return Nrofitems;
    }

    public void setNrofitems(int nrofitems) {
        Nrofitems = nrofitems;
    }


}
