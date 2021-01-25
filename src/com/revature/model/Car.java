package com.revature.model;

import java.util.Scanner;

public class Car extends Vehicle {

    Scanner input = new Scanner(System.in);
    
    public Car(){
        super(brand, model, wheels, type, color, year);
        wheels = 4;
    }

    public void buildVehicle(){
        
        
        System.out.println("Brand");
        brand = input.nextLine();
        setBrand(brand);

        System.out.println("Model");
        model = input.nextLine();
        setModel(model);

        System.out.println("Color");
        color = input.nextLine();
        setColor(color);

    }


    public void getVehicleDescription(){
        
        System.out.println("Car Brand: " + brand);
        System.out.println("Car Model: " + model);
        System.out.println("Car Color: " + color);
        System.out.println("Total Wheels: " + wheels);
        
       
    }
    
       
}
