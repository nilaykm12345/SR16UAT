package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import library.BasePage;

public class EmployerLandingPage extends BasePage
{

	public EmployerLandingPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath="//*[@id=\"employerActiveLanding:manageEmployeesLink\"]")
	private WebElement manageworkers;
	public WebElement manageworkers()
	{
		return manageworkers;		
	}
	
	
	@FindBy(xpath="//span[text()='Logout']")
	private WebElement emplogout;
	public WebElement emplogout()
	{
		return emplogout;		
	}
	
}
