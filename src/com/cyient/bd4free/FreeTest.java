package com.cyient.bd4free;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FreeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.get("https://www.db4free.net/");
		driver.findElement(By.linkText("phpMyAdmin")).click();
		Set<String> tabSessions=driver.getWindowHandles();
		for(String tabsession : tabSessions)
        {
      	  System.out.println(tabsession);
      
        driver.switchTo().window(tabsession);
        String currentTitle=driver.getTitle();
        System.out.println(currentTitle);
        
        if (currentTitle.equals("phpMyAdmin"))
        {
        	break;
        }
         
        }

		driver.findElement(By.id("input_username")).sendKeys("db123");
		driver.findElement(By.id("input_password")).sendKeys("test123");
		driver.findElement(By.id("input_go")).click();
		//driver.close();
		String msg=driver.findElement(By.xpath("(//div[@role='alert'])[3]")).getText();
		System.out.println(msg);
		String msg1=driver.findElement(By.xpath("(//div[@role='alert'])[2]")).getText();
	       System.out.println(msg1);
		
		
		
		
	}


	}

