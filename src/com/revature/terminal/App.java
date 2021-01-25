package com.revature.terminal;

import java.util.ArrayList;
import java.util.Scanner;

import com.revature.model.Car;
import com.revature.model.Motorcyle;
import com.revature.model.Vehicle;

public class App {

    // Example of Polymorphism and Inheritance
    // Have Constructors, getters setters, methods
    // Method overriding in the child class and show inheritance

    // Build working UI with accepting inputs from terminal
    // Vehicle type should determine what vehicle method to execute
    static ArrayList<Vehicle> garage = new ArrayList<>();

    static String userChoice;

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        do {
            System.out.println();
            System.out.println("///////////////// Welcome! /////////////////");
            System.out.println();
            System.out.println("What would you like to do?");
            System.out.println();
            System.out.println("1: Add Car");
            System.out.println("2: Add Motorcycle");
            System.out.println("3: Check Vehicles");
            System.out.println("0: Quit");
            System.out.println();
            System.out.println("/////////////////////////////////////////////");

            userChoice = input.nextLine();
            switch (userChoice) {
                case "1":

                    Vehicle car = new Car();
                    car.buildVehicle();
                    garage.add(car);
                    break;

                case "2":

                    Vehicle motorcyle = new Motorcyle();
                    motorcyle.buildVehicle();
                    garage.add(motorcyle);
                    break;

                case "3":
                
                    System.out.println("This is where you can check your created vehicles");
                    System.out.println(garage.toArray());
                    break;

            }
        } while (!userChoice.equals("0"));
        System.out.println("Logging off...");
    }
}
