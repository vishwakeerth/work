package com.inventory.list;
import java.util.ArrayList;

import com.inventory.list.Car;
import com.inventory.list.Dealership;
import com.inventory.list.MotorVehicle;
import com.inventory.list.UsedCar;



/**
 * Task1 Create the Main Java Class and Create a Car object
 * 
 */
public class Main {

    public static void main(final String[] args) {
        // Create Class -Class name matches Filename
        // PSVM method required to run this as an application
        // starting point for the desktop application.

        // Make a Car object based on a Car class

        Car car = new Car("Ford", "Mustang", "white", "23050.99", 2010);
        System.out.println(car);
        
        UsedCar usedcar = new UsedCar();
        System.out.println(usedcar);
        		




    }
}