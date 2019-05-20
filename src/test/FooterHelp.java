package test;

import org.testng.annotations.Test;

import base.Config;
import locators.MLoc;
import values.MVal;

public class FooterHelp extends Config{
	
	
	MLoc ML = new MLoc();
	MVal MV = new MVal();

	@Test		
	public void HelpTest(){
		clickByXpath(ML.CSHelp);
		
	}
	
	
	
	

}
