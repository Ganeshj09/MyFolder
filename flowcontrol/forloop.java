package com.demo.flowcontrol;



public class forloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/********forloopsiple*********
		int i = 1;

		for ( System.out.println("ganesh"); i <=10 ; System.out.println( "jadhav"))
		{
			System.out.println("Name" +i);
			i++;
		}
		 **/
		int k =0;
		int j = 1;
		for ( k = 0 ;  k<= 10 && k <5; ++k) 
		{
			for ( j = 1 ;  j<= 10; ++j) 
			{
			
				System.out.println("Line" +j );
			}
				System.out.println("Line" +k );
			}


		/**********For each loop********/

		String[]values= new String[4];
		values [0]= "WebDriver";
		values [1]= "Grid";
		values [2]= "IDE";
		values [3]= "RC";
		values [4]= "RC";

		for (String value :values) {
			System.out.println(value);
		}
/******************For Loop Break************/
		
		for (int i =0; i < values.length; i++)
		{
			if (i==0)
				System.out.println("I am into break for loop");
			if (values[i]== "IDE") {
				break;
			}
			System.out.println(values[i]);
		}





	}

}
