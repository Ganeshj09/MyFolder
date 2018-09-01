package com.demo.methods;

public class Implementation {
	static String  last = " jadhav";
	static int bonus =  222;




	public static void main(String[] args) {


		//****int total = StaticMethod.totallength("Ganesh", "Jadhav" );
		///System.out.println(total);

		//int average = StaticMethod.averagelength("Ganesh", "Jadhav" );
		//System.out.println(average);

		String n = ReturnMethod.getEmpName("Ganesh");
		System.out.println (n+""+last);

		int G = ReturnMethod.getSalaryDetails(250000) ;
		System.out.println(G+bonus);
		
		PrivateMethods PM = new PrivateMethods ();
		//PM.validate(); -- error bcaz this is private 
		PM.apply();
		
		
		//ProtectedMethod premethod = new ProtectedMethod();
		//premethod.UserNameDispplay();
		//premethod.PasswordDisplay();
		
		ProtectedMethod.main(args);


	}
}
