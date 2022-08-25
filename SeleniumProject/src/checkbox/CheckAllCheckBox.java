package checkbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckAllCheckBox {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
		"C:\\Users\\pkman\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
	WebDriver driver = new ChromeDriver();
	driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
	driver.manage().window().maximize();
	driver.findElement(By.cssSelector("#txtUsername")).sendKeys("Admin");
	driver.findElement(By.cssSelector("#txtPassword")).sendKeys("admin123");
	driver.findElement(By.cssSelector("#btnLogin")).click();
	driver.findElement(By.xpath("//b[text()='PIM']")).click();
	driver.findElement(By.xpath("//b[text()='PIM']")).click();

	List<WebElement> checkkboxes = driver.findElements(By.xpath
		("//input[contains(@id,'ohrmList_chkSelectRecord_')]"));
	       for(WebElement checkbox:checkkboxes)
	    	   checkbox.click(); 
	        Thread.sleep(2000);
	        driver.quit();
	}
	
}
