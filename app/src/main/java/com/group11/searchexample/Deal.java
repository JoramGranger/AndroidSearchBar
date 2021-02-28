package com.group11.searchexample;

public class Deal {
    private String Brand;
    private String Make;
    private int Price;
    private String Image;

    public Deal() {
    }

    public Deal(String brand, String make, int price, String image) {
        Brand = brand;
        Make = make;
        Price = price;
        Image = image;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public String getMake() {
        return Make;
    }

    public void setMake(String make) {
        Make = make;
    }

    public int getPrice() {
        return Price;
    }
    public void setPrice(int price) {
        Price = price;
    }
    public String getImage() {
        return Image;
    }

    public void setImage(String image) {
        Image = image;
    }
}
