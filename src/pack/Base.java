package pack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Base {

	public static WebDriver driver=null;
	

	@BeforeTest
	
	public void initialize()throws Exception {
		System.out.println("driver initialised");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sonum\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 
		
	}
	@BeforeSuite
	public void reportGenerate() {
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
