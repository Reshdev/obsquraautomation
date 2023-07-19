package com.obsqura.TestNGframework;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Alerts extends Base{
	@Test
	public void alerts()
	{
		 driver.navigate().to("https://selenium.obsqurazone.com/javascript-alert.php");
	     WebElement clickme=driver.findElement(By.xpath("//button[@class='btn btn-success']"));
	     clickme.click();
	     driver.switchTo().alert().accept();
	}
	@Test
	 public void confirmAlert()
	 {
		 driver.navigate().to("https://selenium.obsqurazone.com/javascript-alert.php");
	     WebElement clickme2= driver.findElement(By.xpath("//button[@class='btn btn-warning']"));
	     clickme2.click();
	     driver.switchTo().alert().accept();
	     WebElement message=driver.findElement(By.xpath("//p[@id='confirm-demo']"));
	     String expectedConfimMessage="You pressed OK!";
	     String actualConfirmMessage=message.getText();
	     assertEquals(expectedConfimMessage, actualConfirmMessage , "Not displayed You pressed Ok!");
	     clickme2.click();
	     driver.switchTo().alert().dismiss();
	     String expectedConfimMessage2="You pressed Cancel!";
	     String actualConfirmMessage2=message.getText();
	     assertEquals(expectedConfimMessage2, actualConfirmMessage2, "not displayed you pressed cancel");
	 }
	@Test
	 public void promtAlert()
	 {
		 driver.navigate().to("https://selenium.obsqurazone.com/javascript-alert.php");
	     String textEnter="RESHMA";
	     WebElement clickForPromtBox=driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
	     clickForPromtBox.click();
	     driver.switchTo().alert().getText();
	     driver.switchTo().alert().sendKeys(textEnter);
	     driver.switchTo().alert().accept();
	     WebElement promtMessage=driver.findElement(By.xpath("//p[@id='prompt-demo']"));
	     String expectedPromtMessage="You have entered '"+textEnter+"' !";
	     String actualPromtMessage=promtMessage.getText();
	     assertEquals(expectedPromtMessage, actualPromtMessage,"Not Display You have entered 'RESHMA' !");
	     clickForPromtBox.click();
	     driver.switchTo().alert().dismiss();
	     
	     
	}

}
