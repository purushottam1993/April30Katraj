package checkbox;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CkeckDynamicChkBx {

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		
	ChromeDriver driver = new ChromeDriver();
	driver.navigate().to("https://demoqa.com/checkbox");
	driver.manage().window().maximize();
		
	driver.findElement(By.xpath("//*[@class='rct-checkbox']")).click();
	driver.findElement(By.xpath("//*[@class='rct-checkbox']")).click();
	driver.findElement(By.xpath("//*[@title='Toggle']")).click();
		
 driver.findElement(
 By.xpath("//*[text()='Desktop']//ancestor::Label//span//*[@class='rct-icon rct-icon-uncheck']")).click();
	
	Thread.sleep(1000);
	driver.quit();
	}
}
