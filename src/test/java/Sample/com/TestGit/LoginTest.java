package Sample.com.TestGit;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {
	
	WebDriver driver;
	@BeforeTest
	public void setUp(){

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sai\\SeleniumDrivers\\chromedriver_win32\\chromedriver.exe");
	 driver=new ChromeDriver();
	}
	
	@Test
	
	public void doLogin(){
		
        driver.get("http://www.facebook.com");
        
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("rahuljiwade007@gmail.com");
		
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("I@mB3st!");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}
		
		@AfterTest
		public void testDown(){
			
			driver.quit();
			
		}
		
	}


