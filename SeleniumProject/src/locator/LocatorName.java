package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorName {
	
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\pkman\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(2000);
		driver.close();
	}

}
