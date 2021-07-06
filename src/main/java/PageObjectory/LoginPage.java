package PageObjectory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClass.BaseUtil;

public class LoginPage extends BaseUtil {
	
public LoginPage(WebDriver driver)
{
	this.driver=driver;
PageFactory.initElements(driver,this);		
}

@FindBy(id="txtUsername")
private WebElement username;

@FindBy(id="txtPassword")
private WebElement password;

@FindBy(name="Submit")
private WebElement Submit;

public void username(String value) {
	username.sendKeys(value);
}

public void password(String value) {
	password.sendKeys(value);
}

public void submit() {
	Submit.click();
}

}
