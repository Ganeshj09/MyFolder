package com.demo.methods;

public class ProtectedMethod {
protected void UserNameDispplay () {
	System.out.println("MR. peter user name is peter@GM");
}

private void PasswordDisplay () {
	System.out.println("MR. peter apssword is Mypass@GM");
}
public static void main (String[] args) {
	ProtectedMethod premethod = new ProtectedMethod();
	premethod.UserNameDispplay();
	premethod.PasswordDisplay();
}



}