package HRMpack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class webdriver {
	public static WebDriver driver=null;
  @Test
  public void initialize() throws Exception
  {
	  System.out.println("driver initialised");
	  System.setProperty("webdriver.gecko.driver", "C:\\Users\\meera\\Downloads\\geckodriver-v0.29.1-win64\\geckodriver.exe");
	  WebDriver driver=new FirefoxDriver(); 
	 
  }
}
