package com.demo.eExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javax.imageio.stream.FileImageInputStream;
import javax.swing.plaf.metal.MetalIconFactory.FileIcon16;

public class TryCatch {
	public static void main (String args[]) {

		try{
			int data = 50/0 ;
		} catch (Exception e)

		{
			System.out.println("e");}
		System.out.println("rest of the code");

	}	
	public void m1 () throws FileNotFoundException {
		FileInputStream FIS = new FileInputStream("D:/Docs/MAE Test cases-Sprint 4.xlx");	
		try {
			throw new Exception ("not valid");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}





