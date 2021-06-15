package com.cyient.magento;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RegistationTest {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
	     driver.get("https://magento.com/");

	      driver.findElement(By.linkText("Sign in")).click();
	        driver.findElement(By.id("register")).click();

	        driver.findElement(By.id("firstname")).sendKeys("shraddha");
	        driver.findElement(By.id("lastname")).sendKeys("hiwarkar");
	        driver.findElement(By.id("email_address")).sendKeys("balaji0017@gmail.com");
	        driver.findElement(By.id("self_defined_company")).sendKeys("cyient");
	        Select MyCompanyPrimarily=new Select(driver.findElement(By.id("company_type")));
	        MyCompanyPrimarily.selectByVisibleText("Tech Partner");
	        
	        Select MyRole=new Select(driver.findElement(By.id("individual_role")));
	        MyRole.selectByVisibleText("Technical/developer");
	        

		}


	}


