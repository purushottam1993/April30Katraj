package checkDropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDn1 {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
		"C:\\Users\\pkman\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
	WebDriver driver = new ChromeDriver();
	driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
	driver.manage().window().maximize();
	driver.findElement(By.cssSelector("#txtUsername")).sendKeys("Admin");
	driver.findElement(By.cssSelector("#txtPassword")).sendKeys("admin123");
	driver.findElement(By.cssSelector("#btnLogin")).click();
	
	driver.findElement(By.xpath("//b[text()='Time']")).click();
	driver.findElement(By.id("menu_attendance_Attendance")).click();
	driver.findElement(By.xpath("//a[contains(text(),'Employee Records')]")).click();
	
			
	
	}

}
