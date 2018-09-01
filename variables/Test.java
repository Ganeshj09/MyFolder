package com.demo.variables;

public class  Test

{
	
	int rollno;
	String name;
	public Test (int rollno, String name)
	{ 
		this.rollno = rollno;
		this.name = name ;
				
	}
	
	public void mi()
	{
		System.out.println("Roll No is" + rollno);
		System.out.println("Name is" + name);
	
	}
	
	public Test ()
	{

	}

	

		public Test (int rollno)
		{

		}

		public static void main(String[] args) {



			Test a = new Test();
			
			System.out.println(a);
			

		}
		
		
	}
