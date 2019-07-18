package be.businesstraining.domain;

public class Computer {

    private String id;
    private String item;
    private double price;
    private String picture;
    private String descrpition;

    public Computer(String id, String item, double price, String picture, String descrpition) {
        this.id = id;
        this.item = item;
        this.price = price;
        this.picture = picture;
        this.descrpition = descrpition;


    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getDescrpition() {
        return descrpition;
    }

    public void setDescrpition(String descrpition) {
        this.descrpition = descrpition;
    }
}
