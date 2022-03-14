package com.example.domain;



public class Employee {
private int id;
private String firstName;
private String lastName;
private int salary;



public Employee(int i,String f,int empsecurity,int s) {
id=i;
firstName=f;
salary=s;
}
public int getID() {
return id;
}
public String getFirstName() {
return firstName;
}
public  Object getsecurity() {
return getsecurity();
}
public String getName() {
return firstName+" "+lastName;
}
public int getSalary() {
return salary;
}
public void setSalary(int s) {
salary=s;
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
