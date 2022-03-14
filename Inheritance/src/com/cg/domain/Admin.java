package com.cg.domain;
public class Admin extends Employee1
{
private int empid;
private String empname;
private String ssn;
private double salary;
public Admin(int Id,String Name,String Ssn,double Salary)
{
empid=Id;
empname=Name;
ssn=Ssn;
salary=Salary;
}
public String toString()
{
return "[id= "+empid+",Name= "+empname+",ssn= "+ssn+",salary= "+salary+"]";
}
}


