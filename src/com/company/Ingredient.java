package com.company;

public class Ingredient {
    private String name;
    private String quantity;

    public Ingredient() {
        name = "";
        quantity = "";
    }

    public Ingredient(String name, String quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString(){
        String str="";
        str += str.format("%-15s%-8s\n", name ,quantity);
        return str;
    }
}
