package data;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataTest {
	
	
    WebDriver driver;
	
	@Test
	public void InIt() {
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://objectspy.space/");
		driver.manage().window().maximize();
		// wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

}
	public void logintTest()
	{
		System.out.println("hello dataTest");
	}
	

}
