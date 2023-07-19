package com.automation.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Element  {
	public WebDriver driver;
	 public void intialiseBrowser()
     {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\eclipse-workspace\\Maven_Automation\\src\\main\\java\\Resources\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
     }
	public void element()
	{
		driver.findElement(By.id("single-input-field"));
		driver.findElement(By.className("header-top"));
		driver.findElement(By.className("navbar-brand"));
		driver.findElement(By.linkText("Jquery Select2"));
		driver.findElement(By.linkText("Simple Form Demo"));
		driver.findElement(By.name("keywords"));
		
		driver.findElement(By.xpath("//button[@class='navbar-toggler']"));
		driver.findElement(By.xpath("//span[contains(@class,'navbar-toggler-icon')]"));
		driver.findElement(By.xpath("//button[contains(text(),'Get')]"));
		driver.findElement(By.xpath("//input[starts-with(@id,'value')]"));
		driver.findElements(By.xpath("//button[@type='button'  and @id='button-two' ]"));
		driver.findElement(By.xpath("//button[@class='navbar-toggler'or @data-toggle='collapse' ]"));
		
		driver.findElement(By.xpath("//div[@class='header-top']//child::img[@alt='logo']"));
		driver.findElement(By.xpath("//div[@class='form-group']//parent::label[@for='inputEmail4']"));
		driver.findElement(By.xpath("//div[@class='form-group']//following::input[@placeholder='Message']"));
		driver.findElement(By.xpath("//div[@class='container page']//preceding::div[@class='collapse navbar-collapse']"));
	    driver.findElements(By.xpath("//button[@id='button-one']//ancestor::div[@class='card']"));
	    driver.findElement(By.xpath("//div[@class='card']//descendant::div[@id='message-two']"));
	    driver.findElement(By.xpath(("//div[@class='card'])[1]")));
		driver.findElement(By.xpath("//div[@id='message-two']//parent::form"));
	}
	public void find()
	{
		driver.navigate().to("https://selenium.obsqurazone.com/check-box-demo.php");
	    driver.findElement(By.className("form-check-input"));
		driver.findElement(By.id("gridCheck"));
		driver.findElement(By.partialLinkText("Ajax Form" ));
		driver.findElement(By.name("description"));
		driver.findElement(By.cssSelector("input#check-box-three"));
		driver.findElement(By.cssSelector("input.form-check-input"));
		driver.findElement(By.cssSelector("label[for=gridCheck]"));
		driver.findElement(By.cssSelector("label.form-check-label[for=check-box-one]"));
		driver.findElement(By.xpath("//div[@class='header-top']"));
		
		driver.findElement(By.xpath("//input[contains(@type,'button')]"));
		driver.findElement(By.xpath("//div[contains(text(), 'Single')]"));
		driver.findElement(By.xpath(("//input[starts-with(@id,'gridCheck')]")));
		driver.findElement(By.xpath("//input[(@id='gridCheck' and@type='checkbox')]"));
		driver.findElement(By.xpath("//input[@type='hidden' or@value='false']"));
		
		driver.findElement(By.xpath("//input[@type='hidden']//parent::form"));
		driver.findElement(By.xpath("//form[@method='POST']//child::input[@id='gridCheck']"));
		driver.findElement(By.xpath("//form[@method='POST']//following::input[@id='gridCheck']"));
		driver.findElement(By.xpath("//form[@method='POST']//preceding::input[@id='is_checked']"));
		driver.findElement(By.xpath("//form[@method='POST']//ancestor::div[@class='row']"));
		driver.findElement(By.xpath("//form[@method='POST']//descendant::input[@type='button']"));
		driver.findElement(By.xpath(("//form[@method='POST'])[2]")));
		
		
		driver.navigate().to("https://selenium.obsqurazone.com/radio-button-demo.php");
		driver.findElement(By.className("top-logo"));
		driver.findElement(By.id("inlineRadio11"));
		driver.findElement(By.partialLinkText("Jquery"));
	   	driver.findElement(By.cssSelector("button#button-one"));
		driver.findElement(By.cssSelector("button.navbar-toggler"));
		driver.findElement(By.cssSelector("button[Class=navbar-toggler]"));
		driver.findElement(By.cssSelector("button.navbar-toggler[type=button]"));
		driver.findElement(By.xpath("//footer[@class='mt-5']"));
		
	    driver.findElement(By.xpath("//div[@class='card']//parent::ul[@class='list-group list-group-flush']"));
	    driver.findElement(By.xpath("//div[@class='header-top']//child::div[@class='row']"));
	    driver.findElement(By.xpath("//div[@class='header-top']//following::div[@class='top-logo']"));
	    driver.findElement(By.xpath("//section[@class='clearfix']//preceding::div[@class='mb-sec']"));
	    driver.findElement(By.xpath("//section[@class='clearfix']//ancestor::div[@class='row']"));
	    driver.findElement(By.xpath("//div[@class='mb-sec']//descendant::div[@class='row']"));
	    driver.findElement(By.xpath(("//div[@class='example my-3'])[2]")));
	
		driver.navigate().to("https://selenium.obsqurazone.com/form-submit.php");
		driver.findElement(By.className("form-check-input"));
		driver.findElement(By.id("message-one"));
		driver.findElement(By.cssSelector("span#inputGroupPrepend"));
		driver.findElement(By.cssSelector("input.form-check-input"));
		driver.findElement(By.cssSelector("button[type=submit]"));
		driver.findElement(By.cssSelector("input.form-check-input[type=checkbox]"));
		
		driver.findElement(By.xpath("//span[@id='inputGroupPrepend']"));
		driver.findElement(By.xpath("//span[contains(@class,'input-group-text')]"));
		driver.findElement(By.xpath("//input[starts-with(@placeholder,'Username')]"));
	
		driver.navigate().to("https://selenium.obsqurazone.com/select-input.php");
		driver.findElement(By.className("clearfix"));
		driver.findElement(By.id("button-all"));
		driver.findElement(By.partialLinkText( "Input"));
		driver.findElement(By.cssSelector("select#multi-select-field"));
		driver.findElement(By.cssSelector("div.mb-sec"));
		driver.findElement(By.cssSelector("button[data-toggle=collapse]"));
		driver.findElement(By.cssSelector("div.my-2[id=message-one]"));
		driver.findElement(By.xpath("//select[@id='multi-select-field']"));
	}
	
	    public static void main(String[] args)
	{
		Element element=new Element();	
		element. intialiseBrowser();
		element.element();
		element.find();
		
	}

}
