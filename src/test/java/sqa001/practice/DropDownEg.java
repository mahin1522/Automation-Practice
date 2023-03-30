package sqa001.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDownEg extends Basedriver{
	
	String url = "https://qavbox.github.io/demo/signup";
	@Test
	public void dropdowneg() throws InterruptedException {
		Driver.get(url);
		Driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement name = Driver.findElement(By.xpath("//input[@id='username']"));
		name.sendKeys("Tom Cruise");
		Thread.sleep(4000);
		
		WebElement email = Driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys("tomcruisemi6@gmail.com");
		Thread.sleep(4000);
		
		WebElement gender = Driver.findElement(By.xpath("//select[@name='sgender']"));
		
		Select select = new Select(gender);
		
		select.selectByVisibleText("Male");
		Thread.sleep(4000);
		
//		select.selectByValue("female");
//		Thread.sleep(5000);
//		
//		select.selectByIndex(3);
//		Thread.sleep(3000);
		
		WebElement yoe = Driver.findElement(By.xpath("//input[@value='five']"));
		yoe.click();
		Thread.sleep(4000);
		
		WebElement skills = Driver.findElement(By.xpath("//input[@value='manualtesting']"));
		skills.click();
		Thread.sleep(4000);
		
		WebElement tools = Driver.findElement(By.xpath("//option[@value='selenium']"));
		tools.click();
		Thread.sleep(4000);
		
		WebElement submit = Driver.findElement(By.xpath("//input[@id='submit']"));
		submit.click();
		Thread.sleep(3000);
	}
	
}
