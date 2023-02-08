package testNg_annonation2;

import static org.testng.Assert.fail;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParalelTesting {
	WebDriver driver;
    @BeforeClass
    @Parameters({"browser"})
	void setup(String br) throws InterruptedException {
    	if(br.equals("chrome"))
    	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
    	}
    	else if(br.equals("edge"))
    	{
    		WebDriverManager.edgedriver().setup();
    		driver=new EdgeDriver();
    	}
    	else
    	{
    		WebDriverManager.firefoxdriver().setup();
    		driver=new FirefoxDriver();
    	}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
   driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
   driver.manage().window().maximize();
   Thread.sleep(5000);
    }
	@Test(priority=1)
	void testLogo() {
		try
		{
		
		boolean status=driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
		Assert.assertEquals(status, true);
		}
		catch(Exception e)
		{
			Assert.fail();
		}
		
	}
	@Test(priority=2)
	void TestHomePageTitle() 
	{
		Assert.assertEquals(driver.getTitle(), "OrangeHRM","Titles are not matched...");
	}
	@AfterClass
	void closeapp() {
	driver.quit();
	}
}
