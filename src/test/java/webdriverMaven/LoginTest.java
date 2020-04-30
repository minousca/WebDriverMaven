package webdriverMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
	
	public static WebDriver driver;
	
	@BeforeSuite
	public void setUP() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
	}
	
	@Test
	public void doLogin() {
		
		driver.get("https://www.facebook.com/");
			driver.findElement(By.id("email")).sendKeys("minou@exampe.com");
			driver.findElement(By.id("pass")).sendKeys("");
			driver.findElement(By.xpath("//input[@value='Log In']")).click();
	}

	@AfterSuite
	public void tearDown() {
		driver.quit();
	}
}