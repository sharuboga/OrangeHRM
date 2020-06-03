package com.qa.orangehrm.pages;

import java.io.IOException;

import org.checkerframework.common.reflection.qual.ForName;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.orangehrm.base.TestBase;

public class UsersPage extends TestBase{
	
	@FindBy(xpath = "//div[@id='systemUserDiv']/div/a/i")  WebElement addUserbtn;
	@FindBy(xpath = "//input[@id='selectedEmployee_value']")  WebElement employeeNameInputField;
	@FindBy(xpath = "//div[@class='angucomplete-row angucomplete-selected-row']")  WebElement  intelliUsersLink;
	@FindBy(xpath = "//input[@id='user_name']")  WebElement userNameInputField;

	public UsersPage() throws IOException {
	PageFactory.initElements(driver, this);
	}

	public void ClickOnAddUserLink()
	{
		addUserbtn.click();
	}
	public void sendEmployeeName(String empName) throws InterruptedException
	{
		Thread.sleep(3000);
		employeeNameInputField.clear();
		employeeNameInputField.sendKeys(empName);
		intelliUsersLink.click();
	}
	public void sendUserName(String userName) 
	{
		userNameInputField.clear();
		userNameInputField.sendKeys(userName);
	}
}
