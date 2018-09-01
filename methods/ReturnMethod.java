package com.demo.methods;

public class ReturnMethod {
	static String name;
	static int monthlySalary;


	static String getEmpName(String name) {
		return name;
	}
	static int getSalaryDetails(int monthlySalary ) {
		return monthlySalary;
	}
	static boolean getJobStatus() {
		return true;
	}
	public static void main(String[] args) {
		if(getJobStatus()){
			name = getEmpName(name);
			monthlySalary=getSalaryDetails(monthlySalary);
			System.out.println("Emp name is "+name);
			System.out.println("Emp salary is "+monthlySalary);
		}else{
			System.out.println("The employee Mr. "+ getEmpName(name) +"is no more associated with the company ");

		}
	}

}

