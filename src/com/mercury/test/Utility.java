package com.mercury.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Utility 
{

	
		// TODO Auto-generated method stub
		
		  public static void TakeSnapshot(WebDriver driver, String FilePath) throws IOException
	      {
	    	  TakesScreenshot scrshot=(TakesScreenshot)driver;
	    	  File srcfile=scrshot.getScreenshotAs(OutputType.FILE);
	    	  File DestFile=new File(FilePath);
	    	  FileUtils.copyFile(srcfile, DestFile);
	    	  
	    	  
	      }
		  
		  public static void selectdropdown(WebElement element)
	      {
	    	  Select select=new Select(element);
	    	  //select.selectByValue("2");
	    	  select.selectByIndex(2);
	      }
		  
		  public static void mouseDblClick(WebDriver driver,WebElement element)  
		  {
			  
			  Actions action=new Actions(driver);
			  action.doubleClick(element).build().perform();
		  }
		  
		  public static void mouseRightClick(WebDriver driver,WebElement element) throws InterruptedException, AWTException  
		  {
			  
			  Actions action=new Actions(driver);
			  action.moveToElement(element);
			  action.contextClick(element).build().perform();
			  Thread.sleep(1000);
			  
			//Select the 4th menu option
			  Robot robot=new Robot();
			  robot.keyPress(KeyEvent.VK_DOWN);
			  Thread.sleep(1000);
			  robot.keyPress(KeyEvent.VK_DOWN);
			  Thread.sleep(1000);
			  robot.keyPress(KeyEvent.VK_DOWN);
			  Thread.sleep(1000);
			  robot.keyPress(KeyEvent.VK_DOWN);
			  Thread.sleep(1000);

			  robot.keyPress(KeyEvent.VK_ENTER);
			  robot.keyRelease(KeyEvent.VK_ENTER);
			  
			  //Select the 4th menu option
			  
			/*  action.sendKeys(Keys.ARROW_DOWN).build().perform();
			  action.sendKeys(Keys.ARROW_DOWN).build().perform();
			  action.sendKeys(Keys.ARROW_DOWN).build().perform();
			  action.sendKeys(Keys.ARROW_DOWN).build().perform();
			  action.sendKeys(Keys.RETURN).build().perform(); */
			  
		  }
	      
}
