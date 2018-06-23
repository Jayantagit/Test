package com.mercury.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropex 
{
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "D:\\Software\\LatestChromeDriver\\chromedriver.exe");
   	     driver=new ChromeDriver();
   	     driver.get("http://demo.guru99.com/test/drag_drop.html");
   	     
   	     driver.manage().window().maximize();
 	 
	     Thread.sleep(1000);
	     
	     WebElement from=driver.findElement(By.xpath("//a[contains(text(),'SALES ')]"));
	     WebElement To=driver.findElement(By.xpath("//*[@id='loan']/li"));
	     Actions action=new Actions(driver);
   	     action.dragAndDrop(from, To).build().perform();
	     

	}

}
