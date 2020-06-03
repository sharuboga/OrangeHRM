package com.qa.orangehrm.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.orangehrm.base.TestBase;

public class HomePage extends TestBase {

	@FindBy(xpath = "//span[text()='My Info']") WebElement myinfoLink;
	@FindBy(xpath = "//span[text()='Users']") WebElement  usersLink;
	@FindBy(xpath = "//span[text()='Admin']") WebElement  adminLink;
	@FindBy(xpath = "//span[text()='User Management']") WebElement  userManagementLink;
	public HomePage() throws IOException {
		PageFactory.initElements(driver, this);
	}

	public void MyinfoLink()
	{
		myinfoLink.click();

	}
	public void AddEmployeeLink()
	{

	}
	public void UsersLink() throws InterruptedException
	{
		Thread.sleep(10000);
		adminLink.click();
		userManagementLink.click();
		usersLink.click();
	}
}
