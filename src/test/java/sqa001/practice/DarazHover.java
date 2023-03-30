package sqa001.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DarazHover extends Basedriver{
	
	String url = "https://www.daraz.com.bd/";
	
	@Test
	public void assretioneg() throws InterruptedException {
		Driver.get(url);
		Driver.manage().window().maximize();
		Thread.sleep(7000);
		
		Actions hover = new Actions(Driver);
		
		WebElement lifestyle = Driver.findElement(By.xpath("//span[contains(text(),'Home & Lifestyle')]"));
		hover.moveToElement(lifestyle).perform();
		Thread.sleep(5000);
		
		WebElement coffee = Driver.findElement(By.xpath("//span[contains(text(),'Coffee & Tea')]"));
		hover.moveToElement(coffee).perform();
		Thread.sleep(5000);
		
		WebElement products = Driver.findElement(By.xpath("//span[contains(text(),'Coffee, Tea & Espresso')]"));
		products.click();
		Thread.sleep(3000);
		}
}
