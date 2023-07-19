package com.obsqura.TestNGframework;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TableHead extends Base{
@Test

	public void table()
	{   
	    List <String> namelist = new ArrayList<>();
		driver.navigate().to("https://selenium.obsqurazone.com/table-pagination.php");
		WebElement table = driver.findElement(By.xpath("//table[@id='dtBasicExample']"));
	    List <WebElement> tableHeader = table.findElements(By.xpath("//th[contains(@class,'sorting_disabled')]"));
	    int rowSize=tableHeader.size();
	    List <WebElement> tableColomn = table.findElements(By.xpath("//tr[@class]"));
	    int coloumnSize = tableColomn.size();
	    WebElement coloumnContain = driver.findElement(By.xpath("//td[text()='Ashton Cox']"));
	    boolean nameisDisplayed = coloumnContain.isDisplayed();
	    for(WebElement nameofrow: tableColomn)
	    {
	    	String valueOfRow = nameofrow.getText();
	    	namelist.add(valueOfRow);
	    	
	    }
	    
	    assertTrue(nameisDisplayed, "Ashton Cox not displayed");
	        

	    
	    
	}

}
	

