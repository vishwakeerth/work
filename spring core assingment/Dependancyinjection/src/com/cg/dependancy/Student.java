package com.cg.dependancy;

public class Student {
	
	private String studentName;
	private int id;
	
	
	
	



	public Student(String studentName, int id) {
		
		this.studentName = studentName;
		this.id = id;
	}





	public void displayStudentInfo()
	{
		System.out.println("Student name is:" + studentName + " and the id is :" +id);
	}
	

}
