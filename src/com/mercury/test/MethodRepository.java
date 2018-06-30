package com.mercury.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import com.gargoylesoftware.htmlunit.javascript.host.event.InputEvent;

import junit.framework.Assert;

public class MethodRepository 
{
	  WebDriver driver;
	  
	  
      public void mercuryAppLaunch() throws InterruptedException, IOException 
      {
    	//Testing Bitbucket push
    	  System.setProperty("webdriver.chrome.driver", "D:\\Software\\LatestChromeDriver\\chromedriver.exe");
    	  driver=new ChromeDriver();
    	  
    
    	  BufferedReader br=new BufferedReader(new FileReader("./TestData.properties"));
    	  Properties prop=new Properties();
    	  prop.load(br);
    	  String browser=prop.getProperty("Browser");
    	  System.out.println(browser);
    	  driver.get(browser);
    	  //driver.get("http://newtours.demoaut.com/");
    	  driver.manage().window().maximize();
    	 
		  Thread.sleep(1000);
		  Utility.TakeSnapshot(driver,"D://ResultFile//Launch.png" );    	
	    	 
		  
		
    	  
      }
      
      public void PhotoUploadLaunch() throws IOException
      {
    	  
    	  
    	  System.setProperty("webdriver.chrome.driver", "D:\\Software\\LatestChromeDriver\\chromedriver.exe");
    	  driver=new ChromeDriver();
    	  driver.get("https://imgbb.com/");
    	  driver.manage().window().maximize();
     	 
    	  WebElement element=driver.findElement(By.xpath("//a[@class='btn btn-big blue']"));
    	  element.click();
    	  
    
    	  Runtime.getRuntime().exec("D:\\AutoITScript\\Upload.exe");
    	  
    	  
      }
      
      public void Login() throws InterruptedException, AWTException, FindFailed, IOException
      {
    	 
    	 //XPATH Example 
    	
    	WebElement uName=driver.findElement(By.xpath("//input[@name='userName']"));
    	 // WebElement uName=driver.findElement(By.name("userName"));
    	  uName.sendKeys("dasd");
    	  
    	  WebElement Password=driver.findElement(By.xpath("//input[@name='password']"));
    	 // WebElement Password=driver.findElement(By.name("password"));
    	  Password.sendKeys("dasd");
    	
    	  WebElement Login=driver.findElement(By.xpath("//input[@name='login']"));
    	 // WebElement Login=driver.findElement(By.name("login"));
    	 // Login.click();
    	  Actions action=new Actions(driver);
    	  action.moveToElement(Login).click().perform();
    	  
    	 //ROBOT Class Example
    	  
    	 /* Robot r1=new Robot();
    	  r1.keyPress(KeyEvent.VK_TAB);  //Home
    	  Thread.sleep(1000);
    	  r1.keyPress(KeyEvent.VK_TAB);  //Flight 
    	  Thread.sleep(1000);
    	  r1.keyPress(KeyEvent.VK_TAB);  //Hotels
    	  Thread.sleep(1000);
    	  r1.keyPress(KeyEvent.VK_TAB);   //Car Rental
    	  Thread.sleep(1000);
    	  r1.keyPress(KeyEvent.VK_TAB);   //Cruises
    	  Thread.sleep(1000);
    	  r1.keyPress(KeyEvent.VK_TAB);   //Destinations
    	  Thread.sleep(1000);
    	  r1.keyPress(KeyEvent.VK_TAB);   //Vacation
    	  Thread.sleep(1000);
    	  r1.keyPress(KeyEvent.VK_TAB);   //Sign-On
    	  Thread.sleep(1000);
    	  r1.keyPress(KeyEvent.VK_TAB);   //Register
    	  Thread.sleep(1000);
    	  r1.keyPress(KeyEvent.VK_TAB);   //Support
    	  Thread.sleep(1000);
    	  r1.keyPress(KeyEvent.VK_TAB);   //Contact
    	  Thread.sleep(1000);
    	  r1.keyPress(KeyEvent.VK_TAB);   //User Name
    	  Thread.sleep(1000);
    	  r1.keyPress(KeyEvent.VK_ENTER);
    	  r1.keyPress(KeyEvent.VK_D);
    	  r1.keyPress(KeyEvent.VK_A);
    	  r1.keyPress(KeyEvent.VK_S);
    	  r1.keyPress(KeyEvent.VK_D);
    	   
    	 // r1.keyRelease(KeyEvent.KEY_RELEASED);
    	  
    	  r1.keyPress(KeyEvent.VK_TAB);   //Password
    	  Thread.sleep(1000);
    	  r1.keyPress(KeyEvent.VK_ENTER);
    	  r1.keyPress(KeyEvent.VK_D);
    	  r1.keyPress(KeyEvent.VK_A);
    	  r1.keyPress(KeyEvent.VK_S);
    	  r1.keyPress(KeyEvent.VK_D);					
    	   
    	 // r1.keyRelease(KeyEvent.KEY_RELEASED);
    	  
    	  
    	  
    	  r1.keyPress(KeyEvent.VK_TAB);
    	  //r1.keyRelease(KeyEvent.KEY_RELEASED);
    	  
    	  Thread.sleep(1000);
    	   
    	   r1.keyPress(KeyEvent.VK_ENTER);
    	 // r1.mousePress(InputEvent.MOUSEDOWN);
    	  
    	  r1.keyRelease(KeyEvent.KEY_RELEASED);*/
    	  
    	  //************* Sikuli example*********************//
    	  
    	/*  Screen s=new Screen();
    	  Pattern p1 = new Pattern("D:\\Images\\Sign_In.png");
    	  s.click(p1); */
    	  
    	 
    	  Thread.sleep(5000);
    	  String ExpectedpageTitle="Find a Flight: Mercury Tours:";
    	  String actualTitle=driver.getTitle();
    	  if(ExpectedpageTitle.equalsIgnoreCase(actualTitle))
    	  {
    		  
    		  System.out.println("PASS");
    	  }
    	  else
    	  {
    		  System.out.println("FAIL");
    	  }
    	  
    	  WebElement passenger=driver.findElement(By.name("passCount"));
    	  Utility.selectdropdown(passenger);
    	  
    	  
    	  WebElement Continue=driver.findElement(By.name("findFlights"));
    	  Utility.mouseDblClick(driver, Continue);
    	  
    	  WebElement Contact=driver.findElement(By.xpath("//a[contains(text(),'CONTACT')]"));
    	  Utility.mouseRightClick(driver, Contact);
    	  /*WebElement option=driver.findElement(By.linkText("Save Link As..."));
    	  option.click();*/
    	  
    	 
    	  
    	  
    	  
      }
      
      public void closeApplication()
      {
    	  
    	  driver.close();
      }
      
    
    
}
