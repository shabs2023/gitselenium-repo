package pack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Addemployee extends Base {
@Test

public void createNewEmployee() throws Exception{

	
	 driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);	
	 driver.findElement(By.name("firstName")).sendKeys("sonu");			
	 System.out.println("firstname entered");
	 driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);	
	 driver.findElement(By.name("middleName")).sendKeys("m");
	 driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);	
	 driver.findElement(By.name("lastName")).sendKeys("s");
	 driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);	
	 driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]")).click();
}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
