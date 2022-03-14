package com.cg.domain;
public class Manager extends Employee1
{
private int empid;
private String empname;
private String ssn;
private double salary;
private String deptName;
public Manager(int Id,String Name,String Ssn,double Salary,String Deptname)
{
empid=Id;
empname=Name;
ssn=Ssn;
salary=Salary;
deptName=Deptname;
}
public Manager()
{
}
public String toString()
{
return "[id= "+empid+", "+"Name= "+empname+",ssn= "+ssn+",salary= "+salary+" ,deptname= "+deptName+"]";
}
public String getDeptName()
{
return deptName;
}
public static void main(String[] args) {
}
}


