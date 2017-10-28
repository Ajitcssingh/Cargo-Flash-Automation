package com.pre_main;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class test {
  //ajit cs
	@Test
	
	public void test1() throws InterruptedException{
		
		ChromeOptions Options=new ChromeOptions();
		Options.addArguments("incognito");
		System.setProperty("webdriver.chrome.driver", "D:/driver/chromedriver.exe");
		Options.addArguments("--disable-extensions");
	    Options.addArguments("start-maximized");
	    
	    WebDriver driver=new ChromeDriver(Options);
	    //Navigate with Url
	    driver.get("https://ngenres.cargoflash.com/Index.cshtml");
	    
	    //login user name & pwd 
	    driver.findElement(By.id("email")).sendKeys("ajit");
	    driver.findElement(By.id("password")).sendKeys("cargo");
	    driver.findElement(By.id("LogInBtn")).click();
	    
	    try{
	    	Alert alt=driver.switchTo().alert();
	    	System.out.println(alt.getText());
	    	alt.accept();
	    }catch(Exception error){
	    	
	    }
	    driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		WebElement element=driver.findElement(By.linkText("Export"));
		 Actions act=new Actions(driver);
		act.moveToElement(element).perform();
		
Thread.sleep(2000);
		 WebElement ele=driver.findElement(By.linkText("Flight Control"));
   act.click(ele).build().perform();
   driver.switchTo().frame("iMasterFrame");
 // driver.findElement(By.xpath("//tr/td[2]/span/span/span[@class='k-icon k-i-calendar']")).click();
  //select date 
 // Thread.sleep(3000);
 // driver.findElement(By.xpath("//div/table/tbody/tr[5]/td[3]/a[text()='24']")).click();
  Thread.sleep(3000);
  driver.findElement(By.xpath("//input[@id='Text_searcheFlightsno']")).sendKeys("0404");
  Thread.sleep(5000);
  driver.findElement(By.xpath("//span[text()='GA-0404']")).click();
  //click on search
  driver.findElement(By.xpath("//button[@id='btnSearch']")).click();
  
//  driver.findElement(By.xpath("//tbody/tr[1]/td[38]/input[@class='partialprocess']")).click();
//  Thread.sleep(1000);
//  
//  driver.findElement(By.xpath("//input[@id='chkAllBox']")).click();
//  Thread.sleep(2000);
//  //click on mainifast
//  driver.findElement(By.xpath("//button[@id='btnFinalizedPreMan']")).click();
//  Thread.sleep(40000);
  //click on mailfast 
  driver.findElement(By.xpath("//table/tbody/tr[1]/td[39]/input[@class='undefined']")).click();
  
  driver.findElement(By.xpath("//input[@id='RegistrationNo']")).sendKeys("12900982");
  
  driver.findElement(By.xpath("//button[@id='btnSave']")).click();
  
  driver.findElement(By.xpath("//input[@id='popup_ok']")).click();
  
  
		 
//	    List<WebElement> links = driver.findElements(By.tagName("a"));
//	    
//		System.out.println(links.size());
// 
//		for (int i = 1; i<=links.size(); i=i+1)
// 
//		{
// 
//			System.out.println(links.get(i).getText());
// 
//		}
 
	}
 
}
	    	
	    
	    
	    

	

