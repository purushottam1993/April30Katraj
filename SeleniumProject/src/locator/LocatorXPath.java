package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorXPath {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\pkman\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		 
	driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
	
	driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin123");
	
    driver.findElement(By.id("btnLogin")).click();
    Thread.sleep(2000);
    driver.findElement(By.id("welcome")).click();
    Thread.sleep(1000);
    driver.findElement(By.linkText("Logout")).click();
    //driver.findElement(By.partialLinkText("Log")).click();
   // driver.close();
	
	
	}

}
