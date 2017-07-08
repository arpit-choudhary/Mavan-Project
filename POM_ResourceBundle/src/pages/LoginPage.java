package pages;

import java.util.ResourceBundle;

import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {
	
	ChromeDriver driver;
	ResourceBundle rb;
	public LoginPage(ChromeDriver driver)
	{
		this.driver=driver;
		rb=ResourceBundle.getBundle("locator");
	}
	
	public void userName(String username)
	{
	
		driver.findElementById(rb.getString("userId")).sendKeys(username);
	}
	
	public void userPassword(String password)
	{
		driver.findElementById(rb.getString("userPassword")).sendKeys(password);
	}

}
