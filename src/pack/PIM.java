package pack;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import testBase.WebDriver;

public class PIM extends WebDriver {
	@Test
	public void f() throws InterruptedException{
		
		WebElement pim=driver.findElement(By.xpath("//html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a"));
		pim.click();
		driver.findElement(By.xpath("//html/body/div/div[1]/div[2]/div[2]/div/div[2]/div[1]/button")).click();
		driver.findElement(By.name("firstName")).sendKeys("Aravind");
		driver.findElement(By.name("lastName")).sendKeys("S");
		Thread.sleep(3000);
		  Alert alert=driver.switchTo().alert();
		  String alertMessage=driver.switchTo().alert().getText();
		  System.out.println(alertMessage);
		  alert.accept();
		  Thread.sleep(3000);
		
		
		
	}

}
