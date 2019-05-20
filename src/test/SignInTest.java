package test;

import org.testng.annotations.Test;

import base.Config;
import locators.MLoc;
import values.MVal;

public class SignInTest extends Config{
	
	MLoc ML = new MLoc();
	MVal MV = new MVal();
	
	@Test
	public void AccountSignIn(){
	clickByXpath(ML.SignIn);
	typeByXpath(ML.Email,MV.EmailVal);
	typeByXpath(ML.Password, MV.PasswordVal);
	clickByXpath(ML.SignInEnter);
	
		
		
		
	}
	

}
