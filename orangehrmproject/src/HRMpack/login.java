package HRMpack;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class login {
	WebDriver driver;
  @Test
  public void Launchurl() throws Exception
  {
	  driver.get("http://localhost/orangehrm/orangehrm-5.6/orangehrm-5.6/web/index.php/auth/login");
	  System.out.println("url launched");
  }
  public void login() throws Exception
  {
	  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	  driver.findElement(By.name("username")).sendKeys("abirami");
		driver.findElement(By.name("password")).sendKeys("Abijagan@89");
		driver.findElement(By.xpath("//html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		System.out.println("the login page launched sucessfully");
  }
}
