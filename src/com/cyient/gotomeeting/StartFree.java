package com.cyient.gotomeeting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StartFree {

	public static void main(String[] args) throws InterruptedException {
		
WebDriver driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
driver.get("https://www.gotomeeting.com/en-in");

driver.findElement(By.xpath("//img[@ alt='close icon']")).click();

driver.findElement(By.xpath("//a[@data-wa-link=\'promo_Start for Free_hero_button\']")).click();
driver.findElement(By.xpath("//img[@ alt=\"close icon\"]")).click();


driver.findElement(By.id("first-name")).sendKeys("shraddha");
driver.findElement(By.id("last-name")).sendKeys("hiwarkar");
driver.findElement(By.id("login__email")).sendKeys("shraddha@gmail.com");
driver.findElement(By.id("contact-number")).sendKeys("4567887654");



Select jobtitle=new Select(driver.findElement(By.id("JobTitle")));
jobtitle.selectByVisibleText("Help Desk");
driver.findElement(By.id("login__password")).sendKeys("45bcdefrha");

driver.findElement(By.xpath("//input[@value=\"10-99\"]")).click();
driver.findElement(By.xpath("//button[@data-button=\"trial-submit\"]")).click();
driver.findElement(By.id("verification")).sendKeys("678937");
driver.findElement(By.xpath("//button[@data-button=\"trial-email-verification\"]")).click();
	}

}
