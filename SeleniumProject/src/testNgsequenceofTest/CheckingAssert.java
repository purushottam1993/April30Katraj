package testNgsequenceofTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CheckingAssert {
	static WebDriver driver;
	@BeforeTest
	public void browserlaunch() {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
	}
	@Test
	public void verifyUrlOfPage() {
		String url = driver.getCurrentUrl();
		Assert.assertEquals(url,"https://www.flpkart.com/","verifying Url");
		System.out.println("next line after Hard Assert");
	}
	@Test
	public void VerifyTitleOfPage() {
		String pageText = driver.findElement(By.cssSelector("._36KMOx")).getText();
		Assert.assertEquals(pageText, "Login" ,"Verifying title of child window");
	}
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
