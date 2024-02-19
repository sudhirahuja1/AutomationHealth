package com.qa.testcases.SmokeTCs;

import java.io.Console;

import org.apache.logging.log4j.core.util.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.LoginPage;

public class Login_Technician extends TestBase{

	@Test
    public void LoginWithTechnician() throws InterruptedException
    {
    	 String browser = "chrome";
    	 String baseURL = "//qa.octagoshealth.com";
    	 String QA_Env = "https://qa.octagoshealth.com/Login";
    	 String technicianUser = "karanmtest@gmail.com";
    	 //public string technicianUser = "rithwiktech@octagoshealth.com";
    	 String regressionUser = "TusharTechnicianRegression@test.com";
    	 String clinicianUser = "TusharClinicianQA@gmail.com";
    	 String SecondaryReviewer = "TusharTechReviewerQA@gmail.com";
    	 String Password = "Karan@123";
    	 //public string Password = "Welcome123!";
    	 String invalidUser = "TusharQA@gmail.com";
    	 String clinicName = "Houston Heart Rhythm";
    	
    	 
         System.setProperty(
                 "webdriver.chrome.driver",
                 "C:\\Test Automation\\TestProjectMavenTestNG\\src\\main\\resources\\drivers\\chromedriver-win64\\chromedriver.exe");
         
         
         ChromeOptions options = new ChromeOptions();
         options.addArguments("--remote-allow-origins=*");
         WebDriver driver =new ChromeDriver(options);
                  
         Thread.sleep(2000);
         
    	
        //LoginData LoginData = new LoginData();
        LoginPage loginPage = new LoginPage(driver);
       // ClinicalStatusPage ClinicalStatusPage = new ClinicalStatusPage(driver);

        NavigateToPage(loginPage, driver);
        LoginPage.username(technicianUser);
        LoginPage.clickContinue();
        LoginPage.password(Password);
        LoginPage.clickContinue();
        Thread.sleep(5000);;
        //WaitToLoadSpinner();
        //Assert.True(driver.getTitle().Contains("Octagos Health Services"));
        
       System.out.println("Page Title is :" + driver.getTitle());

        //WaitToLoadSpinner();
      
    }



}
	
	

