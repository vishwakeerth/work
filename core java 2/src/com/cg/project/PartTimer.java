package com.cg.project;

import java.util.Scanner;

public class PartTimer implements StudentInterface, Titles

{

String name = "PT";

String subs[] = new String[maxcourses]; 
Scanner s = new Scanner(System.in);

public String nameId()

{
	return name;

}

public String[] subjects()

{

for(int i = 0; i<maxcourses; i++) 
{

System.out.println("Type course name"); 
subs[i] = s.next();
		}
		return subs;
	}
	public void title()
	{
		System.out.println("course university");
		System.out.println(subtitle);
	}
	public void output()
	{
		System.out.println("Name:" + name);
		System.out.println("courses");
		for(int i = 0; i<maxcourses; i++)
		{
			System.out.println(subs[i]);
		}
		
	}
	public static void main(String arg[]) {
		PartTimer pt = new PartTimer();
		pt.nameId();
		pt.subjects();
		pt.title();
		pt.output();
	}
}