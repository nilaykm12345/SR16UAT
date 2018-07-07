package library;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class BasePage 
{
public WebDriver driver;
public WebDriverWait wait;
public BasePage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
	wait =new WebDriverWait(driver, 20);
}


public void findTitle(String title)
{
	try {
		wait.until(ExpectedConditions.titleContains(title));
		String aTitle=driver.getTitle();
		Reporter.log("Title is present",true);
		Reporter.log("Title is"+aTitle,true);
		
	} catch (Exception e) {
		Reporter.log("Tital is not present",true);
	}
}

public void findElement(WebElement ele)
{
	try {
		wait.until(ExpectedConditions.visibilityOf(ele));
		Reporter.log("Element is present",true);
			
	} catch (Exception e) {
		// TODO: handle exception
		Reporter.log("Element is not present",true);
	}
}

}
