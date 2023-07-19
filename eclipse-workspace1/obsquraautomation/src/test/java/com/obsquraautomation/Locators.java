package com.obsquraautomation;

import org.openqa.selenium.By;

public class Locators extends Base {
	
   public void locateById()
   {
	   driver.findElement(By.id("button-one"));
	   driver.findElement(By.className("navbar-nav"));
	   driver.findElement(By .linkText("Checkbox Demo"));
	   driver.findElement(By.partialLinkText("Radio Buttons"));
	   driver.findElement(By.cssSelector("button#button-one")) ;
	   driver.findElement(By.cssSelector("ul.navbar-nav"));
	   driver.findElement(By.cssSelector("button[id=button-one]"));
	   driver.findElement(By.cssSelector("button.navbar-toggler[type=button]"));
	   driver.navigate().to("https://selenium.obsqurazone.com/date-picker.php");
	   driver.findElement(By.name("daterange"));
   
   
    }
    public void locateXPath()
    {
    	driver.findElement(By.xpath("//button[@id='button-one']"));          //basic xpath
    	driver.findElement(By.xpath("//button[contains(@id,'button-one')]"));      //contains()
    	//driver.findElement(By.xpath("//button[text()='Show Message']"));     //text()
    	driver.findElement(By.xpath("//button[starts-with(@id,'button-one')]"));        //starts-with
    	driver.findElement(By.xpath("//button[@id='button-one'and @type='button']"));  //and
    	driver.findElement(By.xpath("//button[@data-toggle='collapse'or @class='navbar-toggler']"));
    	driver.findElement(By.xpath("//button[contains(text(),'Show')]")); //or
    }
    public void axesXpath()
    {
    	driver.findElement(By.xpath("//a[@class='navbar-brand']//child::img[@alt='logo']"));    //child method
    	driver.findElement(By.xpath("//button[@id='button-one']//parent::form"));  
    	driver.findElement(By.xpath("//button[@id='button-one']//following::button[@id='button-one']"));//parent method
        driver.findElement(By.xpath("//button[@id='button-one']//preceding::div[@class='mb-sec']"));
        driver.findElement(By.xpath("//button[@id='button-one']//ancestor::div[@class='card-body']")) ; 
        driver.findElement(By.xpath("//form[@method='POST']//descendant::div[@id='message-one']"));
        driver.findElement(By.xpath("(//form[@method='POST'])[1]"));
        
        
    }
    
	public static void main(String[] args) {
		Locators locators=new Locators();
		locators.intialiseBrowser();
		locators.locateById();
		locators.locateXPath();
		locators.axesXpath();
		locators.browserCloseorQuit();
		

	}

}
