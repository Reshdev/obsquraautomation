package com.obsqura.TestNGframework;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Dropdown extends Base {
	@Test
	public void dropDownUsingSelectClass()
	{
		driver.navigate().to("https://selenium.obsqurazone.com/select-input.php");
		WebElement dropDown=driver.findElement(By.xpath("//select[@id='single-input-field']"));
		Select select=new Select(dropDown);
		select.selectByVisibleText("Yellow");
		select.selectByValue("Red");
		select.selectByIndex(3);
		List<WebElement> options=select.getOptions();
		int size=options.size();
		WebElement multipleDropDown=driver.findElement(By.xpath("//select[@id='multi-select-field']"));
        Select select2=new Select(multipleDropDown);
        boolean isMultipleSelect=select2.isMultiple();
     	select2.selectByVisibleText("Yellow");
     	select2.deselectAll();
		select2.selectByValue("Red");
	}
	
}
