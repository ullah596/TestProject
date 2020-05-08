package AmazonPageTest;

//import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import baseClasses.BasicSetup;
import pageLocators.AZNlogin_Locators;
import pageLocators.AmaznSignUp;

public class AmaznLogin_Test extends BasicSetup{

	AZNlogin_Locators ll = new AZNlogin_Locators();
	AmaznSignUp aa = new AmaznSignUp();
	AZSearchAnItem yy = new AZSearchAnItem();
	
	
	@Test(priority=2)
	public void AZNlogin() throws Exception {
		findElementByXpath(ll.AZN_AccountManagement).click();
		findElementByXpath(ll.AccountLogin).sendKeys("mdsripon83@gmail.com");
		findElementByXpath(ll.ContinueBTN).click();
		findElementByXpath(ll.AccountPass).sendKeys("Nothing12");
		findElementByXpath(ll.SignInButton).click();
		
		System.out.println("Amazon logIn test Ran successfully");
		Thread.sleep(3000);
	}

	
	@Test(priority=1)
	public void AZNSignUP() {
		findElementByXpath(aa.NewCustButn).click();
		findElementByXpath(aa.UserName).sendKeys("Mohammad Ullah");
		findElementByXpath(aa.UserEmail).sendKeys("mohammad@gmail.com");
		findElementByXpath(aa.UserPass).sendKeys("Nothing12");
		findElementByXpath(aa.UserReEnterPass).sendKeys("Nothing12");
		findElementByXpath(aa.CreateBTN).click();
		
		System.out.println("Amazon signUp successfull");
	}
	
	@Test(priority=0)
	public void AzSearchBox() 
	{
		findElementByXpath(yy.TabSearchBx).sendKeys("contact amazon");
		findElementByXpath(yy.SearchBTN).click();
		//findElementByXpath(yy.ContactAZ).click();
		
		System.out.println("search to contact amazon works");
	}
	
//	@Test
//	public void ReportAMZRepport() {
//		String ExtentReportFile = System.getProperty("user.dir")+ ("\extentReportFile.html");
//	}
}
