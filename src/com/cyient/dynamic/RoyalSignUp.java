package com.cyient.dynamic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RoyalSignUp {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	     driver.get("https://www.royalcaribbean.com/account/create");
	     driver.findElement(By.xpath("//input[@data-placeholder='First name/Given name']")).sendKeys("shraddha");
	     driver.findElement(By.xpath("//input[@data-placeholder='Last name/Surname']")).sendKeys("hiwarkar");
	     
	     driver.findElement(By.xpath("//span[text()='Month']")).click();
	     driver.findElement(By.xpath("//span[text()=' April ']")).click();
	     
	     driver.findElement(By.xpath("//span[text()='Day']")).click();
	     driver.findElement(By.xpath("//span[text()=' 4 ']")).click();
	     
	     driver.findElement(By.xpath("//input[@data-placeholder='Year']")).sendKeys("1998");
	     
	     driver.findElement(By.xpath("//span[text()='Country/Region of residence']")).click();
	     driver.findElement(By.xpath("//span[text()=' India ']")).click();
	     Thread.sleep(1000);
	     
	     driver.findElement(By.xpath("//input[@data-placeholder='Email address']")).sendKeys("shraddha@gmail.com");
	     
	     driver.findElement(By.xpath("//input[@data-placeholder='Create new password']")).sendKeys("Shraddha@678");
	     
	     
	     driver.findElement(By.xpath("//span[text()='Select one security question']")).click();
	     driver.findElement(By.xpath("//span[text()=' What was the name of your first pet? ']")).click();
	     Thread.sleep(1000);
	     
	     driver.findElement(By.xpath("//input[@data-placeholder='Answer']")).sendKeys("kaju");
	     Thread.sleep(1000);
	     
	     driver.findElement(By.xpath("//span[@class='mat-checkbox-inner-container mat-checkbox-inner-container-no-side-margin']")).click();
	     driver.findElement(By.xpath("//button[text()=' Done ']")).click();
	     
	     
	     
	}

}
