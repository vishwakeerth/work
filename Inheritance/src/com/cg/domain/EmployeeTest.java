package com.cg.domain;



public class EmployeeTest {



public static void main(String[] args)
{
Employee1 e1=new Engineer(101,"Jane smith","012-34-5678",120_345.27);
Employee1 e2=new Manager(207,"Barbara Johnson","054-12-2367",109_501.36,"US Marketing");
Employee1 e3=new Admin(304,"Bill Munnroe","108-23-6509",75_002.34);
Employee1 e4=new Director(12,"Susan Wheeler","099-45-2340",120_567.36,"Global Marketing",1_000_000.00);



System.out.println(e1.toString());
System.out.println(e2.toString());
System.out.println(e3.toString());
System.out.println(e4.toString());
}
}

