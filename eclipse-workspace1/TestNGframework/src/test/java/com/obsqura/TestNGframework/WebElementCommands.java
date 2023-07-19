package com.obsqura.TestNGframework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class WebElementCommands extends Base {
	@Test
	public void webElementCommands()
	{
		WebElement singleInputField=driver.findElement(By.xpath("//input[@id='single-input-field']"));
		singleInputField.sendKeys("HELLO");
		WebElement showButton=driver.findElement(By.xpath("//button[@id='button-one']"));
		showButton.click();
		WebElement yourMessage=driver.findElement(By.xpath("//div[@id='message-one']"));
		String yourMessageText=yourMessage.getText();
		String yourMessageTag=yourMessage.getTagName();
		String showButtonClassName=showButton.getAttribute("class");
		singleInputField.clear();
		boolean isShowButtonDisplayed=showButton.isDisplayed();
		boolean isShowButonEnabled=showButton.isEnabled();
		String backgroundColorofShowButton=showButton.getCssValue("background-color");	
		String borderColorofShowButton=showButton.getCssValue("border-color");
		String fontColorofShowButton=showButton.getCssValue("color");
		String fontWeightofShowButton=showButton.getCssValue("font-weight");
		int showButtonXaxis=showButton.getLocation().getX();
		int showButtonYaxis=showButton.getLocation().getY();
		int singleInputFieldXaxis=singleInputField.getLocation().getX();
		int singleInputFieldYaxis=singleInputField.getLocation().getY();
		int showButtonHeight=showButton.getSize().getHeight();
		int showButtonWidth=showButton.getSize().getWidth();
	}
	@Test
	public void webCommands()
	{
		WebElement enterValueA=driver.findElement(By.xpath("//input[@id='value-a']"));
		enterValueA.sendKeys("23");
		WebElement enterValueB=driver.findElement(By.xpath("//input[@id='value-b']"));
		enterValueB.sendKeys("45");
		WebElement getTotal=driver.findElement(By.xpath("//button[@id='button-two']"));
		getTotal.click();
		WebElement total=driver.findElement(By.xpath("//div[@id='message-two']"));
		String totalText=total.getText();
		String getTotalId=getTotal.getAttribute("id");
		String getTotalClassName=getTotal.getAttribute("class");
		String getTotalText=getTotal.getText();
		String getTotalBoxSize=getTotal.getCssValue("box-sizing");
		String getTotalBorderRadius=getTotal.getCssValue("border-radius");
		boolean isGetTotalDisplayed=getTotal.isDisplayed();
		boolean isGetTotalEnabled=getTotal.isEnabled();
		
		
	}

}
