package TestProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OpenChromeBrow {

	
	
@Test
	
//public void OpenChromeBrower() {
	public static void main(String[] args)	{
		//System.setProperty("", value);
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	}
	
	
}
