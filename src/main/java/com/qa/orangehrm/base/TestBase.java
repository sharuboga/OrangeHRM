package com.qa.orangehrm.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import javax.print.DocFlavor.INPUT_STREAM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestBase {
	protected static  WebDriver driver;
	protected  static Properties prop;
	public TestBase() throws IOException
	{
		prop = new Properties();
		FileInputStream fs= new  FileInputStream("C:\\Users\\sharu\\eclipse-workspace\\OrangeHRMMaven\\config.properties");
		prop.load(fs);
	}
   @BeforeSuite
	public void setUp() throws IOException
	{
		System.out.println(prop.getProperty("Browser"));
		if(prop.getProperty("Browser").contentEquals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./Browsers/chromedriver.exe");
			driver  = new ChromeDriver();
		}else if(prop.getProperty("Browser").contentEquals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "./Browsers/geckodriver.exe");
			driver  = new FirefoxDriver();
		}



		driver.manage().timeouts().implicitlyWait(Integer.parseInt(prop.getProperty("implicitwait")), TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		//	driver.manage().deleteAllCookies();
		System.out.println(driver.getTitle());
	}

}
