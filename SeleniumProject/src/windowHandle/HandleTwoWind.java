package windowHandle;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleTwoWind {
	
	 public static void main(String[] args) throws InterruptedException{
			System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
			
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
	     driver.manage().window().maximize();
	     String winId1 = driver.getWindowHandle();
	     System.out.println("Primary WindId: "+winId1);
	 	
      driver.findElement(By.xpath("//*[text()='OrangeHRM, Inc']")).click();
	    Set<String> allwinId = driver.getWindowHandles();
	    for(String eachwindId:allwinId) {
	     if(!eachwindId.equals(winId1)) {
	    	driver.switchTo().window(eachwindId);
	    	Thread.sleep(1000);
	    	//driver.findElement(By.xpath("//*[text()='Contact Sales']")).click();
	    	driver.findElement(By.xpath("//*[@type='email']")).sendKeys("abc@gmail.com");
	    	Thread.sleep(500);
	    	//
	    	
	    	driver.findElement(By.xpath("//input[@name='FullName']")).sendKeys("Purushottam");
	 }
	     driver.switchTo().window(winId1);
	     driver.findElement(By.id("txtUsername")).sendKeys("Velocity");
	    }
	    
	 }

}
