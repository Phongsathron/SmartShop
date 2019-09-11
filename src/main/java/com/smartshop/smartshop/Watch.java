package com.smartshop.smartshop;

public class Watch {
    private long id;
    private String productName;
    private String brand;
    private double price;
    private String content;
    private String imageURL;

//    public Watch(long id, String productName, String brand, double price, String content, String imageURL) {
//        this.id = id;
//        this.productName = productName;
//        this.brand = brand;
//        this.price = price;
//        this.content = content;
//        this.imageURL = imageURL;
//    }

    protected void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }
}
