package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import library.BasePage;

public class NESTSelfEmployerSgnUP extends BasePage
{

	public NESTSelfEmployerSgnUP(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath=".//*[@id='signupSelfEmployedButId']")
	private WebElement sempSgnUpLink;
	public WebElement sempSgnUpLink()
	{
		return sempSgnUpLink;
	}
	
	//LastName
	@FindBy(xpath=".//*[@id='signupAsSelfEmployed:signupAsSelfEmployed_lastname']")
	private WebElement lastName;
	public WebElement lastName()
	{
		return lastName;			
	}

}
