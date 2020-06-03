package com.qa.orangehrm.utilities;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.qa.orangehrm.base.TestBase;

public class UtilityClass extends TestBase {

	public UtilityClass() throws IOException {
		PageFactory.initElements(driver, this);	}


	public void dropdownRadiobtnSelection(String location, String strSelected)
	{
		List<WebElement> elements=driver.findElements(By.xpath(location));
		for(int i=0;i<elements.size();i++)
		{
			if(elements.get(i).getText().contentEquals(strSelected))
			{
				elements.get(i).click();
				break;
			}
		}
	}
	public void myInfoDatePickerInput(String yearLocation,String yearLocationDrpdown,String year,String monthLocation,String monthLocationdrpdown,String month,String date) throws InterruptedException {
		// dropdown for year
		driver.findElement(By.xpath(yearLocation)).click();
		dropdownRadiobtnSelection(yearLocationDrpdown, year);
		// Dropdown for month
		driver.findElement(By.xpath(monthLocation)).click();
		dropdownRadiobtnSelection(monthLocationdrpdown, month);
		Thread.sleep(3000);
		//click date
		List<WebElement> selectDate= driver.findElements(By.tagName("td"));
		for(int i=0;i<selectDate.size();i++)
		{
			if(selectDate.get(i).getText().contentEquals(date)) {


				selectDate.get(i).click();
				break;
			}
		}



	}



}