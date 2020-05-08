package webDriverAPI;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DriverSetup {
	
	public WebDriver driver;
	
	
	//Browser Related Method
	
	public void MaxBrowser() {
		driver.manage().window().maximize();
		}
	public void ImpTimeout() {
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		}
	public void PageLoad() {
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		}
	public void DeleteCookies() {
		driver.manage().deleteAllCookies();
		}
	public WebElement findElementByXpath(String locator) {
		WebElement element = driver.findElement(By.xpath(locator));
		return element;
		}
	public void EnterEmailByXpath(String locator, String Value) {
		driver.findElement(By.xpath(locator)).sendKeys(Value);
		}
	public void ClickByXpath(String locator){
		driver.findElement(By.xpath(locator)).click();
		}
//	public void EnterPassByXpath(String locator, String Value) {
//		driver.findElement(By.xpath(locator)).sendKeys(Value);
//		}
//	public void ClickBTNByXpath(String locator) {
//		driver.findElement(By.xpath(locator)).click();
//		}



}
