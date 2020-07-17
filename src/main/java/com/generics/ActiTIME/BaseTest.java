package com.generics.ActiTIME;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class BaseTest implements AutoConstant
{

	public WebDriver driver;
	 
	 @BeforeMethod
	 public void openBrowser()
	 {
		 System.setProperty(chrome_key, chrome_value);
		 //System.setProperty(GECKO_KEY, GECKO_VALUE);
		 driver=new ChromeDriver();
		 //driver=new FirefoxDriver();
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 driver.get(url);
		 
	 }
	  @AfterMethod
	  public void closeBrowser()
	  {
		  //driver.quit();
		  //driver.close();
	  }
}
