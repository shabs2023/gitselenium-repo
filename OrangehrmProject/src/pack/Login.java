package pack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Login extends WebDriverBase{
	
	@Test
	public void launchPage() throws Exception{
		
		driver.get("http://localhost/orangehrm/orangehrm-5.6/orangehrm-5.6/web/index.php/auth/login");
		System.out.println("website launched");
	}


	@Test
	public void verifyLogin() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.name("username")).sendKeys("suvidha");
		driver.findElement(By.name("password")).sendKeys("Suvidha@123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		System.out.println("login successful");
		Thread.sleep(2000);
		

	}

}
