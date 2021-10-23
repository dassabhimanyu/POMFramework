package utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AppWebDriver {
	
	private WebDriver driver;
	
	private WebDriver CreateDriver() 
	{
	 	 System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ "//Drivers/chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver", "C://ProgramData//Chrome_driver_79.0.3945.16//chromedriver.exe");
	 	 
		 driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.get("https://amazon.in");
		 driver.manage().window().maximize();
		 
		 return driver;
	}
	
	public WebDriver GetDriver() 
	{
		if(driver == null)
		{
			driver = CreateDriver();
		}
		
		return driver;
	}
	
	public void closeDriver() {
		driver.close();
		driver.quit();
	}

}
