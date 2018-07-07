package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import library.BasePage;

public class NESTEmployerSignUpPO extends BasePage
   {
	public NESTEmployerSignUpPO(WebDriver driver) {
		super(driver);
	}

	//Employer sign up link
	@FindBy(xpath=".//*[@id='startSignUpForEmployer']")
	private WebElement empSgnUpLink;
	public WebElement empSgnUpLink()
	{
		return empSgnUpLink;
	}
	
	
	//Title
	@FindBy(xpath=".//*[@id='signupAsEmployer:signupAsEmployer_titleCmbId']")
	private WebElement title;
	public WebElement title()
	{
			return title;	
	}
	
	
	//FirstName
		@FindBy(xpath=".//*[@id='signupAsEmployer:signupAsEmployer_yourFirstNameTxtId']")
		private WebElement firstName;
		public WebElement firstName()
		{
			return firstName;			
		}
	
		
		//LastName
				@FindBy(xpath=".//*[@id='signupAsEmployer:signupAsEmployer_yourLastNameTxtId']")
				private WebElement lastName;
				public WebElement lastName()
				{
					return lastName;			
				}
				
				//AddressLocation
				@FindBy(xpath=".//*[@id='signupAsEmployer:j_id_30:addressSelectRadio1:0']")
				private WebElement addressLocation;
				public WebElement addressLocation()
				{
					return addressLocation;			
				}
				
				//Post
				@FindBy(xpath=".//*[@id='signupAsEmployer:j_id_30:postCodeForSearchId']")
				private WebElement post;
				public WebElement post()
				{
					return post;						
				}
				
				//PostFindAdd
				@FindBy(xpath=".//*[@id='signupAsEmployer:j_id_30:find_address11']")
				private WebElement postFindAdd;
				public WebElement postFindAdd()
				{
					return postFindAdd;										
				}
				
				
				//SelectAdd
				@FindBy(xpath=".//*[@id='signupAsEmployer:j_id_30:txt_address:0']")
				private WebElement selectAdd;
				public WebElement selectAdd()
				{
					return selectAdd;
				}
	
				//emailAdd
				@FindBy(xpath=".//*[@id='signupAsEmployer:signupAsEmployer_emailAddressTxtId']")
				private WebElement emailAdd;
				public WebElement emailAdd()
				{
					return emailAdd;
				}
				
				//confemailAdd
				@FindBy(xpath=".//*[@id='signupAsEmployer:signupAsEmployer_retypeEmailAddressTxtId']")
				private WebElement confemailAdd;
				public WebElement confemailAdd()
				{
					return confemailAdd;
								
				}
				
				//username
				@FindBy(xpath=".//*[@id='signupAsEmployer:signupAsEmployer_createNestUsernameTxtId']")
				private WebElement username;
				public WebElement username()
				{
					return username;					
				}
				
				//pin
				@FindBy(xpath=".//*[@id='signupAsEmployer:signupAsEmployer_pleaseCreatePINTxtId']")
				private WebElement pin;
				public WebElement pin()
				{
					return pin;		
				}
				
				//confpin
				@FindBy(xpath=".//*[@id='signupAsEmployer:signupAsEmployer_retypePINTxtId']")
				private WebElement confpin;
				public WebElement confpin()
				{
					return confpin;
							
				}
				
				//pass
				@FindBy(xpath=".//*[@id='signupAsEmployer:signupAsEmployer_pleaseCreatePasswordTxtId']")
				private WebElement pass;
				public WebElement pass()
				{
					return pass;
					
							
				}
				
				//confpass
				@FindBy(xpath=".//*[@id='signupAsEmployer:signupAsEmployer_retypePasswordTxtId']")
				private WebElement confpass;
				public WebElement confpass()
				{
					return confpass;
					
							
				}
				
				//secque1
				@FindBy(xpath=".//*[@id='signupAsEmployer:signupAsEmployer_chooseSecretQuestionCmbId']")
				private WebElement secque1;
				public WebElement secque1()
				{
					return secque1;	
							
				}
				
				//ansque1
				@FindBy(xpath=".//*[@id='signupAsEmployer:signupAsEmployer_enterSecretAnswer1TxtId']")
				private WebElement ansque1;
				public WebElement ansque1()
				{
					return ansque1;	
							
				}
				
				
				
				//secque2
				@FindBy(xpath=".//*[@id='signupAsEmployer:signupAsEmployer_chooseSecondSecretQuestionCmbId']")
				private WebElement secque2;
				public WebElement secque2()
				{
					return secque2;	
							
				}
				
				
				//ansque2
				@FindBy(xpath=".//*[@id='signupAsEmployer:signupAsEmployer_enterSecretAnswer2TxtId']")
				private WebElement ansque2;
				public WebElement ansque2()
				{
					return ansque2;	
							
				}
				
				//secque3
				@FindBy(xpath=".//*[@id='signupAsEmployer:signupAsEmployer_chooseThirdSecretQuestionCmbId']")
				private WebElement secque3;
				public WebElement secque3()
				{
					return secque3;	
							
				}
				
				//ansque3
				@FindBy(xpath=".//*[@id='signupAsEmployer:signupAsEmployer_enterSecretAnswer3TxtId']")
				private WebElement ansque3;
				public WebElement ansque3()
				{
					return ansque3;	
							
				}
				
				//submitDet
				@FindBy(xpath=".//*[@id='signupAsEmployer:signupAsEmployer_SubmitYourDetailsId']")
				private WebElement submitDet;
				public WebElement submitDet()
				{
					return submitDet;	
							
				}
}
