package com.demo.variables;

public class InstanceVariable {

	public String name ;

	private int marks ;

	public  InstanceVariable (String StudName) 
	{
		name = StudName;
	}

	public  void setMarks (int studMarks) 
	{

		marks = studMarks;
	}

	public  void printStud()
	{
		System.out.println("student name :  "+   name  );
		System.out.println("Marks : " + marks );
	}

	public static void main (String args[]) 
	{
		InstanceVariable st = new InstanceVariable ("John");

		st.setMarks(80);

		st.printStud();

	}
}