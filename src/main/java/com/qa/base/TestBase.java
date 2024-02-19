package com.qa.base;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.log4testng.Logger;

import com.qa.pages.LoginPage;
import com.qa.utils.SeleniumActions;
import com.qa.utils.TestUtils;
import com.qa.utils.WebDriverListener;

public class TestBase {

	//protected static WebDriver driver;
	protected static Properties properties;
	protected static SeleniumActions sele_Actions;
	protected static WebDriverListener eventListener;

	protected static ChromeOptions chromeOptions;
	protected static Logger log;
	public static String baseUrl;

	/*
	 * protected ITestResult result; protected ExtentReports extent; protected
	 * ExtentTest extentTest;
	 */
	public TestBase() {

		try {
			properties = new Properties();
			FileInputStream ip = new FileInputStream(
					System.getProperty("user.dir") + "/src/main/java/com/qa/config/config.properties");
			properties.load(ip);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("file not found");
		} catch (IOException e) {
			System.out.println("io exception");

		}

	}


	
	public void NavigateToPage(LoginPage page, WebDriver driver)
	{
		 //WebDriver driver = new ChromeDriver();
		 
	        driver.manage().window().maximize();

	        driver.get("https://qa.octagoshealth.com");
	    

	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.navigate().refresh();
	    driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

	}
	


//	public void tearDownMain() {
//		driver.manage().deleteAllCookies();
//		driver.close();
//	}
}

