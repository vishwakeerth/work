package com.cg.domain;

public class Employee1
{
private int empid;
private String empname;
private String ssn;
private double salary;public Employee1(int Id,String Name,String Ssn,double Salary)
{
empid=Id;
empname=Name;
ssn=Ssn;
salary=Salary;
}
public Employee1()
{}
public void setName(String Name)
{
empname=Name;
}
public String getName()
{
return empname;
}
public void raiseSalary(double d)
{
salary=salary*12*d/100-100;
}
public String printEmployee()
{
return "[employee id= "+empid+" employee name= "+empname+" ssnno= "+ ssn+" salary="+salary+"]" ;
}
public Employee1(int a, String name)
{}public static void main(String[] args)
{
Employee1 e1=new Employee1(213,"Vishwa","123-45-678",10000);
e1.setName("Vishwa");
e1.printEmployee();
}
}


