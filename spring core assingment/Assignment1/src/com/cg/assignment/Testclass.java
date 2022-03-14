package com.cg.assignment;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Testclass {
public static void main(String[] args) {
ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Beans.xml");
Customer customer1 = applicationContext.getBean("customer1", Customer.class);
Customer customer2 = applicationContext.getBean("customer2", Customer.class);



System.out.println();
System.out.println("Via Setter Injection ....");
System.out.println("Id: " + customer1.getCustomerId());
System.out.println("Name: " + customer1.getCustomerName());
System.out.println("Contact: " + customer1.getCustomerContact());
System.out.println("Address: " + customer1.getCustomerAddress().toString());
System.out.println();
System.out.println("Via Constructor Injection....");
System.out.println("Id: " + customer2.getCustomerId());
System.out.println("Name: " + customer2.getCustomerName());
System.out.println("Contact: " + customer2.getCustomerContact());
System.out.println("Address: " + customer2.getCustomerAddress().toString());



}
}
