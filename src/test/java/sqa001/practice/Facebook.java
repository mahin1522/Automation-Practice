package sqa001.practice;

import org.testng.annotations.Test;

public class Facebook extends Basedriver {

	public String URL = "https://www.selenium.dev/";
	
	
	@Test
	public void newTest() throws InterruptedException {
		
		Driver.get(URL);
		Driver.manage().window().maximize();
		
		if(Driver.getTitle().contains("Selenium")) {
			System.out.println(Driver.getTitle());
		}else {
			System.out.println("Title not matched");
		}
		Thread.sleep(6000);
	}
}
