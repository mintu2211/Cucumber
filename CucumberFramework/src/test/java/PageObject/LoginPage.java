package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver ldriver;
	
	public LoginPage(WebDriver rDriver)
	{
		ldriver =rDriver;
		PageFactory.initElements(rDriver, this);
		
	}
	
	@FindBy(id = "Email")
	WebElement email;
	
	@FindBy(id = "Password")
	WebElement pass;
	
	@FindBy(xpath = "//button[contains(text(),'Log in')]")
	WebElement loginbtn;
	
	@FindBy(linkText  = "Logout")
	WebElement logout;
	
	public void enterEmail(String emailAdd)
	{
		email.clear();
		email.sendKeys(emailAdd);
	}
	
	public void enterPass(String pwd)
	{
		pass.clear();
		pass.sendKeys(pwd);
	}
	
	public void clickOnLogicButton( )
	{
		loginbtn.click();
	}
	
	public void logoutpage( )
	{
		logout.click();
	}
	
}


