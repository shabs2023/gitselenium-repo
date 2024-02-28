package pack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class PersonalDetails extends WebDriverBase {

	@Test
	public void details() throws Exception{
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.findElement(By.xpath(
				"//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[2]/div[1]/div/div[2]/input"))
				.sendKeys("12334567788");
		// driver.findElement(By.xpath("//input[@placeholder='yyyy-mm-dd']")).click();
		driver.findElement(By.xpath(
				"//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[2]/div[2]/div/div[2]/div[2]/div[2]/div/label/span"))
				.click();
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		System.out.println("clicked personal details save button");

		//Thread.sleep(2000);
	}
}
