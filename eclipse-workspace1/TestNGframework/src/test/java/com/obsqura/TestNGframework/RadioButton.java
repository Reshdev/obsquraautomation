package com.obsqura.TestNGframework;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class RadioButton extends Base
{
	@Test
	public void verifyRadioButton()
	{
		driver.navigate().to("https://selenium.obsqurazone.com/radio-button-demo.php");
		WebElement maleRadioButton=driver.findElement(By.xpath("//input[@id='inlineRadio1']"));
		maleRadioButton.click();
		boolean maleRadioButtonisSelected=maleRadioButton.isSelected();
		assertTrue(maleRadioButtonisSelected, "Male Radio Button Not Selected");
	
        WebElement femaleRadioButton=driver.findElement(By.xpath("//input[@id='inlineRadio2']"));
		femaleRadioButton.click();
		boolean femaleRadioButtonisSelected=femaleRadioButton.isSelected();
		assertTrue(femaleRadioButtonisSelected, "Female Radio Button is Not Selected");
	}
	@Test
	 public void verifySelectedButtonsOfgroupRadioButton()
	 {
		driver.navigate().to("https://selenium.obsqurazone.com/radio-button-demo.php");
		WebElement patientMaleRadioButton=driver.findElement(By.xpath("//input[@id='inlineRadio11']"));
		patientMaleRadioButton.click();
		boolean patientMaleRadioButtonisSelected=patientMaleRadioButton.isSelected();
		
		WebElement patientFemaleRadioButton=driver.findElement(By.xpath("//input[@id='inlineRadio21']"));
		patientFemaleRadioButton.click();
		boolean patientFemaleRadioButtonisSelected=patientFemaleRadioButton.isSelected();
		
    	WebElement patientAgeGroup1=driver.findElement(By.xpath("//input[@id='inlineRadio22']"));
		patientAgeGroup1.click();
		boolean patientAgeGroup1isSelected=patientAgeGroup1.isSelected();
		
		WebElement patientAgeGroup2=driver.findElement(By.xpath("//input[@id='inlineRadio23']"));
		patientAgeGroup2.click();
		boolean patientAgeGroup2isSelected=patientAgeGroup2.isSelected();
		
		WebElement patientAgeGroup3=driver.findElement(By.xpath("//input[@id='inlineRadio24']"));
		patientAgeGroup3.click();
		boolean patientAgeGroup3isSelected=patientAgeGroup3.isSelected();
		
		assertTrue(patientMaleRadioButtonisSelected, "Patient Male Radio Button is Not Selected");
		assertTrue(patientFemaleRadioButtonisSelected, "Patient Female Radio Button is Not Selected");
		assertTrue(patientAgeGroup1isSelected, "Patient Age Group 1 to 18 is Not Selecetd");
		assertTrue(patientAgeGroup2isSelected, "Patient Age Group 99 to 44 is Not Selecetd");
		assertTrue(patientAgeGroup3isSelected, "Patient Age Group 45 to 60 is Not Selecetd");
		
		
		
	}

}
