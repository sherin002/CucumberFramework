package stepdefinitions;

import org.testng.Assert;

import BaseClass.BrowserSetup;
import PageObjectory.LoginPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class LoginTest extends BrowserSetup {

	 LoginPage login;
	 
	@Given("^I am login page$")
	public void i_am_login_page() throws Throwable {
	   driver = BrowserSetup.SetUp("chrome", "https://opensource-demo.orangehrmlive.com");	   
	}

	@Then("^I enter username \"([^\"]*)\"$")
	public void i_enter_username(String strusername) throws Throwable {
	 login=new LoginPage(driver);  
	 login.username(strusername);
	   
	}

	@Then("^I enter password \"([^\"]*)\"$")
	public void i_enter_password(String strpassword) throws Throwable {
	   login.password(strpassword);
	   
	}

	@Then("^I click on submit button$")
	public void i_click_on_submit_button() throws Throwable {
	   login.submit();
	   
	}

	@Then("^Verify title of the page$")
	public void verify_title_of_the_page() throws Throwable {
	   String actualtitle =  driver.getTitle();
	   System.out.println(actualtitle);
	   Assert.assertEquals(actualtitle, "OrangeHRM");
	   driver.close();
	}


}
