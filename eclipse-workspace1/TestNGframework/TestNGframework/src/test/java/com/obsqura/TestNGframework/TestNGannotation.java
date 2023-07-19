package com.obsqura.TestNGframework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGannotation {
	public WebDriver driver;
	@Test
	public void testCase1()
	{  
		System.out.println("testcase1");
	}
	@Test
	public void testCase2()
	{
		System.out.println("testcase2");
	}
	@BeforeMethod
	public void beforeMethod()
	{  
		System.out.println("beforemethod");
	}
	@AfterMethod
	public void afterMethod()
	{    
		System.out.println("aftermethod");
	}
	@AfterClass
	public void afterclass()
	{
		System.out.println("afterclass");
		
	}
	@BeforeClass
	public void beforeclass()
	{   
		
		System.out.println("beforeclass");
	}
	@BeforeTest
	public void beforetest()
	{
		
		System.out.println("beforetest");
	}
	@AfterTest
	public void aftertest()
	{  
		System.out.println("aftertest");
	}
	@BeforeSuite
	public void beforesuit()
	{
		
         System.out.println("beforesuit");
	
	}
	@AfterSuite
	public void aftersuit()
	{
		System.out.println("aftersuit");
	
	}
}
