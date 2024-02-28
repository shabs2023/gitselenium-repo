package pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import testBase.WebDriver;


public class Login extends WebDriver {
	@Test
	  public void f() throws InterruptedException {
		  System.setProperty("webdriver.gecko.driver","C:\\Users\\parva\\Downloads\\geckodriver-v0.32.2-win64\\geckodriver.exe");
		  FirefoxDriver driver=new FirefoxDriver();
		  driver.manage().window().maximize();
		  driver.get("http://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		  Thread.sleep(3000);
		WebElement username= driver.findElement(By.name("username"));
		   username.sendKeys("Admin");
		WebElement password=driver.findElement(By.name("password"));
		 password.sendKeys("admin123");
		WebElement login=driver.findElement(By.xpath("//html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
		login.click();	
	}			 
	}

	


