package org.stepdefention;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossSample {
	@Parameters("browser")
	@Test
	private void tc1(String browserName) {
		WebDriver driver;
		if (browserName.equals("ChromeBrowser")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if (browserName.equals("FirefoxBrowser")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new ChromeDriver();
			
		}
		else {
			WebDriverManager.edgedriver().setup();
			driver = new ChromeDriver();
		}
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
			
		}
		
	}


