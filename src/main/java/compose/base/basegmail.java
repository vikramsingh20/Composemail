package compose.base;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class basegmail {
	
	public WebDriver driver;
	public Properties pro;
	
	public WebDriver launch() throws IOException {
		
		pro=new Properties();
		
		FileInputStream file=new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\compose\\src\\main\\java\\compose"
				+ "\\cofig\\config.properties");
		
		
		pro.load(file);
		
		String str1=pro.getProperty("browser");
		
			if(str1.equalsIgnoreCase("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\New folder (2)\\chromedriver.exe");
			driver=new ChromeDriver();
			
		}
			
			
			
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			
			
			return driver;
		
		
	}

}
