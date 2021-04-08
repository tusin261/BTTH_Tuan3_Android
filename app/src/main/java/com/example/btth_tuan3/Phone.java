package com.example.btth_tuan3;

import java.io.Serializable;

public class Phone implements Serializable {
    private String name;
    private String color;
    private String supplier;
    private String price;
    private int img;

    public Phone() {
    }

    public Phone(String name, String color, String supplier, String price, int img) {
        this.name = name;
        this.color = color;
        this.supplier = supplier;
        this.price = price;
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}
