package testSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginHrM {
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\pkman\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.id("txtUsername"));
		
		username.sendKeys("Admin");
		
		WebElement password = driver.findElement(By.id("txtPassword"));
		
		password.sendKeys("Admin999");
		
		WebElement lgnbtn = driver.findElement(By.id("btnLogin"));
		
		lgnbtn.click();
		
	}

}
