package pack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class WebDriverBase {
	public static WebDriver driver = null;

	@BeforeTest
	public void setup() throws Exception{
		System.out.println("running on chrome driver");
		System.setProperty("webdriver.chrome.driver", "D:\\chromenew\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
	}
}
