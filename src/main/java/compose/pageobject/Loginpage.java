package compose.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import compose.base.basegmail;

public class Loginpage extends basegmail {

	public WebDriver driver;
	
	public Loginpage(WebDriver driver)
	
	{
		this.driver=driver;

	}

	By username=By.xpath("//input[@type='email']");
	By next_userbutton=By.xpath("//span[@class='VfPpkd-vQzf8d']");
	By password=By.xpath("//input[@type='password']");
	By next_passwordbutton=By.xpath("//span[@class='VfPpkd-vQzf8d']");
	
	public HomePage loginobj() {
		driver.findElement(username).sendKeys(pro.getProperty("username"));
		driver.findElement(next_userbutton).click();
		driver.findElement(password).sendKeys(pro.getProperty("password"));
		driver.findElement(next_passwordbutton).click();
		return new HomePage(driver);
	}
	
}
