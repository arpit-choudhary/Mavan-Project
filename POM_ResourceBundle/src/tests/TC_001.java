package tests;

import org.testng.annotations.Test;

import common.parent;

import pages.LoginPage;

public class TC_001 extends parent{
	
	@Test
	public void fb_login()
	{
		//LoginPage obj=new LoginPage(driver); //Can also declare here
		obj.userName("ankit");
		obj.userPassword("xyz");
		//TC_001 ob=new TC_001();
		//ob.sum();
		//ob.bmet();
		
	}

}
