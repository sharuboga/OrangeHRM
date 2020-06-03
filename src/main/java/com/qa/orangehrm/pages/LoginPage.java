package com.qa.orangehrm.pages;

import java.io.IOException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.qa.orangehrm.base.TestBase;

public class LoginPage extends TestBase {


	public LoginPage() throws IOException {
		PageFactory.initElements(driver, this);
	}


	@FindBy(xpath="//input[@name='txtUsername']") WebElement usernametxtfield;
	@FindBy(xpath="//input[@name='txtPassword']") WebElement passwordtxtfield;
	@FindBy(xpath="//input[@name='Submit']") WebElement loginbtn;

	public String getTitleofLoginPage()
	{

		return driver.getTitle();

	}


	public void sendCredentials(String username,String password)
	{
		usernametxtfield.clear();
		usernametxtfield.sendKeys(username);
		passwordtxtfield.clear();
		passwordtxtfield.sendKeys(password);
		loginbtn.click();
		
	}


}
