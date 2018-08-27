package iphone_manage.entity;

public class Iphone {
    private int id;
    private String name;
    private String datetime;
    private String color;
    private int price;
    private int stock;
    private String firm;

    public Iphone() {
    }

    public Iphone(int id, String name, String datetime, String color, int price, int stock, String firm) {
        this.id = id;
        this.name = name;
        this.datetime = datetime;
        this.color = color;
        this.price = price;
        this.stock = stock;
        this.firm = firm;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDatetime() {
        return datetime;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getFirm() {
        return firm;
    }

    public void setFirm(String firm) {
        this.firm = firm;
    }
}
