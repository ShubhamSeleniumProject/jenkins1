package com.tyss.genericUtility;

import java.io.IOException;
import java.lang.reflect.Method;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.tyss.objectRepository.HomePage;
import com.tyss.objectRepository.LoginPage;
import com.tyss.objectRepository.WelcomePAge;

public class BaseClass {
	
	public JavaUtility ju=new JavaUtility();
	public FileUtility fu=new FileUtility();
	public  ExcelUtility eu=new ExcelUtility();
	public HomePage hp;
	
	
	public static ExtentSparkReporter spark;
	public static ExtentReports report;
	public static ExtentTest test;
	public static  WebDriver driver;
	
	
	public  WelcomePAge wp;
	public LoginPage lp;
	
	
	@BeforeSuite
	public void configReport()
	{
	
	
	String time = ju.getDataTime().toString().replace(":","-");
	
	spark=new ExtentSparkReporter("./HTML_report/extent-"+time+".png");
	 report=new ExtentReports();
	report.attachReporter(spark);
	
	}
	
	@Parameters("Browser")
	
	@BeforeClass
	public void LaunchBrowser(@Optional("chrome") String browser) throws IOException
	{
		
		if (browser.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if (browser.equalsIgnoreCase("edge"))
		{
			driver=new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		String URL = fu.getdataFromFile("url");
		driver.get(URL);
		
	}
	
	
	@BeforeMethod
	public void login(Method method) throws EncryptedDocumentException, IOException
	
	{
	
		test=report.createTest(method.getName());
		wp=new WelcomePAge(driver);
		wp.getLoginlink().click();
		
		lp=new LoginPage(driver);
		
	
		
		String email = eu.getDataFromExcel("login",2,0);
		String password = eu.getDataFromExcel("login",2,1);
		
		lp.getEmail_text().sendKeys(email);
		lp.getPwd_text().sendKeys(password);
		
		lp.getLogin_button().click();
		
	}
	
	@AfterMethod
	public void logout()
	{
		HomePage hp=new HomePage(driver);
		
		hp.getLogout_link().click();
	}
	
	@AfterClass
	public void close()
	{
		driver.quit();
	}
	@AfterSuite
	public void Backup()
	{
		report.flush();
	}
	
	
	
	
	
	
	
	
	
	
}
