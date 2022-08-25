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

public class GroupsTest {
	public static WebDriver driver;
	@BeforeTest
	public void browserLaunch() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	    driver.get("https://www.flipkart.com/");
	    driver.manage().window().maximize();
	}
		@Test
		public void verifyUrlOfPage() {
		String url = driver.getCurrentUrl();
		SoftAssert sof = new SoftAssert();
		Assert.assertEquals(url,"https://www.flipkart.com/","verifying Url");
		System.out.println("next line after Hard Assert");
		sof.assertAll();
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
