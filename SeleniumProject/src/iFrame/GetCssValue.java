
package iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GetCssValue {
	
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", 
		"C:\\\\Users\\\\pkman\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		
	WebDriver driver = new ChromeDriver();
	driver.get("https://jqueryui.com/slider/");
	WebElement iframe = driver.findElement(By.cssSelector(".demo-frame"));
	driver.switchTo().frame(iframe);
	WebElement source = driver.findElement(By.id("slider"));
	Thread.sleep(2000);
	Actions act = new Actions(driver);
	//act.clickAndHold(source).moveToElement(source, 600, 0).release().build().perform();
	act.clickAndHold(source).moveToElement(source, 300, 0).release().build().perform();
	//act.dragAndDropBy(source, 600, 0).perform();
	}
}
