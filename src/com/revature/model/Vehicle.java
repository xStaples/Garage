package com.revature.model;

public class Vehicle {

    protected static String brand;
    protected static String model;
    protected static int wheels;
    protected static String type;
    protected static String color;
    protected static int year;

    public Vehicle(String brand, String model, int wheels, String type, String color, int year) {
        this.brand = brand;
        this.model = model;
        this.wheels = wheels;
        this.type = type;
        this.color = color;
        this.year = year;
    }

    public String getType() {
        return type;
    }

    public String getBrand() {
        return this.brand;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setYear(int year) {
        this.year = year;
    }


    public void addVehicle(){

    }

    public void getVehicleDescription() {
        System.out.println("Vehicle Description");
    }
}
