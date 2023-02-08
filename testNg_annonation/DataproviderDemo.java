package testNg_annonation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataproviderDemo {
  WebDriver driver;
	
	@BeforeClass
	void setup() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.nopcommerce.com/login");
		driver.manage().window().maximize();
	}
	@Test(dataProvider="dp")
	 void testLogin(String email, String pwd) throws InterruptedException {
		
		 driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(pwd);
		driver.findElement(By.xpath("//button[normalize-space()='Log in']")).click();
		Thread.sleep(4000);
		
		
		
		String exp_title="nopCommerce demo store";
		String act_title=driver.getTitle();
		
	Assert.assertEquals(exp_title,act_title);		
		 
		
		
	}
	
	@AfterClass
	void tearDown() {
		driver.close();
	}
	@DataProvider(name="dp")
	String[][] loginData()
	{
		String data[][]= {
				{"sanket@","hdcjdkj"},
				{"sankehjfduh","d2526"},
				{"sanket@gmail.com","12345678"},
				{"sanket@gmail.com","12345678"}
		};
		return data;
		
		
		
	}
	
	
	
	
	
}
