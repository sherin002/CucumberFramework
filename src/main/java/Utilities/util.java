package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import BaseClass.BaseUtil;

public class util extends BaseUtil {
	
public util(WebDriver driver)
{
	this.driver=driver;
PageFactory.initElements(driver,this);		
}

public void setSelectDropdown(WebElement ele, String value) {
	System.out.println("cccccccccccccccc"+ele);
	Select select=new Select(ele);
	select.selectByVisibleText(value);
}

}
