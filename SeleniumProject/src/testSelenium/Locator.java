package testSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator {
	public class WebSiteLaunch {
		public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver",
		"C:\\Users\\pkman\\Downloads\\chromedriver_win32\\chromedriver.exe");	
		
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		WebElement UserName = driver.findElement(By.xpath("//input[@name='txtUsername']"));
		
		UserName.sendKeys("Admin");
		
		WebElement PassWord = driver.findElement(By.id("txtPassword"));
		
		PassWord.sendKeys("Admin1993");
		
		WebElement btnLogin = driver.findElement(By.id("btnLogin"));
		
		btnLogin.click();
		driver.quit();
		
		}

	}


}
