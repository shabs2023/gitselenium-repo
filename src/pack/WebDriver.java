package pack;

//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class WebDriver {
	public static WebDriver driver1=null;
	//public static ExtentReports reports;
	//public static ExtentTest test;

@BeforeTest

	public void initialize1() throws Exception  {
		
		System.out.println("drive initialised");
		System.setProperty("webdriver.gecko.driver","C:\\Users\\parva\\Downloads\\geckodriver-v0.32.2-win64\\geckodriver.exe");}
	
	public static FirefoxDriver driver=null;

	public static WebDriver testBase;
	public static WebDriver getInstance() throws Exception {
		try {
			
			if (testBase == null) {
				testBase = new WebDriver();
			}

		} catch (Exception e) {
			throw new Exception("Exception while Initializing TestBase.", e);
		}
  	return testBase;

	}
	/*@BeforeSuite

	public void initialize() throws Exception  {
	
	    System.out.println("driver initialised");
		System.setProperty("webdriver.gecko.driver","C:\\Users\\parva\\Downloads\\geckodriver-v0.32.2-win64\\geckodriver.exe");
		driver1=new FirefoxDriver();
		driver1.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
	
	}*/
	@AfterSuite
public void tearDown() throws WebDriverException {
		
			
			//driver.close();
			//driver.quit();

				}

}









