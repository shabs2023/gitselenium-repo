package pack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class PIM extends Base{
	
	
@Test
public void navigateToAddEmployeePage() throws Exception{
	System.out.println("waiting to click pim");
	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 driver.findElement(By.linkText("PIM")).click();
	 System.out.println("pim clicked");
	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 System.out.println("Clicking add employee");
	 driver.findElement(By.linkText("Add Employee")).click();
	 System.out.println("Clicked add employee");
	
	
	
	
	
	
	
}
}