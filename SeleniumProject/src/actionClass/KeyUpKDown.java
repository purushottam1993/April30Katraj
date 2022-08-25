package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyUpKDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\pkman\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().window().maximize();
		
	WebElement txtfield = driver.findElement(By.id("email"));
  Actions act = new Actions(driver);
 act.sendKeys(txtfield,"Purush").keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
	act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
	     Thread.sleep(2000);
	  WebElement txtpaste = driver.findElement(By.name("pass"));
	      txtpaste.click();
	  act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
		      
	}
}
