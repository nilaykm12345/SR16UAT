package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import library.BasePage;

public class NESTHomePO extends BasePage
{
	
	public NESTHomePO(WebDriver driver) 
	{
		super(driver);
		
	}
	@FindBy(name="q")
	private WebElement searchTxtBx;
	
	public WebElement searchTxtBx() {
		// TODO Auto-generated method stub
		return searchTxtBx;
	}
	
}
