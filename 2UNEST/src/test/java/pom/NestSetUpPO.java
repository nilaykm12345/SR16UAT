package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import library.BasePage;

public class NestSetUpPO extends BasePage
{

	public NestSetUpPO(WebDriver driver)
	{
		super(driver);
		
	}

	@FindBy(xpath="//a[text()='set up an online NEST account']")
	private WebElement setUpLink;
	public WebElement setUpLink()
	{
		return setUpLink;
		
		
	}
	
}
