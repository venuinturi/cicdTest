package com.google.testbase;

import org.testng.annotations.Test;

import com.mysql.cj.jdbc.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class NewTest {
 public WebDriver driver;
  @BeforeMethod
  public void beforeMethod() {
	  
	  WebDriverManager.chromedriver().setup();
	   driver=new ChromeDriver();
	  
	 
  }
  
  
  @Test
  public void OpenTest() {
	  
	  driver.get("https://www.google.com");
	  
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

}
