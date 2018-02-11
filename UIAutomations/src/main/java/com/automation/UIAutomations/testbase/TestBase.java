package com.automation.UIAutomations.testbase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.automation.UIAutomations.homepage.TC_01VerifyLoginWithInvalidCredentials;
import com.automation.UIAutomations.uiActions.HomePage;

public class TestBase {

	public WebDriver driver;
	String url="http://automationpractice.com/index.php";
	String browser="Chrome";
	
	
	public void init(){
		selectBrowser(browser);
		getUrl(url);
		String log4j="log4j.properties";
		//propertyconfigurator.configure(log4j);
		
	}
	
	
	public void selectBrowser(String browser){
		if(browser.equalsIgnoreCase("Chrome")){
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/driver/chromedriver.exe");
			   driver=new ChromeDriver();
			
		}else if(browser.equalsIgnoreCase("IE")){
			System.setProperty("webdriver.ie.driver",System.getProperty("user.dir") + "/driver/IEDriverServer.exe");
			driver=new InternetExplorerDriver();		}
		
	}
	
	public void getUrl(String url){
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		
	}
	
	
	
}
