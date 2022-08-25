package testNgsequenceofTest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GroupsSuit {
	
	public static WebDriver driver;
	@BeforeTest(groups="Launching")
	public void browserLaunching() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
	}
	@Test(priority=1,groups="sanity")
	public void verifyUrlOfPage() {
		String url = driver.getCurrentUrl();
		SoftAssert sof = new SoftAssert();
		Assert.assertEquals(url, "https://www.flipkart.com/", "verify url");
		sof.assertAll();
	}
	@Test(priority=2,groups="sanity")
	public void VerifyTitleOfPage() {
		String pageText = driver.findElement(By.cssSelector("._36KMOx")).getText();
		Assert.assertEquals(pageText, "Login","verify text");
	}
	@Test(priority=3,groups="regression")
	public void verifyTopIconTopOfferIsDisplayed() {
		driver.findElement(By.xpath("//*[text()='✕']")).click();
		boolean result = driver.findElement(By.xpath("//*[text()='Top Offers']")).isDisplayed();
		Assert.assertEquals(result, true);
	}
	@Test(priority=4,groups="regression")
	public void verifyTopIconGroceryIsDisplayed() {
		boolean reslt = driver.findElement(By.xpath("//*[text()='Grocery']")).isDisplayed();
		Assert.assertEquals(reslt, true);
	}
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
