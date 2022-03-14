package com.cg.model;



public class Employee {
private int id;
private String firstName;
private String lastName;
private int salary;



public Employee(int i,String f,String l,int s) {
id=i;
firstName=f;
lastName=l;
salary=s;
}
public int getID() {
return id;
}
public String getFirstName() {
return firstName;
}
public String getLastName() {
return lastName;
}
public String getName() {
return firstName+" "+lastName;
}
public int getSalary() {
return salary;
}
public void setSalary(double d) {
salary=(int) d;
}
public int getAnnualSalary() {
return salary *12;
}
public int raiseSalary(int percent) {
return salary=salary*12*percent/100-100;
}
public String toString() {
return "Employee[id=" + id + ",name=" + firstName + lastName + ",salary=" + salary + "]";
}
}
