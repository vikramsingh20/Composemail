package compose.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import compose.base.basegmail;

public class HomePage extends basegmail {
	
	public  WebDriver driver;
	public HomePage(WebDriver driver) {
		
		this.driver=driver;
	}
	
	By composebutton=By.xpath("//div[@class='T-I T-I-KE L3']");
	By to_email=By.xpath("//textarea[@id=':at']");
	By subject_email=By.xpath("//input[@placeholder='Subject']");
	By body_email=By.xpath("//div[@class='Am Al editable LW-avf tS-tW']");
	By Send_button=By.xpath("//div[@class='T-I J-J5-Ji aoO v7 T-I-atl L3']");
	
	By Sent_email=By.xpath("//div[@class='TN bzz aHS-bnu']");
	
	By subject_check=By.xpath("//*[text()='Incubyte']");
	
	
	public void composemail() {
		driver.findElement(composebutton).click();
		driver.findElement(to_email).sendKeys(pro.getProperty("To_email_id"));
		driver.findElement(subject_email).sendKeys(pro.getProperty("Subject"));
		driver.findElement(body_email).sendKeys(pro.getProperty("BodyTest"));
		driver.findElement(Send_button).click();
		
	}
	
	
	public String sentbutton() {
		
		driver.findElement(Sent_email).click();
		
		return driver.findElement(subject_check).getText();
	}
	
	

}
