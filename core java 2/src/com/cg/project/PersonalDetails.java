package com.cg.project;



public class PersonalDetails
{
//instance variables
String myname = "Nayum";
final String title = "MY DATA";
int myage = 0, older, oldest;
String books[] = new String[3];

//void method
public void name()
{
myname = "vishwa";
}

//integer age method
public int age()
{
myage = 22;
return myage; //end of the code execution
}
//parameterized method for older age
public int olderage(int x)
{
older = myage + x;
return older;
}

public int olderage(int x, int y)
{
oldest = myage + x + y;
return oldest;
}
//array method for storing list of books
public String[] mybooks()
{
books[0] = "a christmal carol";
books[1] = "romeo and juliet";
books[2] = "inspector general";

return books;
}

//output method
public void output()
{
System.out.println("My name is " + myname);
System.out.println("My age is " + myage);
System.out.println("My older age is " + older);
System.out.println("My oldest age is " + oldest);
System.out.print("My Books: ");
for(int i=0; i<books.length; i++)
{
System.out.print(books[i] + " ");
}
}



}