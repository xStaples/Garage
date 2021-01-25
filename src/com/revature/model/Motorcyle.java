package com.revature.model;

import java.util.Scanner;

public class Motorcyle extends Vehicle {



    Scanner input = new Scanner(System.in);
    
    public Motorcyle(){
        super(brand, model, wheels, type, color, year);
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
        
        System.out.println("Motorcycle Brand: " + brand);
        System.out.println("Motorcycle Model: " + model);
        System.out.println("Motorcycle Color: " + color);
        System.out.println("Total Wheels: " + wheels);
       
    }
}
