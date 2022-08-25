package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
		"C:\\Users\\pkman\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
	WebDriver driver = new ChromeDriver();
  driver.navigate().to("https://demo.guru99.com/test/simple_context_menu.html");
  driver.manage().window().maximize();
  WebElement target = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
  Actions act = new Actions(driver);
  act.contextClick(target).perform();
  Thread.sleep(2000);
  driver.findElement(By.xpath("//*[text()='Quit']")).click();
  driver.switchTo().alert().accept();
  
  WebElement target1 = driver.findElement(By.xpath("//*[text()='Double-Click Me To See Alert']"));
  act.doubleClick(target1).perform();
  Thread.sleep(2000);
  driver.switchTo().alert().accept();
	}
}