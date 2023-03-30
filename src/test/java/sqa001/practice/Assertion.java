package sqa001.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertion extends Basedriver{
	
	String url = "https://evaly.com.bd/";
	
	@Test
	public void assretioneg() throws InterruptedException {
		Driver.get(url);
		Driver.manage().window().maximize();
		Thread.sleep(7000);
		
		String expectedTitle = "Evaly | Online shopping platform";
		String actualTitle = Driver.getTitle();
		
//		Assert.assertEquals(actualTitle, expectedTitle);
		
		SoftAssert SA = new SoftAssert();
		SA.assertEquals(actualTitle, expectedTitle);
		
		WebElement shopsButton = Driver.findElement(By.xpath("//p[contains(text(),'Shops')]"));
		shopsButton.click();
		Thread.sleep(5000);
		
		SA.assertAll();
		}
}
