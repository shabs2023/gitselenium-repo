package HRMpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Addemployee{
	WebDriver driver;
  @Test
  public void employeeDetails() throws Exception 
  {
	  driver.findElement(By.xpath("//html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a")).click();
	  driver.findElement(By.xpath("//html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[3]")).click();
		driver.findElement(By.name("firstName")).sendKeys("priya");
		driver.findElement(By.name("middleName")).sendKeys("baskar");
		driver.findElement(By.name("lastName")).sendKeys("M");
		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[2]/div/div/div[2]/input")).sendKeys("0004");
		driver.findElement( By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]")).click();
       
       System.out.println("employee details added and saved");
		
  }
}
