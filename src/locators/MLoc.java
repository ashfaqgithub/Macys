package locators;

public class MLoc {


	// HEADER	
	//Root xPath
	public String MLogo = "//*[@id='Layer_1']";
	public String HDStores = "STORES";
	public String HDDeals = "DEALS";
	public String HDLists = "LISTS";
	public String HDWedReg = "WEDDING REGISTRY";
	//Dropdown Header 'GIFTS' Missing

	//by LinkText
	public String HDSAS = "Macy's Herald Square";
	public String HDOpen = "Open";

	//by xPath
	public String HDSAS1 = "//*[@id='header-store-info-widget']/div[2]/div[1]/span";
	public String HDOpen1 = "//*[@id='header-store-info-widget']/div[2]/div[1]/span[1]";
	public String HDUntil = "//*[@id='header-store-info-widget']/div[2]/div[1]/span[2]";

	public String SignIn ="//*[@id='myRewardsLabel-status']/span[1]";
	public String MyAccount ="//*[@id='myRewardsLabel-status']/span[2]";


	//SEARCH
	public String Search = "//*[@id='globalSearchInputField']";
	public String SearchButton = "//*[@id='searchSubmit']";


	//FOOTER
	public String CS = "//*[@id='footer-redesign-row-1-panels-container']/div[1]/label/ul/li[1]";
	public String CSHelp = "//*[@id='footer-redesign-row-1-panels-container']/div[1]/label/ul/li[2]/a";
	
	
	//SIGN IN PAGE
	public String Email = "//*[@id='email']";
	public String Password = "//*[@id='pw-input']";
	public String SignInEnter = "//*[@id='sign-in']";
	
	

}
