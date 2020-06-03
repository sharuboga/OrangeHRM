package com.qa.orangehrm.pages;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;

public class MobilesPage extends HomePage {

	
	public MobilesPage() throws IOException {
		PageFactory.initElements(driver, this);
	}
    
}
