package com.obsqura.TestNGframework;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
public class MenuOption extends Base {
	@Test
	
	public void menuoption(String menucategory)
	{
		
		List<WebElement>menu=driver.findElements(By.xpath("//li[@class='list-group-item']//a"));
		for(WebElement menuoption:menu)
		{
			String menutext=menuoption.getText();
			if(menucategory.equals(menutext))
			{
				menuoption.click();
				break;
			}
		}
	}
	
	@Test
	public void seleniumDevDropDownButton()
	{
		driver.get("https://www.selenium.dev/");
		String langugemenu="Português (Brasileiro)";
	    WebElement english=driver.findElement(By.xpath("//a[text()='English']"));
	    english.click();
		List<WebElement>menu=driver.findElements(By.xpath("//ul[@class='dropdown-menu show']//a"));
		for(WebElement menuoption:menu)
		{
			String menuText=menuoption.getText();
			if(langugemenu.equals(menuText))
			{
				menuoption.click();
				break;
			}
		}
	}

}
