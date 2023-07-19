package com.automation.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AssertionSample extends BaseSample{
	public void verifySingleInputFieldWhenDataEnterToTheTextFieldAndClickShowMessageButton()
	{
		String textfieldInput="hello";
		String expectedMessage="Your Message : "+textfieldInput;
		WebElement singleInputField=driver.findElement(By.xpath("//input[@id='single-input-field']"));
		singleInputField.sendKeys(textfieldInput);
		WebElement showButton=driver.findElement(By.xpath("//button[@id='button-one']"));
		showButton.click();
		WebElement yourMessage=driver.findElement(By.xpath("//div[@id='message-one']"));
		String actualMessage=yourMessage.getText();
		
		
	}

}
