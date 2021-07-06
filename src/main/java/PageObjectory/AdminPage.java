package PageObjectory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import BaseClass.BaseUtil;
import Utilities.util;

public class AdminPage extends BaseUtil {
	util ut;
	public AdminPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);	
	}
	
	@FindBy(id="menu_admin_viewAdminModule")
	private WebElement clickadmin;

	@FindBy(name="searchSystemUser[userName]")
	private WebElement userName1;
		
	@FindBy(id="searchSystemUser_userType")
	private WebElement UserRole;
	
	@FindBy(name="searchSystemUser[employeeName][empName]")
	private WebElement employeeName;
	
	@FindBy(name="searchSystemUser[status]")
	private WebElement employeeStatus;
	
	@FindBy(id="searchBtn")
	private WebElement searchbutton;
	
	public void click_admin() {
		System.out.println("inside click admin");
		clickadmin.click();
	}
		
	public void enterUsername1(String value) {
		userName1.sendKeys(value);
	}

	
	public void SelectUserRole(String value ) {
		System.out.println("qqqqqqqqqqqq");
		 ut=new util(driver);
		ut.setSelectDropdown(UserRole, value);
		
		/*
		 * //UserRole.click(); Select userrole=new
		 * Select(UserRole.selectByValue(value));
		 */
		}

	
	public void setEmployeeName(String value) {
		employeeName.sendKeys(value);
	}
			
	
	public void setEmployeeStatus(String value) {
		ut.setSelectDropdown(employeeStatus, value);
	}
	public void search()
	{
		searchbutton.click();
	}
	
	
}
