package testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SecondTestNG {
  WebDriver driver;
  
  @Test(priority=1)
	void launchBrowser() {
		
	  WebDriverManager.chromedriver().setup();
	 // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
	}
  @Test(priority=2)
	void launchApp() {
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	}
  @Test(priority=3)
	void loginTOApp() {
	  driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	
  
  
}




