package com.inventory.list;

import java.math.BigDecimal;

// Task 1 Create the Java Class, identify attributes, and instantiate a Car object. 
// Task 2 Define instance variables and create a Class variable using static(count of objects).
// Task 3 Use Encapsulation by providing private instance variables and public getters and setters. 
// Task 4 Use a Parameterized Constructor to create an Object Instance.
// Task 5 Override a default method to create a String representation of the Object. 
/**
 * Car Attributes are declared with access modifier, type and identifier: +
 * String make + String model + String color + BigDecimal price
 * 
 */
public class Car {
    // task 2 -- assign instance variables.
    // assign static variables.
    public static int count = 0;

    public String make;
    public String model;
    public String color;
    public BigDecimal price;
    public int year;

    
    

	public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    // task 4 -- constructors
    public Car() {
        this.make = "Undefined";
        this.model = "Undefined";
        this.color = "Undefined";
        // create object instance of BigDecimal
        this.price = new BigDecimal(0);
        this.year = -1;
        count++;
    }

    public Car(String make, String model, String color, String price) {
        this.make = make;
        this.model = model;
        this.color = color;
        // create object instance of BigDecimal
        this.price = new BigDecimal(price);
        this.year = -1;
        count++;
    }


    public Car(String make, String model, String color, String price, int year) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.year = year;
        this.price = new BigDecimal(price);
        count++;
    }

    public void setMiles(int miles){}
    
    @Override
    public String toString() {
        return "Car [color=" + color + ", make=" + make + ", model=" + model +
         ", price=" + price + ", year=" + year
                + "]";
    }

}