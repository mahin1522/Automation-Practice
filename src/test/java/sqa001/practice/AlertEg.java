package sqa001.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AlertEg extends Basedriver{
	
	String url = "https://the-internet.herokuapp.com/javascript_alerts";
	@Test
	public void alertTest() throws InterruptedException {
		Driver.get(url);
		Driver.manage().window().maximize();
		Thread.sleep(5000);
		
		WebElement jsAlert = Driver.findElement(By.xpath("//button[contains(text(),'Click for JS Alert')]"));
		WebElement jsConfirm = Driver.findElement(By.xpath("//button[contains(text(),'Click for JS Confirm')]"));
		WebElement jstbox = Driver.findElement(By.xpath("//button[contains(text(),'Click for JS Prompt')]"));
		
		jsAlert.click();
		Thread.sleep(2000);
		Driver.switchTo().alert().accept();
		Thread.sleep(3000);
		
		jsConfirm.click();
		Thread.sleep(2000);
		Driver.switchTo().alert().dismiss();
		Thread.sleep(3000);
		
		jstbox.click();
		Thread.sleep(2000);
		Driver.switchTo().alert().sendKeys("ki khobor");
		Thread.sleep(2000);
		Driver.switchTo().alert().accept();
		Thread.sleep(3000);
	}
}
