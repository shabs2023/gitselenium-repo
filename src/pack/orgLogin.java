package pack;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class orgLogin{
@Test
public void f() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\sonum\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 
	 
	  driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	     driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("http://localhost/orangehrm/orangehrm-5.6/orangehrm-5.6/web/index.php/auth/login");
	

	driver.findElement(By.name("username")).sendKeys("sonums");
	driver.findElement(By.name("password")).sendKeys("Sonums@9898");
	
	driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	
	driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a")).click();
	driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[3]/a")).click();
	driver.findElement(By.name("firstName")).sendKeys("sonu");																																																																																																						
	driver.findElement(By.name("middleName")).sendKeys("m");
	driver.findElement(By.name("lastName")).sendKeys("s");
	driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]")).click();
	
	
}
}
