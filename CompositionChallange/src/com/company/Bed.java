package com.company;

import java.awt.*;

public class Bed {
    private String manufacturer;
    private int yearofManufacture;
    private newDimension dimension;
    private int price;
    private int weight;

    public Bed(String manufacturer, int yearofManufacture, newDimension dimension, int price, int weight) {
        this.manufacturer = manufacturer;
        this.yearofManufacture = yearofManufacture;
        this.dimension = dimension;
        this.price = price;
        this.weight = weight;
    }

    public void Description(){
        System.out.println("Bed Description: ");
        System.out.println("Bed Manufacturer: " + manufacturer);
        System.out.println("Mfd Year: " + yearofManufacture);
        System.out.println("Dimensions: "+ dimension.Description());
        System.out.println("Bed Price: " + price);
        System.out.println("Bed Weight: " + weight);
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getYearofManufacture() {
        return yearofManufacture;
    }

    public newDimension getDimension() {
        return dimension;
    }

    public int getPrice() {
        return price;
    }

    public int getWeight() {
        return weight;
    }
}
