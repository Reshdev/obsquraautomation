package com.obsqura.TestNGframework;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNull;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
public class AssertionA extends Base{
	@Test
public void verifySingleInputFieldwhenEnterDataOnTextFieldAndClickOnShowMessageButton()
     {
		 
		String textfieldinput="HELLO";
		String expectedMessage="Your Message : " +textfieldinput;
		WebElement singleInputField=driver.findElement(By.xpath("//input[@id='single-input-field']"));
		singleInputField.sendKeys(textfieldinput);
		WebElement showButton=driver.findElement(By.xpath("//button[@id='button-one']"));
		showButton.click();
		WebElement yourMessage=driver.findElement(By.xpath("//div[@id='message-one']"));
		String yourMessageText=yourMessage.getText();
		assertEquals(expectedMessage ,yourMessageText ,"Your Message is Not "+expectedMessage);
	}
	@Test
	public void assertTrueSample()
	{
		String expectedvalue="abc";
		String actualvalue="abc";
		boolean flag=false;
		if(expectedvalue.equals(actualvalue))
		{
			flag=true;
		}
		assertTrue(flag,"expected and actual values are not same");
	}
	@Test
	public void assertFalseSample()
	{
		boolean flag=false;
		assertFalse(flag," falg is true");
		
	}
	@Test
	public void assertNullSample()
	{
		String value=null;
		assertNull(value, "value is not null");
	}
	@Test
	public void assertNotNullSample(String value2, String string)
	{
		String value="abc";
	   assertNotNullSample(value,"value is not null");
	}
  @Test
  
	public void softAssert()
	{
		String value1="abc";
		String value2="123";
		SoftAssert softassert=new SoftAssert();
		softassert.assertNull(value1, "value is not null");
	    softassert.assertNotNull(value2,"value is not null");
		softassert.assertAll();
	}

	@Test
	public void verifyBackgroundColorOfShowMessgeButton()
	{
		String expectedBackgroundcolor="rgba(0, 123, 255, 1)";
		WebElement showButton=driver.findElement(By.xpath("//button[@id='button-one']"));
		String backgroundColorofShowButton=showButton.getCssValue("background-color");
		assertEquals(backgroundColorofShowButton , expectedBackgroundcolor ,"Background Colour is Not "+expectedBackgroundcolor);
	}
	@Test
	public void verifyFontWeightOfShowMessageButton()
	{
		String expectedWeight="400";
		WebElement showButton=driver.findElement(By.xpath("//button[@id='button-one']"));
		String fontWeightOfShowButton=showButton.getCssValue("font-weight");
		assertEquals(fontWeightOfShowButton , expectedWeight , "Font weight is not"+expectedWeight);
	}
	@Test
	public void verifyColorOfShowButton()
	{
		String expectedColor="rgba(255, 255, 255, 1)";
		WebElement showButton=driver.findElement(By.xpath("//button[@id='button-one']"));
		String colorOfShowButton=showButton.getCssValue("color");
		assertEquals(colorOfShowButton , expectedColor, "color is not"+expectedColor);
		
	}
	@Test
	public void verifyShowMessageButtonText()
	{
		String expectedTextOfShowButton="Show Message";
		WebElement showButton=driver.findElement(By.xpath("//button[@id='button-one']"));
		String textOfShowButton=showButton.getText();
		assertEquals(textOfShowButton , expectedTextOfShowButton , "text of showmessage button not"+expectedTextOfShowButton);
		
	}
	@Test
	public void verifyShowButtonDisplayed()
	{
		String expectedTextOfShowButton="Show Message";
		WebElement showButton=driver.findElement(By.xpath("//button[@id='button-one']"));
		boolean flag=false;
		if(expectedTextOfShowButton.equals(showButton.isDisplayed()));
		{
			flag=true;
		}
		assertTrue(flag, "expected and actual values ara not same");
	}
	
	
	@Test
	public void  verifyTwoInputFieldwhenEnterDataOnTextFieldAndClickOnGetTotalButton()
	{
		int textInputFieldA= 23;
		int textInputFieldB= 48;
		String inputFieldA=String.valueOf(textInputFieldA);
		String inputFieldB=String.valueOf(textInputFieldB);
		String total=String.valueOf(textInputFieldA + textInputFieldB);
		String expectedtotal="Total A + B : "+total;
		WebElement enterValueA=driver.findElement(By.xpath("//input[@id='value-a']"));
		enterValueA.sendKeys(inputFieldA);
		WebElement enterValueB=driver.findElement(By.xpath("//input[@id='value-b']"));
		enterValueB.sendKeys(inputFieldB);
		WebElement getTotal=driver.findElement(By.xpath("//button[@id='button-two']"));
		getTotal.click();
		WebElement gettotal=driver.findElement(By.xpath("//div[@id='message-two']"));
		String actualtotal=gettotal.getText();
		assertEquals(actualtotal , expectedtotal , " actual total not equal to "+expectedtotal );
		
	}
	@Test
	
    public void verifyWhethertheTextFieldEnterValueAAllinedAboveEnterValueBTextField()
    {
    	WebElement enterValueA=driver.findElement(By.xpath("//input[@id='value-a']"));
    	int inputFieldAYaxis=enterValueA.getLocation().getY();
		WebElement enterValueB=driver.findElement(By.xpath("//input[@id='value-b']"));
		int inputFieldBYaxis=enterValueB.getLocation().getY();
		boolean flag=false;
		if (inputFieldAYaxis<inputFieldBYaxis)
		{
			flag=true;
		}
			assertTrue(flag, "ENTER VALUE A TEXT FIELD ALLINED  NOT ABOVE ENTER VALUE B");
    }
	@Test
	public void verifyHeightAndWidthOfShowMessageButton()
	{
		WebElement showButton=driver.findElement(By.xpath("//button[@id='button-one']"));
		int showButtonHeight=showButton.getSize().getHeight();
		int showButtonWidth=showButton.getSize().getWidth();
		boolean flag=false;
		if (showButtonHeight<showButtonWidth)
		{
			flag=true;
		}
		 assertTrue(flag,"HEIGHT OF SHOW MESSAGE BUTTON IS HIGHER THAN  ITS WIDTH");
	}
	@Test
	public void verifyPageSourceOfObsquraAndTheWordAmazonNotSeenInThisPage()
	{
		String pagesource=driver.getPageSource();
		boolean getpagesource=Boolean.valueOf(pagesource);
		assertFalse(getpagesource, "page source contain AMAZON word");
		
	}
	
}
