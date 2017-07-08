package common;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

import pages.LoginPage;

public class parent {
	public ChromeDriver driver;
	public LoginPage obj;

	@BeforeMethod
	public void bmet()
	{
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		obj=new LoginPage(driver);
	}
	
	/*public void sum()
	{
		System.out.println("hi arpit");
	}
	*/
	
}
