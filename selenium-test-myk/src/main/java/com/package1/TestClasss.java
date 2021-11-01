package com.package1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestClasss {

	WebDriver driver;

	@Test
	public void driverIni()
	{
		try {

			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("https://mvnrepository.com/");
			System.out.println("Here is the Title " + driver.getTitle());
			driver.manage().window().maximize();
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
		}
		finally
		{
			driver.quit();
		}

	}
}
