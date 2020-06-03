package com.qa.orangehrm.test;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.orangehrm.base.TestBase;
import com.qa.orangehrm.pages.LoginPage;
import com.qa.orangehrm.pages.MyInfoPage;
import com.qa.orangehrm.utilities.ReadDataFromExcel;

public class MyinfoTest extends TestBase {
	LoginPage loginPage;
	MyInfoPage myInfoPage;
	ReadDataFromExcel excel;
	public MyinfoTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	@BeforeMethod
	public void getMyInfoProperties() throws IOException {

		myInfoPage = new MyInfoPage();
	}
	
	 @DataProvider
	   public String[][] Authentication() throws Exception{
	      excel=new ReadDataFromExcel();
	         String[][] testObjArray = excel.getExcelData();
	 
	         return (testObjArray); 
	 }
	@Test(dataProvider="Authentication")
	public void EnterData(String fName,String mName,String lName) throws InterruptedException, IOException
	{
		Thread.sleep(10000);
		myInfoPage.setUserName(fName);
		myInfoPage.setMiddleName(mName);
		myInfoPage.setLastName(lName);
		/*
		myInfoPage.setEmployeeId("1300");
		myInfoPage.setOtherId("Nothing");
		myInfoPage.setDateOfBirthId("1989","July","10");
		myInfoPage.setmaritalStatus("Single");
		myInfoPage.setGender("Female");
		myInfoPage.setCountry("Bosnian");
		myInfoPage.setLicenceNo("NS1839IUF");
		myInfoPage.setLicenceExpiry("2024","August","10");
		myInfoPage.setNickName("Dolly");
		myInfoPage.setMilitaryService("Indian service");
		myInfoPage.smokerCheckbox();
		myInfoPage.setEnticity("White");

   */


	}


}
