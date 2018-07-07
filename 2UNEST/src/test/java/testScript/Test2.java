package testScript;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import library.BaseTest;
import pom.NESTLoginPO;
import pom.NESTSelfEmployerSgnUP;
import pom.NestSetUpPO;

public class Test2 extends BaseTest
{

	@Test
	public void SelfEmployedSgnup()
	{
		wait=new WebDriverWait(driver, 20);
		driver.get("https://www.nestpensions.org.uk");
		
		NESTLoginPO nestlgnpo=new NESTLoginPO(driver);
		nestlgnpo.findElement(nestlgnpo.loginBtn());
		nestlgnpo.loginBtn().click();
		
		NestSetUpPO nestsetuppo=new NestSetUpPO(driver);
		nestsetuppo.findElement(nestsetuppo.setUpLink());
		nestsetuppo.setUpLink().click();
		
		NESTSelfEmployerSgnUP nestsesetuppo=new NESTSelfEmployerSgnUP(driver);
		nestsesetuppo.findElement(nestsesetuppo.sempSgnUpLink());
		nestsesetuppo.sempSgnUpLink().click();
		
		nestsesetuppo.findElement(nestsesetuppo.lastName());
		nestsesetuppo.lastName().sendKeys("Mishra"+Keys.ENTER);
	}
	
}
