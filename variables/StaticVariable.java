package com.demo.variables;

public class StaticVariable {

	int rollno;
	String name;
	static String college = "ITS";
	static String city = "Mumbai";
	public StaticVariable(int r ,String n)
	{
		this.rollno = r;
		this.name = n;
		


	}
	public void display (String CollegeName)
	{
		college = college+CollegeName;
		System.out.println(rollno+ " "+name+ " "+ CollegeName+" "+city);
	}

	public void display ()
	{
		System.out.println(rollno+ " "+name+ " "+college+" "+city);
	}
	public static void main(String[] args)
	{
		StaticVariable s1 =new StaticVariable(111, "Ganesh");
		StaticVariable s2 =new StaticVariable(999, "Reyansh");
		s1.display();
		s2.display();

	}

}
