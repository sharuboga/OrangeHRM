package com.qa.orangehrm.pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.orangehrm.base.TestBase;
import com.qa.orangehrm.utilities.UtilityClass;


public class MyInfoPage extends TestBase {

	UtilityClass class1=new UtilityClass();
	public MyInfoPage() throws IOException {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='firstName']") WebElement firstnameInputField;
	@FindBy(xpath = "//input[@id='middleName']") WebElement middlenameInputField;
	@FindBy(xpath = "//input[@id='lastName']") WebElement lastnameInputField;
	@FindBy(xpath = "//input[@id='employeeId']") WebElement employeeIdInputField;
	@FindBy(xpath = "//input[@id='otherId']") WebElement otherIdInputField;
	@FindBy(xpath = "//input[@id='emp_birthday']") WebElement dateOfBirthInputField;
	@FindBy(xpath = "//input[@id='licenseNo']") WebElement  LicenceNoInputField;
	@FindBy(xpath = "//i[@class='material-icons action-icon date-picker-open-icon']")  WebElement datePickerFiled;
	String yearFieldDateofBirth="//div[@class='select-wrapper picker__select--year']/input";
	String yearLocation="//div[@class='select-wrapper picker__select--year']/ul/li";
	String monthFiledDateofBirth="//div[@class='select-wrapper picker__select--month']/input";
	String monthLocation="//div[@class='select-wrapper picker__select--month']/ul/li";
	@FindBy(xpath = "//div[@id='emp_marital_status_inputfileddiv']/div/input")  WebElement rbtnmaritalStatus;
	String rbtGender="//ul[@class='radiobutton-container']/li/label";
	String rbtmaritalStatusLocation ="//ul[@class='radiobutton-container']/li/label";
	@FindBy(xpath = "//div[@id='nation_code_inputfileddiv']/div/input")  WebElement drpCountryList;
//	@FindBy(xpath = "//div[@id='nation_code_inputfileddiv']/div/ul/li") String drpCountryLocation;
	String drpCountryLocation="//div[@id='nation_code_inputfileddiv']/div/ul/li";
	@FindBy(xpath = "//input[@id='emp_dri_lice_exp_date']") WebElement    licenceExpiryInputField;
	@FindBy(xpath = "//*[@id='pimPersonalDetailsForm']/materializecss-decorator[4]/div/sf-decorator[3]/div/span[1]/span[1]/i") WebElement LicenceDatepicker;
	@FindBy(xpath = "//input[@id='nickName']")  WebElement nickNameInputField;
	@FindBy(xpath = "//input[@id='militaryService']")  WebElement militaryService;
	@FindBy(xpath = "//div[@class='row col s12 m12 l4']/label") WebElement smokerchk;
	@FindBy(xpath = "//div[@id='eeo_race_ent_inputfileddiv']/div/input")  WebElement drpEnthicity;
	String ethenticityLocation="//div[@id='eeo_race_ent_inputfileddiv']/div/input";
   @FindBy(xpath = "//button[@class=' btn waves-effect waves-green ']") WebElement submtbtn;
	public void setUserName(String strUserName){
		firstnameInputField.clear();	    
		firstnameInputField.sendKeys(strUserName);

	}
	public void setMiddleName(String strmiddleName){

		middlenameInputField.clear();
		middlenameInputField.sendKeys(strmiddleName);

	}
	public void setLastName(String strlastName){

		lastnameInputField.clear();
		lastnameInputField.sendKeys(strlastName);

	}
	public void setEmployeeId(String strEmploeddId){

		employeeIdInputField.clear();
		employeeIdInputField.sendKeys(strEmploeddId);

	}
	public void setOtherId(String strotherId){

		otherIdInputField.clear();
		otherIdInputField.sendKeys(strotherId);

	}
	public void setDateOfBirthId(String year,String month,String date) throws IOException, InterruptedException{


		dateOfBirthInputField.clear();
		datePickerFiled.click();
		class1.myInfoDatePickerInput(yearFieldDateofBirth,yearLocation,year,monthFiledDateofBirth,monthLocation, month, date);

	}
	public void setLicenceNo(String strLicence){

		LicenceNoInputField.clear();
		LicenceNoInputField.sendKeys(strLicence);

	}
	public void setmaritalStatus(String strselectedValue) throws IOException{



		rbtnmaritalStatus.click();
		class1.dropdownRadiobtnSelection(rbtmaritalStatusLocation, strselectedValue);

	}
   public void setGender(String strGender) {
	   class1.dropdownRadiobtnSelection(rbtGender, strGender);
   }
	public void setCountry(String strCountrySelected) {
		drpCountryList.click();
		class1.dropdownRadiobtnSelection(drpCountryLocation, strCountrySelected);
	}
	public void setLicenceExpiry(String year,String month,String date) throws InterruptedException{

		LicenceNoInputField.clear();
		LicenceDatepicker.click();
		class1.myInfoDatePickerInput(yearFieldDateofBirth,yearLocation,year,monthFiledDateofBirth,monthLocation, month, date);

	}
	public void setNickName(String strNickName){

		LicenceNoInputField.clear();
		LicenceNoInputField.sendKeys(strNickName);

	}
	
	public void setMilitaryService(String strMilitaryService) {
		militaryService.clear();
		militaryService.sendKeys(strMilitaryService);
	}
   
	public void smokerCheckbox()
	{
		
		smokerchk.click();
	}
	
	public void setEnticity(String strSelected) {
		drpEnthicity.click();
		class1.dropdownRadiobtnSelection(ethenticityLocation, strSelected);
	}
	public void ClickSubmit()
	{
		submtbtn.click();
	}
}
