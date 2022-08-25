package testNgPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GroupsTesst {
	public static WebDriver driver;
	@BeforeTest
	public void BrowserLaunching() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		String url = driver.getCurrentUrl();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
	}
	@Test
	public void verifyUrlOfPage() {
		String url = driver.getCurrentUrl();
		SoftAssert soft = new SoftAssert();
		Assert.assertEquals(url, "https://www.flipkart.com/","verify url");
		System.out.println("next line after Hard Assert");
		soft.assertAll();
	}
	@Test
	public void VerifyTitleOfPage() {
		String pageText = driver.findElement(By.cssSelector("._36KMOx")).getText();
		Assert.assertEquals(pageText, "Login","verify Login");
	}
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
