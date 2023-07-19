package com.obsqura.TestNGframework;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class CheckBoxDemo extends Base{
	@Test
	public void verifyCheckBoxDemo()
	{
		
		MenuOption menuoption=new MenuOption();
		menuoption.menuoption("Checkbox Demo");
		WebElement checkBox=driver.findElement(By.xpath("//input[@id='gridCheck']"));
		checkBox.click();
		boolean isCheckBoxisSelected=checkBox.isSelected();
		assertTrue(isCheckBoxisSelected, "Check box is not selected ");
	}
	@Test
	
	public void verifySelectAllButtonOfmultipleCheckBoxDemo()
	{
		driver.navigate().to("https://selenium.obsqurazone.com/check-box-demo.php");
	    WebElement selectAll=driver.findElement(By.xpath("//input[@id='button-two']"));
	    String selectAllButton= selectAll.getAttribute("value");
	    selectAll.click();
	    String unselectAllButton=selectAll.getAttribute("value");
	    boolean flag=true;
	    if (selectAllButton.equals(unselectAllButton))
	    {
			flag=false;
		}
	   assertTrue(flag, "selected all button is not renamed as unselected all");
	 
}
}
