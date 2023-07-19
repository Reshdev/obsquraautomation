package com.Obsqura.rmartSupermarket;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base {
	       public WebDriver driver;
 @BeforeMethod
	       public void intialiseBrowser()
	         {
	 	        System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\eclipse-workspace1\\7rmartSupermarket\\src\\main\\java\\resource\\chromedriver.exe");
	 	        driver=new ChromeDriver();
	 	        driver.get("https://groceryapp.uniqassosiates.com/admin");
	         }
 @AfterMethod  
	       public void browserCloseorQuit()
	       {
	    	  
	    	   driver.quit();
	       }
	    	   

}
