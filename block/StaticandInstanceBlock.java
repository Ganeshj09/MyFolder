package com.demo.block;

public class StaticandInstanceBlock {
	int speed;
	static	String city = "Delhi";

	public StaticandInstanceBlock () {
		System.out.println("Speed is of a car is "+speed+" and test drive city is "+ city);
	}
	//Instance block*// 1st run
	{ 
		speed = 120;
		System.out.println("Ïnstace block executed");
	}
	
	static {//static block 2nd run
		city = "Mumbai";
		System.out.println("Static block executed");
	}
	public static void main(String[] args) { //main method - 3rd run
		// TODO Auto-generated method stub
		StaticandInstanceBlock c1 =new StaticandInstanceBlock();

	}

}
