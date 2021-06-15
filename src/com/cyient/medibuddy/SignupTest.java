package com.cyient.medibuddy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SignupTest {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	     driver.get("https://www.medibuddy.in/");
	     Thread.sleep(10000);
	     
	     
	     
	     driver.findElement(By.linkText("Signup")).click();
	     //Thread.sleep(10000);
	     driver.findElement(By.name("firstName")).sendKeys("shraddha");
	     driver.findElement(By.name("phone")).sendKeys("4767887");
	     driver.findElement(By.name("username")).sendKeys("bala@gmail.com");
	     driver.findElement(By.name("password")).sendKeys("5678");
         driver.findElement(By.xpath("//span[text()='Are you a corporate user?']")).click();
//driver.findElement(By.id("submit")).click();
driver.findElement(By.name("employeeId")).sendKeys("435");
Select year=new Select(driver.findElement(By.xpath("//select[@ng-model='date.year']")));
year.selectByVisibleText("1998");
Select month=new Select(driver.findElement(By.xpath("//select[@ng-model='date.month']")));
month.selectByVisibleText("04");
Select date=new Select(driver.findElement(By.xpath("//select[@ng-model='date.day']")));
date.selectByVisibleText("28");

driver.findElement(By.xpath("//span[text()='Female']")).click();
driver.findElement(By.id("submit")).click();

	}

}
