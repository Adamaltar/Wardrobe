package com.codecool.wardrobe.model;

public class Clothes {
    private static int counter=0;
    private int id;
    private String brand;
    private ClothesType type;


    public Clothes(String brand, ClothesType type) {
        this.brand = brand;
        this.type = type;
        this.id=++counter;
    }

    public int getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public ClothesType getType() {
        return type;
    }
}
