package com.automation.assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseSample {
	    public WebDriver driver;
       public void intialiseBrowser()
         {
	        System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\eclipse-workspace\\Maven_Automation\\src\\main\\java\\Resources\\chromedriver.exe");
	        driver=new ChromeDriver();
	        driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
         }
     
      public void browserCloseorQuit()
       {
    	  
    	   driver.quit();
    	   
       }
      
}