package stepdefinitions;

import BaseClass.BrowserSetup;
import PageObjectory.AdminPage;
import PageObjectory.LoginPage;
import Utilities.util;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AdminPageTest extends BrowserSetup
{
AdminPage admin;
util ut;
LoginPage login;

     @Given("^I am in home page and enter  username \"([^\"]*)\" and password \"([^\"]*)\"$")
public void i_am_in_home_page_and_enter_username_and_password(String strusername, String strpassword) throws Throwable {
   
		 driver = BrowserSetup.SetUp("chrome", "https://opensource-demo.orangehrmlive.com");	
		 login=new LoginPage(driver);  
		 login.username(strusername);	
		 Thread.sleep(1000);
		 login.password(strpassword);
		 Thread.sleep(1000);
		 login.submit();
		 Thread.sleep(1000);
	}
     @When("^I  click on Admin tab$")
     public void i_click_on_Admin_tab() throws Throwable {
    	 System.out.println("inside defenition");
    	 admin=new AdminPage(driver);
         // Write code here that turns the phrase above into concrete actions
         admin.click_admin();
     }
     
     @Then("^I enter username for testadmin \"([^\"]*)\"$")
     public void i_enter_username_Admin(String strusername) throws Throwable {
    	 System.out.println("in enter username");
         admin.enterUsername1(strusername);
     }
     @When("^I select user role \"([^\"]*)\"$")
     public void i_select_user_role(String userrole) throws Throwable {
         admin.SelectUserRole(userrole);
         System.out.println("user role####"+userrole);
       
       
     }
     @Then("^I enter EmployeeName \"([^\"]*)\"$")
     public void i_enter_EmployeeName(String empname) throws Throwable {
        admin.setEmployeeName(empname);
       
     }
     @Then("^I select Status \"([^\"]*)\"$")
     public void i_select_Status(String stastus) throws Throwable {
         admin.setEmployeeStatus(stastus);
         
     }
     @When("^I click on search button$")
     public void i_click_on_search_button() throws Throwable {
         // Write code here that turns the phrase above into concrete actions
         admin.search();
     }
	/*
	  
	 * @Then("^I enter \"([^\"]*)\"$") public void i_enter(String searchname) throws
	 * Throwable { home.setSearchname(searchname); }
	 * 
	 * @When("^I enter  on dropdown \"([^\"]*)\"$") public void
	 * i_click_on_dropdown(String rolename) throws Throwable { ut= new util(driver);
	 * ut.setSelectDropdown(home.SelectDropdown(),rolename);
	 * 
	 * }
	 * 
	 * 
	 * @Then("^I enter EmployeeName \"([^\"]*)\"$") public void
	 * i_enter_EmployeeName(String empname) throws Throwable {
	 * home.setEmployeeName(empname);
	 * 
	 * }
	 * 
	 * @Then("^I enter Status \"([^\"]*)\"$") public void i_enter_Status(String
	 * status) throws Throwable { home.setEmployeeStatus(status);
	 * 
	 * 
	 * }
	 */

}
