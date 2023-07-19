package com.obsqura.AssignmentTestNG;


import org.openqa.selenium.WebDriver;
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

public class SampleTestNGannotations {
	 public WebDriver driver;
	@BeforeSuite 
     public void beforeSuite()
       {
	        System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\eclipse-workspace\\Maven_Automation\\src\\main\\java\\Resources\\chromedriver.exe");
	        driver=new ChromeDriver();
	       
       }
	@BeforeTest
	 public void beforeTest()
	 {
		 driver.get("https://selenium.obsqurazone.com/simple-form-demo.php"); 
		 System.out.println("before test");
	 }
	
	 @Test
	public void testCase1()
	{  // WebElement singleInputField=driver.findElement(By.xpath("//input[@id='single-input-field']"));
	   // singleInputField.sendKeys("HELLO");
		System.out.println("testcase1");
	}
	@Test
	public void testCase2()
	{
		System.out.println("testcase2");
	}
	@BeforeMethod
	public void beforeMethod()
	{   driver.navigate().to("https://www.amazon.in/");
		System.out.println("beforemethod");
	}
	@AfterMethod
	public void afterMethod()
	{    driver.navigate().refresh();
		System.out.println("aftermethod");
	}
	@AfterClass
	public void afterclass()
	{
		System.out.println("afterclass");
		driver.quit();
	}
	@BeforeClass
	public void beforeclass()
	{   
		driver.get("https://selenium.obsqurazone.com/simple-form-demo.php"); 
		
		System.out.println("beforeclass");
	}

	@AfterTest
	public void aftertest()
	{   System.out.println("report generated");
		
	}
	
	@AfterSuite
	public void aftersuit()
	{
		System.out.println("aftersuit");
	
	}
}
// WebElement multipleCheckBox=driver.findElement(By.xpath("//input[@class='check-box-list']//ancestor::div[@class='form-group']"));
// boolean multipleCheckBoxisSelected=multipleCheckBox.isSelected();
	
	
	
	
	
	
	
	
	

    
     

