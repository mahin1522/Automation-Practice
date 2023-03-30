package sqa001.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class evalysignin extends Basedriver {
	
	String url = "https://evaly.com.bd/";
	
	@Test
	public void signinlocator() throws InterruptedException {
	Driver.get(url);
	Driver.manage().window().maximize();
	Thread.sleep(7000);
	
	WebElement signin = Driver.findElement(By.xpath("//span[contains(text(),'Sign in')]"));
	signin.click();
	Thread.sleep(5000);
	
	WebElement email = Driver.findElement(By.name("userId"));
	email.sendKeys("xyx@gmail.com");
	Thread.sleep(5000);
	
	WebElement pass = Driver.findElement(By.name("password"));
	pass.sendKeys("asdf1234");
	
	WebElement loginbutton = Driver.findElement(By.xpath("//span[contains(text(),'Login')]"));
	loginbutton.click();
	Thread.sleep(5000);
	
	}
}
