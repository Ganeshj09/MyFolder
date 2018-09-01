package com.demo.flowcontrol;

public class DoWhileLoop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		int i =11;
		while (i <=10) {
			System.out.println("Line" +i);


		}

		/****Dowhile***/


		do {
			System.out.println(i+"Is the value variable");
			i = i+1;
Thread.sleep(0);
} while(i<10);
	}

}
