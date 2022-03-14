package com.aop.aspecst;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;




@Aspect
public class myaspect {
//adviser
@Before
("execution(* com.aop.Aop.services.PaymentServiceImpl.makePayment())")
public void printBefore() {
System.out.println("Payment Started");
}
}