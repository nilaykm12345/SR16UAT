package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import library.BasePage;

public class LoginPage extends BasePage 
{


	
	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="//a[contains(@href,'#tab2')]")
	private WebElement newtonestlink;
	public WebElement newtonestlink()
	{
		return newtonestlink;		
	}
	
	//enter user name
	@FindBy(xpath="//*[@id=\"username\"]")
	private WebElement enterusername;
	public WebElement enterusername()
	{
		return enterusername;		
	}
	
	//enter pass
		@FindBy(xpath="//*[@id=\"password\"]")
		private WebElement pass;
		public WebElement pass()
		{
			return pass;		
		}
		
		//clickonlgnbtn
				@FindBy(xpath="//*[@id=\"lockLnk12\"]")
				private WebElement clickonlgnbtn;
				public WebElement clickonlgnbtn()
				{
					return clickonlgnbtn;		
				}


}
	

