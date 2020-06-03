package com.qa.orangehrm.test;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.orangehrm.base.TestBase;
import com.qa.orangehrm.pages.HomePage;

public class HomeTest extends TestBase {

	HomePage homePage;

	public HomeTest() throws IOException {
		super();

	}
	@BeforeMethod
	public void GetHomeProperties() throws IOException
	{

		homePage = new HomePage();

	}
/*	@Test(priority=0)
	public void ClickOnMyinfoLink() throws InterruptedException
	{
		
		homePage.MyinfoLink();
	} */
	@Test(priority=1)
	public void ClickUsersLink() throws InterruptedException
	{
		
		homePage.UsersLink();
	}
}
