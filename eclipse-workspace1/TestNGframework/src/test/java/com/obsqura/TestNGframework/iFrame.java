package com.obsqura.TestNGframework;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class iFrame extends Base{
@Test
public void iframe()
{
	driver.navigate().to("https://demo.guru99.com/test/guru99home/");
	int size= driver.findElements(By.tagName("iframe")).size();
	//driver.switchTo().frame(2);
	driver.switchTo().frame("a077aa5e");
	driver.findElement(By.xpath("//img[@src='Jmeter720.png']")).click();
	 driver.switchTo().parentFrame();
	
	
	
}
}
