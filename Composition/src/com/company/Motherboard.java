package com.company;

public class Motherboard {
    private String Model;
    private String manufacturer;
    private int ramSlots;
    private int cardSlots;
    private String bios;

    public Motherboard(String model, String manufacturer, int ramSlots, int cardSlots, String bios) {
        Model = model;
        this.manufacturer = manufacturer;
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
        this.bios = bios;
    }
    public void loadProgram(String ProgramName){
        System.out.println("Program "+ ProgramName + " is loading..........");
    }

    public String getModel() {
        return Model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getRamSlots() {
        return ramSlots;
    }

    public int getCardSlots() {
        return cardSlots;
    }

    public String getBios() {
        return bios;
    }
}
