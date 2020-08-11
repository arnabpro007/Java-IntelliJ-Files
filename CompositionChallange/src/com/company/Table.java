package com.company;

public class Table {
    private String manufacturer;
    private newDimension dimension;
    private int price;

    public Table(String manufacturer, newDimension dimension, int price) {
        this.manufacturer = manufacturer;
        this.dimension = dimension;
        this.price = price;
    }

    public void Description(){
        System.out.println("Table Description: ");
        System.out.println("Dimensions: "+ dimension.Description());
        System.out.println("Table Price: " + price);
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public newDimension getDimension() {
        return dimension;
    }

    public int getPrice() {
        return price;
    }
}
