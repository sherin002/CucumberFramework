package BaseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class BrowserSetup extends BaseUtil {

	public static WebDriver SetUp(String browserName, String URL) {
     if(browserName.equalsIgnoreCase("Chrome"))
     {
    	 WebDriverManager.chromedriver().setup();
    	 	 driver= new ChromeDriver();
     }else if
    	 (browserName.equalsIgnoreCase("Firefox"))
         {
        	 WebDriverManager.firefoxdriver().setup();
        	 driver= new ChromeDriver();
     }else if
    	 (browserName.equalsIgnoreCase("IE"))
     {
    	 WebDriverManager.iedriver().setup();
    	 driver= new ChromeDriver();
 }
	
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get(URL);
return driver;

}
}
