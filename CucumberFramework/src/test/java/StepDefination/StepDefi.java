package StepDefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import PageObject.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefi {

	public WebDriver driver;
	public LoginPage loginpg;
	// we make both public becouse we could use from everywhere

	@Given("user Launch chrome browser")
	public void user_launch_chrome_browser() {
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		loginpg=new LoginPage(driver);


	}

	@When("user opens URL {string}")//we cant cahnges that 
	public void user_opens_url(String url)
	//but we can change this instead of string we use "url" 
	{
		driver.get(url);
	}

	@When("user enters Email as {string} and Password as  {string}")
	public void user_enters_email_as_and_password_as(String emailadd, String password) {
		loginpg.enterEmail(emailadd);
		loginpg.enterPass(password);		

	}

	@When("Click on Login")
	public void click_on_login() {

		loginpg.clickOnLogicButton();

	}

	@Then("page Title should be {string}")
	public void page_title_should_be(String ExpectedTitle) {

		String actualTitle=driver.getTitle();
		if(actualTitle.equals(ExpectedTitle))
		{
			Assert.assertTrue(true);

		}
		else
		{
			Assert.assertTrue(false);
		}
	}

	@When("user click on Log Out")
	public void user_click_on_log_out() {

	loginpg.logoutpage();
	}

	@Then("close browser")
	public void close_browser() {
		driver.close();
		driver.quit();

	}



}
