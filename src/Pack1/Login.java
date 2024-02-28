package Pack1;

import java.util.concurrent.TimeUnit;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Login extends webDriver 
 {
	 @Test
	  public void f() throws Exception
	 {
		/*  System.setProperty("webdriver.gecko.driver",
					 "C:\\Users\\user\\Downloads\\geckodriver-v0.29.1-win64\\geckodriver.exe");
					  WebDriver driver=new FirefoxDriver(); 
					 driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
					 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);*/
		
					   driver.get("http://localhost/orangehrm/orangehrm-5.6/orangehrm-5.6/web/index.php/auth/login");
					   System.out.println("website launched");
					   }
	 
	 
					   @Test
					 public void login() throws Exception
					 {
					 String expectedTitle="OrangeHRM";
					  		
					String actualTitle=driver.getTitle();
					  Assert.assertEquals(actualTitle,expectedTitle);
					  System.out.println("verify the title");
						 
				  driver.findElement(By.name("username")).sendKeys("sajnasj123");
	
				driver.findElement(By.name("password")).sendKeys("Airbus320$sajna");
				 driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
				 System.out.println("login button clicked");
				 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
				 driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a")).click();
				System.out.println("dashboard successfully loaded");
					 }}
			/* driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
				 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
				 
		driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[3]/a")).click();
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	
	 } }	*/		

