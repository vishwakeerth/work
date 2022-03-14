package com.cg.model;



public class Account {
private String id;;
private String name;
private int balance;
public Account(String i,String name1)
{
id=i;
name=name1;
}
public Account(String i,String name1,int b)
{
id=i;
name=name1;
balance=b;
}
public String getID()
{
return id;
}
public String getName()
{
return name;
}
public int getBalance()
{
return balance;
}
public int credit(int amount)
{
balance=amount+balance;
return balance;
}
public int debit(int amount)
{
if(amount<=balance)
balance=balance-amount;
else
System.out.println("Amount Exceeded balance");
return balance;
}
public int transferTo(Account another,int amount)
{
if(amount<=balance) {
another.credit(amount);
balance-=amount;
}
else
System.out.println("Amount exceeded balance");
return balance;
}
public String toString()
{
return "Account[id= " +id+ ",name= " +name+ " balance= "+balance+"]";
}
}