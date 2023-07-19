package com.automation.assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Commands  {
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
	public void commands() 
	  {
		 String url=driver.getCurrentUrl();
	  }
	public void verifyTitle() 
	  {
		  String expectedtitle="Obsqura Testing";
		  String title=driver.getTitle();
		    if(expectedtitle.equals(title))
		    {
			       System.out.println("verification is passed");
		     }
		    else
		    	System.out.println("verification is failed");
			
	}
    
	public static void main(String[] args) {
		Commands commands=new Commands();
	    commands.intialiseBrowser();
		commands.commands();
		commands.verifyTitle();
		commands.browserCloseorQuit();
	}

}
