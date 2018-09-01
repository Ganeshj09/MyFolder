package com.demo.flowcontrol;

public class Switchstatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i=0; i <= 2; i++)
		{
			switch (i)
			
			{
			case 1:{
			System.out.println("Öne:" + i);
			}
			case 2:
			case 3 :{
				System.out.println("Two or Three:" + i);
				break;
			}
			default:{
				System.out.println("Default Case:" + i);
			}
			}
		}

	}

}
