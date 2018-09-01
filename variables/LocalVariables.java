package com.demo.variables;

public class LocalVariables {
	static int days;
public void Salary (int salesbonus) {
	
	//static int days = 30; // cant be static as it get memory in pC register area
	//public int days = 30; // cant be public
	
	int currentmonthbonus = salesbonus;
	int sal= 1000;
	sal= sal + currentmonthbonus;
	System.out.println("Monthly Salary :" + sal);
	System.out.println("Days : " + days);
}



public static void main (String args[])
{
	LocalVariables m = new LocalVariables();
	m.Salary(0);
}
}
