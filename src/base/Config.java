package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

import org.testng.annotations.BeforeTest;

import utils.MFunctions;

public class Config extends MFunctions {
	
		
	@BeforeTest
	public void OpenBrowser(){
	
		// Manual Setup
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ashfa\\Documents\\GitHub\\Macys\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		// URL Opening
		driver.get("https://www.macys.com/");
		// Window Maximizer
		driver.manage().window().maximize();
		// Time Set
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
	}

	@AfterTest
	
	public void CloseBrowser(){
		//driver.close();
		//driver.quit();
	}
	
	
	
	
	
}
