package library;

import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest implements Constants
{
public WebDriver driver;
public WebDriverWait wait;

@BeforeMethod(alwaysRun=true)
public void launchBrowser()
{
	/*System.setProperty(CHROME_KEY,CHROME_PATH);	 
	driver =new ChromeDriver();*/
	
	System.setProperty(iexplorer_KEY,iexplorer_PATH);
	driver = new InternetExplorerDriver();
	
/*	System.setProperty(Mfirefox_KEY,Mfirefox_PATH);
	
	FirefoxOptions options = new FirefoxOptions()
		    .setProfile(new FirefoxProfile());
		 driver = new FirefoxDriver(options);
	
	DesiredCapabilities capabilities = DesiredCapabilities.firefox();
    capabilities.setCapability("marionette", false);
     driver = new FirefoxDriver(capabilities);*/
    
    /*FirefoxOptions firefoxOptions = new FirefoxOptions();
    firefoxOptions.setCapability("marionette", false);
     driver= new FirefoxDriver(firefoxOptions);*/
    
	//driver = new FirefoxDriver();
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.manage().window().maximize();
}

@AfterMethod(alwaysRun=true)
public void closeBrowser()
{
	//driver.quit();
}

}
