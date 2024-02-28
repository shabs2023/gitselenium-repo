package pack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class AddEmployee extends WebDriverBase {

	@Test
	public void employeeDetails() throws Exception {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.name("firstName")).sendKeys("Mariya");
		driver.findElement(By.name("middleName")).sendKeys("M");
		driver.findElement(By.name("lastName")).sendKeys("John");
		driver.findElement(
				By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']"))
				.click();
		System.out.println("clicked add employee save button");
	}
}
