package com.cg.dependancy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {

	public static void main(String[] arg) {
		
		

		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Student vish = context.getBean("student", Student.class);
		vish.displayStudentInfo();
		 	
		
		Student martin = context.getBean("martin",Student.class);
		martin.displayStudentInfo();
		
	
		
		
	}
}
