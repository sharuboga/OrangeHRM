package com.qa.orangehrm.test;

import java.io.IOException;
import java.util.Properties;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.orangehrm.base.TestBase;
import com.qa.orangehrm.pages.LoginPage;

public class LoginTest extends TestBase {

	LoginPage loginPage;

	public LoginTest() throws IOException {
		super();
	}
	@BeforeMethod
	public void getLoginProperties() throws IOException {
		loginPage = new LoginPage();
	}
	@Test(priority=0)
	public void verifyTitle()
	{
		
		String actualTitle = loginPage.getTitleofLoginPage();
	  Assert.assertEquals(actualTitle, "OrangeHRM");
	}
   @Test(priority=1)
   public void loginSetup() throws InterruptedException
   {
	   loginPage.sendCredentials(prop.getProperty("username"), prop.getProperty("password"));
	//   Thread.sleep(10000);
   }




}
