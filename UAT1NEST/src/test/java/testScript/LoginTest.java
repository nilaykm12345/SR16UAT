package testScript;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;

import library.BaseTest;
import pom.EmployerLandingPage;
import pom.LoginPage;

public class LoginTest extends BaseTest
{

	@Test
	public void testNESTHome()	
	{	
		try {
			wait=new WebDriverWait(driver, 20);
			driver.get("https://tcsuat2sw/");
			
			
			LoginPage name=new LoginPage(driver);
			name.findElement(name.enterusername());
			name.enterusername().sendKeys("2unm006"+Keys.ENTER);
			
			LoginPage pass=new LoginPage(driver);
			pass.findElement(pass.pass());
			pass.pass().sendKeys("P@55word"+Keys.ENTER);
			
			wait=new WebDriverWait(driver, 20);
			
			LoginPage lgn=new LoginPage(driver);
			lgn.findElement(lgn.clickonlgnbtn());
			lgn.clickonlgnbtn().click();
			
			Reporter.log("Successfully logged in",true);
			
			EmployerLandingPage emplandpage=new EmployerLandingPage(driver);
			emplandpage.findElement(emplandpage.emplogout());
			emplandpage.emplogout().click();
			
			Reporter.log("Successfully logged out",true);
			
			
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			Reporter.log("Details are incorrect. Please enter the details correctly",true);
		}
		
	}
}

