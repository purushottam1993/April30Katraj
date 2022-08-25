package testSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebSiteLaunch {
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver",
		"C:\\Users\\pkman\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		//driver.get("https://opensource-demo.orangehrmlive.com/"); OR
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.quit();
		
		
	}

}
