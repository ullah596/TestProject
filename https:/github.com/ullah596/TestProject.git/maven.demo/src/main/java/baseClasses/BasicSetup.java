package baseClasses;

//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import webDriverAPI.DriverSetup;

public class BasicSetup extends DriverSetup{

	
	String BaseURL=("https://www.amazon.com/");
	
	
	@BeforeMethod
	public void browserSetup() {
//		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/Drivers/chromedriver");
//		driver =new ChromeDriver();
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"/Drivers/geckodriver");
		driver =new FirefoxDriver();
		driver.get(BaseURL);
		MaxBrowser();
		PageLoad();
		ImpTimeout();
		DeleteCookies();
		
	}
	
	@AfterMethod
	public void CloseBrowser() {
		driver.close();
	}
	
}
