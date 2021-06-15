package cyient.com.multipletabs;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipletabTest {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.get("https://www.online.citibank.co.in/");
driver.findElement(By.linkText("APPLY FOR CREDIT CARDS")).click();


       Set<String> tabSessions=driver.getWindowHandles();

        
		for(String tabsession1 : tabSessions)
          {
        	  System.out.println(tabsession1);
        
          driver.switchTo().window(tabsession1);
          String currentTitle=driver.getTitle();
          System.out.println(currentTitle);
           }
		driver.findElement(By.linkText("Travel")).click();
		driver.findElement(By.linkText("Email_Id")).sendKeys("balaji0017@gmail.com");
		
	}

}
