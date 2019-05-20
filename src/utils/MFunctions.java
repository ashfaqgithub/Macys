package utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MFunctions {
	
	public WebDriver driver;
	
	// type
	 // by xpath, 
	 // by id
	 // by class
	 // by css
	
	// click
	 // by link
	 // tagname
	 // by xpatch
	
	// getText
	// radioButton
	// dropdown
	// iFrame
	// windows handle
	// switch
	// ---------------------------- EDIT BOX ----------------
	public void typeByXpath (String MLoc, String MVal){
		driver.findElement(By.xpath(MLoc)).sendKeys(MVal);
	}
	
	public void typeByName (String MLoc, String MVal){
		driver.findElement(By.name(MLoc)).sendKeys(MVal);
	}
	
	public void typeById(String MLoc, String MVal){
		driver.findElement(By.id(MLoc)).sendKeys(MVal);
	}
	
	public void typeByClass(String MLoc, String MVal){
		driver.findElement(By.className(MLoc)).sendKeys(MVal);
	}
	
	public void typeByCss(String MLoc, String MVal){
		driver.findElement(By.cssSelector(MLoc)).sendKeys(MVal);
	}
	
	
	
	
	
	// ----------------------- CLICK -------------------
	public void clickByXpath (String MLoc){
		driver.findElement(By.xpath(MLoc)).click();
	}
	
	public void clickByLinkText(String MVal){
		driver.findElement(By.linkText(MVal));
	}
	
	public void clickByName(String MVal){
		driver.findElement(By.name(MVal)).click();
	}
	
	public void clickById(String MVal){
		driver.findElement(By.id(MVal)).click();
	}
	
	public void clickByClass(String MVal){
		driver.findElement(By.className(MVal)).click();
	}
	
	public void clickByCss(String MVal){
		driver.findElement(By.cssSelector(MVal)).click();
	}
	
	
	// -------------- TIME
	public void currentTime() {
		// java code to get the current time
	}
	
	
	// implicit wait
	public void customSleep (int x) throws InterruptedException{
		Thread.sleep(x);
	}
	public void implicitWait(int y){
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	//	explicit wait
	
	// ------------------ RadioButton
	
	//linktexts visibility
	
	public void linkTextsVis(String MLoc){
	
	System.out.println(driver.findElement(By.xpath(MLoc)).getText());
		
	}
	
}

