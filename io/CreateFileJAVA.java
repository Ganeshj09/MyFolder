package com.demo.io;

import java.io.File;
import java.io.IOException;

public class CreateFileJAVA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreateNewFIle("test1.txt");
	}


	public static void CreateNewFIle(String filename) {
		
	String filePath = System.getProperty("user.dir");
	File file = new File (filePath + "\\" + filename);
	
	try {
		if (!file.exists()){
			file.createNewFile();
			System.out.println("File is created");
		}else {
			System.out.println("File alredy exist");
		}
	}
	catch (IOException e ) {
			e.printStackTrace();
		}
	}

}
