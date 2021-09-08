package Gmail.compose;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;

import compose.base.basegmail;
import compose.pageobject.HomePage;
import compose.pageobject.Loginpage;

public class LoginPageTest extends basegmail {
	public Loginpage login;
	public HomePage home;
	public WebDriver driver;	
	
	@BeforeMethod
		
		public void md() throws IOException {
		
		driver=launch();
		driver.get(pro.getProperty("URL"));
		login=new Loginpage(driver);
		home=new HomePage(driver);
		
		}
		
	@Test(priority = 1)
	public void LoginTest() {
		login.loginobj();
		//Check of composition button is visible on not
		boolean val=	driver.findElement(By.xpath("//div[@class='T-I T-I-KE L3']")).isDisplayed();
		Assert.assertTrue(val);
	}
	
	@Test(priority = 2)
	
	public void composeTest()
	{
		home.composemail();
			String str=home.sentbutton();
			Assert.assertEquals(str, pro.setProperty("Subject", "Actual and expected value are not same"));
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
	}

