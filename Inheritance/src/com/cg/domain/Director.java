package com.cg.domain;



public class Director extends Employee1{



private int empid;
private String empname;
private double salary;
private String deptName;
private double budgetval; public Director(int Id,String Name,String Ssn,double Salary,String deptname,double budget)
{
empid=Id;
empname=Name;
salary=Salary;
deptName=deptname;
budgetval=budget;
}
public double getBudget()
{
return budgetval;
}
public String toString()
{
return "[id= "+empid+", "+"Name= "+empname+",salary= "+salary+",deptname= "+deptName+",budget= "+budgetval+"]";
}
public static void main(String[] args) {
// TODO Auto-generated method stub
}
}


