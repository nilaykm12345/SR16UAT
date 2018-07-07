package testScript;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;

import library.BaseTest;
import pom.NESTEmployerSignUpPO;
import pom.NESTLoginPO;
import pom.NestSetUpPO;


public class Test1 extends BaseTest
{
	
	@Test
	public void testNESTHome()	
	{	
		try {
			wait=new WebDriverWait(driver, 20);
			driver.get("https://www.nestpensions.org.uk");
			
			NESTLoginPO nestlgnpo=new NESTLoginPO(driver);
			nestlgnpo.findElement(nestlgnpo.loginBtn());
			nestlgnpo.loginBtn().click();
			
			NestSetUpPO nestsetuppo=new NestSetUpPO(driver);
			nestsetuppo.findElement(nestsetuppo.setUpLink());
			nestsetuppo.setUpLink().click();
			
			NESTEmployerSignUpPO nestempsgnup=new NESTEmployerSignUpPO(driver);
			nestempsgnup.findElement(nestempsgnup.empSgnUpLink());
			nestempsgnup.empSgnUpLink().click();
			
			nestempsgnup.findElement(nestempsgnup.title());
			Select dropdown=new Select(nestempsgnup.title());
			dropdown.selectByVisibleText("Dr");
			
			nestempsgnup.findElement(nestempsgnup.firstName());
			nestempsgnup.firstName().sendKeys("Nilay"+Keys.ENTER);
			
			nestempsgnup.findElement(nestempsgnup.lastName());
			nestempsgnup.lastName().sendKeys("Kumar Mishra"+Keys.ENTER);
			
			nestempsgnup.findElement(nestempsgnup.addressLocation());
			nestempsgnup.addressLocation().click();
			
			nestempsgnup.findElement(nestempsgnup.post());
			nestempsgnup.post().sendKeys("sw1a1aa"+Keys.ENTER);
			
			nestempsgnup.findElement(nestempsgnup.postFindAdd());
			nestempsgnup.postFindAdd().click();
			
			nestempsgnup.findElement(nestempsgnup.selectAdd());
			nestempsgnup.selectAdd().click();
			
			nestempsgnup.findElement(nestempsgnup.emailAdd());
			nestempsgnup.emailAdd().sendKeys("n50k5555@gmail.com"+Keys.ENTER);
			
			nestempsgnup.findElement(nestempsgnup.confemailAdd());
			nestempsgnup.confemailAdd().sendKeys("n50k5555@gmail.com"+Keys.ENTER);
			
			nestempsgnup.findElement(nestempsgnup.username());
			nestempsgnup.username().sendKeys("n50k5555"+Keys.ENTER);
			
			nestempsgnup.findElement(nestempsgnup.pin());
			nestempsgnup.pin().sendKeys("135791"+Keys.ENTER);
			
			nestempsgnup.findElement(nestempsgnup.confpin());
			nestempsgnup.confpin().sendKeys("135791"+Keys.ENTER);
			
			nestempsgnup.findElement(nestempsgnup.pass());
			nestempsgnup.pass().sendKeys("P@55word"+Keys.ENTER);
			
			nestempsgnup.findElement(nestempsgnup.confpass());
			nestempsgnup.confpass().sendKeys("P@55word"+Keys.ENTER);
			
			nestempsgnup.findElement(nestempsgnup.secque1());
			Select dropdown1=new Select(nestempsgnup.secque1());
			dropdown1.selectByIndex(1);
			
			nestempsgnup.findElement(nestempsgnup.ansque1());
			nestempsgnup.ansque1().sendKeys("abcgg"+Keys.ENTER);
			
			nestempsgnup.findElement(nestempsgnup.secque2());
			Select dropdown2=new Select(nestempsgnup.secque2());
			dropdown2.selectByIndex(1);
			
			nestempsgnup.findElement(nestempsgnup.ansque2());
			nestempsgnup.ansque2().sendKeys("abchh"+Keys.ENTER);
			
			nestempsgnup.findElement(nestempsgnup.secque3());
			Select dropdown3=new Select(nestempsgnup.secque3());
			dropdown3.selectByIndex(1);
			
			nestempsgnup.findElement(nestempsgnup.ansque3());
			nestempsgnup.ansque3().sendKeys("abcjj"+Keys.ENTER);
			
			nestempsgnup.findElement(nestempsgnup.submitDet());
			nestempsgnup.submitDet().click();
			
			Reporter.log("Details are correct",true);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			Reporter.log("Details are incorrect. Please enter the details correctly",true);
		}
		
	}
}
