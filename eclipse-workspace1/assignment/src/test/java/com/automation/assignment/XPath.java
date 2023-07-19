package com.automation.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPath {
	public  WebDriver driver;
	public void initialiseBrowser()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\eclipse-workspace1\\assignment\\src\\main\\java\\Resources\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
	    
	 }
	public void dynamicXPath()
	{
		driver.findElement(By.xpath("//span[contains(@class,'navbar-toggler-icon')]"));
		driver.findElement(By.xpath("//button[text()='Get Total']"));
		driver.findElement(By.xpath("//input[starts-with(@id,'value-b')]"));
	//	driver.findElements(By.xpath(null))
	}
	
	public static void main(String[] args)
	{
		XPath xpath=new XPath();
		xpath.initialiseBrowser();
		xpath.dynamicXPath();
	}

}
