package com.company;

public class Item {
    private double price;
    private String name;

    Item(){

    }

    public String getName(){
        return this.name;
    }

    public void setName(String itemName){
        this.name = itemName;
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }



}
