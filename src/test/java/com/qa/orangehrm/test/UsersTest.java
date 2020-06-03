package com.qa.orangehrm.test;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.orangehrm.base.TestBase;
import com.qa.orangehrm.pages.UsersPage;

public class UsersTest extends TestBase {

	UsersPage usersPage;
	public UsersTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	@BeforeTest
	public void CallUserPage() throws IOException
	{
		usersPage= new UsersPage();

	}

	@Test
	public void AddUser() throws InterruptedException
	{
		Thread.sleep(10000);
		usersPage.ClickOnAddUserLink();
		usersPage.sendEmployeeName("Sharvani");
		usersPage.sendUserName("Sharu");
	}
}
