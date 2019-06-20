package applicating;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AppTEST {
	WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.gecko.driver", "/Users/sharry/Desktop/selenium files/geckodriver");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);	
	}


	@Test
	public void hello (){
	
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("test.user@gmail.com.test");
		driver.findElement(By.id("password")).sendKeys("12345!");
		driver.findElement(By.id("Login")).click();      
      
      
	}
     @AfterMethod
     public void teardown() {
			driver.quit();

     }

}
