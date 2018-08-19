package webdriverMaven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {

	public static WebDriver driver;
	
	@BeforeTest
	public void setup(){
		
		driver = new FirefoxDriver();
		
		
		
		
	}
	
	@Test
	public void doLogin(){
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String baseUrl = "http://google.com";
		String email_id = "sushilkumarprajapati23@gmail.com";
		String password = "June8184CISE@NS";
		
		
		driver.manage().window().maximize();
		driver.get(baseUrl);
		
		/*
		 * this is login functionality
		 * 
		 * 
		 */
		driver.findElement(By.linkText("Gmail")).click(); 
		driver.findElement(By.xpath("html/body/nav/div/a[2]")).click();
		driver.findElement(By.id("identifierId")).sendKeys(email_id);
		driver.findElement(By.xpath("//*[@id='identifierNext']/content/span")).click();
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.xpath("//*[@id='passwordNext']/content/span")).click();
		
		
	}
	
	public void tearDown(){
		
		driver.quit();
		
	}
}
