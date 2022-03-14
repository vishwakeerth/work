package com.inventory.list;

public class UsedCar extends Car{
   private int miles;

public int getMiles() {
	return miles;
}

public void setMiles(int miles) {
	this.miles = miles;
}

public UsedCar(int miles) {
	super();
	this.miles = miles;
}

public UsedCar(String make, String model, String color, String price, int year, int miles) {
	super(make, model, color, price, year);
	this.miles = miles;
	// TODO Auto-generated constructor stub
} 
public UsedCar() {
	super();
	this.miles = -1;
	
}

@Override
public String toString() {
	return "UsedCar" + super.toString() + "[miles=" + miles + "]";
}

}
