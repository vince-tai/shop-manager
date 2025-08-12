package com.github.vince_tai.shop_manager;

public class Product {
    String name;
    double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
            return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

}