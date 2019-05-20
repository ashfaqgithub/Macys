package test;

import org.testng.annotations.Test;

import base.Config;
import locators.MLoc;
import values.MVal;

public class MacysSearch extends Config {

	//Must Create Reference of Locators & Values
	MLoc ML = new MLoc();
	MVal MV = new MVal();

	@Test
	public void SearchBox(){
		typeByXpath(ML.Search, MV.SearchVal);
		clickByXpath(ML.SearchButton);
	}



}
