package com.demo.variables;

public class Implemantaion {
	
	public String name ;

	private int marks ;
	static String city = "Mumbai";

	
	public Implemantaion (String Myname) {
		
		this.name = Myname ;
		
	}
	
	public void setmarks(int Mymarks)
	{
		this.marks = Mymarks ;
		
	}
	
	
	
	public void print (){
		System.out.println("Mymarks" + marks);
		System.out.println("Myname" + name);
		System.out.println(StaticVariable.college+" "+city);
		System.out.println();
	}
	
	public static void main (String args[]) {
		//string newcollege = StaticVariable.
		InstanceVariable st = new InstanceVariable ("Ganesh");
		Test q = new Test(100, "Ganesh");
		StaticVariable b = new StaticVariable(111, "abb");	
		LocalVariables g = new LocalVariables();
		g.Salary(10000);
		;
		
		
			//	b.display();
				b.display("xyz");
		//b.display();
		
			
	
		q.mi();
		st.setMarks(100);
		st.printStud();
		
	}
}
