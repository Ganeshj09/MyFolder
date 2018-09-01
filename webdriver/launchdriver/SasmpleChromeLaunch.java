package com.demo.webdriver.launchdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SasmpleChromeLaunch {
static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver" ,"D:\\Grid\\chromedriver_win32\\chromedriver.exe");
driver = new ChromeDriver();
String baseurl ="https://www.google.com/";


	}

}
