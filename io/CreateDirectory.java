package com.demo.io;

import java.io.File;

public class CreateDirectory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreatADirectory("Testdir1");


	}
	public static void CreatADirectory(String DictoryName)
	{
		String WorkingDirectory = System.getProperty("user.dir");
		String dir = WorkingDirectory + File.separator + DictoryName;
		System.out.println("Final File directory :" + dir);


		File file = new File (dir);
		if (!file.exists()){
			file.mkdir();
			System.out.println("Directory is Created");
		} else
			System.out.println("Directory is alredy exist");
	}
}
