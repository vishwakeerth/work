package com.cg.project;

public class Online extends Student
{
private String platform; 
private int rate, totalcost=0;

Online (String nm, int sid, String pf, int r)

{

	super (nm, sid); 
	platform = pf;
	rate = r;
}

	public String[] subjects()

{
		String[] subs ={"Programming", "Maths", "English"};
		return subs;

}
	public int learningcost() 
{ 
	String subj[] = subjects(); 
	int number = subj.length; 
	totalcost = number*rate;
	return totalcost;

	}

	public void details()

	{

	System.out.println("Learning Platform " + platform); 
	System.out.println("Learning cost" + totalcost);

	}
}
