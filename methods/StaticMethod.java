package com.demo.methods;

public class StaticMethod {
public static int totallength(String a , String b)
{
	return a.length()+ b.length();
}
	public static int averagelength(String a , String b)
	{
		return totallength(a, b)/2;
		
	}
	public static void main(String[] args) {
		int total = totallength("Golden", "Bowl" );
				int average = averagelength ("Golden", "Bowl" );
				System.out.println(total);
				System.out.println(average);

	}

}
