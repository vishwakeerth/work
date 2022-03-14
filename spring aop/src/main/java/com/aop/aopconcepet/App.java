package com.aop.aopconcepet;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aop.service.paymentservice;

public class App 
{
    public static void main( String[] args )
    {
       // System.out.println( "Hello World!" );
    	
    	ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
    	
    	paymentservice paymentObject = context.getBean("payment",paymentservice.class);
    	
    	paymentObject.makepayment();
    }
}
