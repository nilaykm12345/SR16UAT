package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import library.BasePage;

public class NESTLoginPO extends BasePage
{

	public NESTLoginPO(WebDriver driver) 
	{
		super(driver);

	}
	
	@FindBy(xpath="//a[text()='Login']")
	private WebElement loginBtn;
	public WebElement loginBtn()
	{
		return loginBtn;
		
	}

}
