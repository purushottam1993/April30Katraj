package checkbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckUnCheckCheckBox {
	
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
	driver.findElement(By.xpath(
	"//a[text()='Aaliyah']//parent::td//preceding-sibling::td//input[@type='checkbox']")).click();
	/*Thread.sleep(2000);
	driver.findElement(By.xpath(
	"//a[text()='Haq']//ancestor::td//preceding-sibling::td//input[@type='checkbox']")).click();
	
	driver.findElement(By.id("welcome")).click();
	Thread.sleep(1000);
	driver.findElement(By.linkText("Logout")).click();*/
	
	}

}
