package sqa001.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Basedriver {
	
	public static WebDriver Driver;
	
	@BeforeSuite
	public void start() {
		
		String Browser = System.getProperty("Browser", "chrome");
		if(Browser.contains("chrome")) {
		WebDriverManager.chromedriver().setup();
		Driver = new ChromeDriver();
	}else if(Browser.contains("firefox")) {
		WebDriverManager.firefoxdriver().setup();
		Driver = new FirefoxDriver();
	}else {
		WebDriverManager.edgedriver().setup();
		Driver = new EdgeDriver();	
		}	
	}
	@AfterSuite
	public void close() {
		Driver.close();
	}
}
