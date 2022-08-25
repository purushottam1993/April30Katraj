package windowHandle;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleMultipleWind {
	
	 public static void main(String[] args) throws InterruptedException{
			System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
			
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
	     driver.manage().window().maximize();
	     String winId1 = driver.getWindowHandle();
	     System.out.println("Primary windId: "+winId1);
	     driver.findElement(By.xpath("//*[contains(text(),'OrangeHRM, Inc')]")).click();
	     Set<String> allwindId = driver.getWindowHandles();
	     for(String eachwindId:allwindId) {
	    	 driver.switchTo().window(eachwindId);
	     if(driver.getTitle().contains(
	    "OrangeHRM HR Software | Free &amp; Open Source HR Software | HRMS | HRIS » Orangehrm")) {
	    	 Thread.sleep(500);
	 
	    	 driver.findElement(By.xpath("//*[text()='Contact Sales']")).click();
	    	 Thread.sleep(1000);
	    	 driver.findElement(By.xpath("//input[@name='FullName']")).sendKeys("Purushottam");
	 }
	     }
	     Thread.sleep(1000);
	     driver.switchTo().window(winId1);
	 }
	 
}
