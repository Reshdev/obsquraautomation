package com.obsqura.TestNGframework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionClass extends Base {
	@Test
	public void actionClass()
	{
	   driver.navigate().to("https://selenium.obsqurazone.com/drag-drop.php");
	   WebElement draggableNzeroOne = driver.findElement(By.xpath("//span[text()='Draggable n°1']"));
	   Actions action = new Actions(driver);
	   action.moveToElement(draggableNzeroOne).click();//single click
	   action.moveToElement(draggableNzeroOne).build().perform();// mouse over
	   action.doubleClick(draggableNzeroOne).perform();  // double click
	   action.contextClick(draggableNzeroOne).perform();  //right click
	   WebElement destination = driver.findElement(By.xpath("//div[@id='mydropzone']"));
	   action.dragAndDrop(draggableNzeroOne, destination).build().perform();
	   int xAxis = destination.getLocation().getX();
	   int yAxis = destination.getLocation().getY();
	   action.dragAndDropBy(draggableNzeroOne, xAxis, yAxis);
	   
	   
	   
	   
	}

}
