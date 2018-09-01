package com.demo.flowcontrol;



public class SwitchDay {
	public enum days {monday,tuesday,wensday,thursday,friday}
	public static void main(String[] args)
	{
		for (days d:days.values())
		/**String[]values= new String[6];
		values [0]= "Monday";
		values [1]= "Tuesday";
		values [2]= "Wensday";
		values [3]= "Thursday";
		values [4]= "Friday";
		values [5]= "Saturday";
		for (String value:values)**/
			
		{
			switch(d)
			
			{
				case monday : {
					System.out.println("To day is " + d );
					break;
				}
				case tuesday : {
					System.out.println("Its a " + d );
				break;
				}
				
				case  wensday : {
					System.out.println("Its a " + d );
				break;
				}
					
				default:{
					System.out.println("next day is Sunday");
			}
		}
		
	}
	}
}
