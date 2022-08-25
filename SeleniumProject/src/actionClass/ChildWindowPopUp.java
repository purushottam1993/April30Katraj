
package actionClass;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindowPopUp {
	
public static void main(String[] args) throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", 
		"C:\\Users\\pkman\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://groww.in/");
		driver.manage().window().maximize();
		String Window1 = driver.getWindowHandle();
		driver.findElement(By.xpath("//span[text()='Login/Register']")).click();
		Thread.sleep(2000);
		Set<String> Window2 = driver.getWindowHandles();
         try {
		driver.findElement(By.id("login_email1")).sendKeys("xyz@gmail.com");
        }
         catch(Exception e) {
        for(String window:Window2)
        	if(!(window==Window1)) {
        	driver.switchTo().window(window);
        	driver.findElement(By.id("login_email1")).sendKeys("xyz@gmail.com");
         }
   }
 }
}
