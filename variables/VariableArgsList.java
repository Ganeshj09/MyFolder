package com.demo.variables;

public class VariableArgsList {
	
	static void displayAll (int... test) {
		for (int value : test) {
			System.out.println("Done");
		}
		
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		displayAll(100,200,300);
		displayAll (0,20,40,60,70);
		displayAll();

	}

}
