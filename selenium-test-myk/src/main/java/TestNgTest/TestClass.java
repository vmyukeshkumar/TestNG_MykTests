package TestNgTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestClass {

	
    WebDriver driver;

	@Test
	public void driverIni()
	{
		try {

			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("https://testng.org/doc/selenium.html#configuration_methods");
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
