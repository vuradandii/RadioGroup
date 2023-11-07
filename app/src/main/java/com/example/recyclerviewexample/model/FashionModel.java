package com.example.recyclerviewexample.model;

public class FashionModel {
    String Name;
    String Price;
    String Size;
    String Colour;
    String Description;
    int Image;

    public FashionModel(String name, String price, String size, String colour, String description, int image) {
        Name = name;
        Price = price;
        Size = size;
        Colour = colour;
        Description = description;
        Image = image;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String price) {
        Price = price;
    }

    public String getSize() {
        return Size;
    }

    public void setSize(String size) {
        Size = size;
    }

    public String getColour() {
        return Colour;
    }

    public void setColour(String colour) {
        Colour = colour;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public int getImage() {
        return Image;
    }

    public void setImage(int image) {
        Image = image;
    }
}
