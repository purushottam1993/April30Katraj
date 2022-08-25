package windowHandle;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckMultipleWind {
	
	 public static void main(String[] args) throws InterruptedException{
			System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
			
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
	     driver.manage().window().maximize();
	     String winId1 = driver.getWindowHandle();
	     System.out.println("Primary WindId: "+winId1);
	
	    driver.findElement(By.xpath("//*[text()='OrangeHRM, Inc']")).click();
	    
	    Set<String> allWinId = driver.getWindowHandles();
	    for(String eachWinId:allWinId)
	    	System.out.println(eachWinId);
	     //driver.findElement(By.xpath("//*[text()='Contact Sales']")).click();
	       
	 }
}
