package Pack1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class PIM extends webDriver
{
	@Test
	public void navigateToAddEmployee() throws Exception
	{
		System.out.println("waiting to click pim");
		
	//	driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		 driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[3]/a")).click();
		 System.out.println("pim clicked");
		 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		 
		 System.out.println(" clicking add employee");
		 driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[3]/a")).click();
		 
		 System.out.println(" clicked add employee");

}
}