package com.obsqura.TestNGframework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LocatorTime extends Base {
@Test

      public void locateByClass()//6915ms
     {
	    WebElement enterMessage=driver.findElement(By.className("form-control"));
	
	 }
@Test
     public void locateById()//6210ms
     {
	   WebElement enterMessage=driver.findElement(By.id("single-input-field")); 
     }
@Test
     public void locateByCcSelector()//6737ms
     {
	    WebElement enterMessage=driver.findElement(By.cssSelector("input.form-control"));
     }
@Test
     public void locateByXpath()//6680ms
     {
	     WebElement enterMessage=driver.findElement(By.xpath("//input[@id='single-input-field']"));
     }
}
