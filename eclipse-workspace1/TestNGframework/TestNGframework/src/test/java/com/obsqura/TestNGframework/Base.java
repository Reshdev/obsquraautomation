package com.obsqura.TestNGframework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;





public class Base {
	  public WebDriver driver;
@BeforeMethod
      public void intialiseBrowser()
        {
	        System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\eclipse-workspace\\Maven_Automation\\src\\main\\java\\Resources\\chromedriver.exe");
	        driver=new ChromeDriver();
	        driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
        }
 @AfterMethod  
      public void browserCloseorQuit()
      {
   	  
   	   driver.quit();
      }
   	   
}
