package Pack1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class webDriver {
	public static WebDriver driver=null;
	

@Test

	public void initialize() throws Exception  {
    
	
		System.out.println("driver initialised");
		System.setProperty("webdriver.chromedriver","C:\\sel\\chromedriver-win64\\chromedriver.exe");
				  driver = new ChromeDriver();
				  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
}
}