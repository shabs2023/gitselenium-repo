package pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import testBase.WebDriver;

public class AddEmployee extends WebDriver {
	public void add() {
		driver.findElement(By.xpath("//html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[2]/div[1]/div/div[2]/input")).click();
driver.findElement(By.xpath("//html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[2]/div[2]/div/div[2]/div/div/input")).sendKeys("2025-04-03");
       Select dropCountry = new Select(driver.findElement(By.xpath("//html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[2]/div[2]/div/div[2]/div/div/input")));
       dropCountry.selectByVisibleText("Indian");
		Select dropStatus=new Select(driver.findElement(By.xpath("//html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[1]/div[2]/div/div[2]/div/div")));
		dropStatus.selectByVisibleText("Single");
		
	driver.findElement(By.xpath("//html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[2]/div[1]/div/div[2]/div/div/input")).sendKeys("1997-02-05");
	
	WebElement checkbox = driver.findElement(By.cssSelector("input[type='checkbox'][name='Female']"));
	checkbox.click();
	driver.findElement(By.linkText("submit")).click();
		
		
	}

}
