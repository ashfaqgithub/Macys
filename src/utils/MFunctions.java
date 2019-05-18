package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MFunctions {
	
	public WebDriver driver;
	
	public void clickByXpath(String MLoc){
		driver.findElement(By.xpath(MLoc)).click();
	}
	
	public void clickByLinkText(String MLoc){
		driver.findElement(By.xpath(MLoc)).click();
	}
	
	public void typeByXpath(String MLoc, String MVal){
		driver.findElement(By.xpath(MLoc)).sendKeys(MVal);

	}
	
	
}
