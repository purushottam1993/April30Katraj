package windowHandle;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleChildWindPopUp {
	
	 public static void main(String[] args) throws InterruptedException{
			System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
			
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://groww.in/");
		driver.manage().window().maximize();
		String windId1 = driver.getWindowHandle();
		driver.findElement(By.xpath("//*[text()='Login/Register']")).click();
		Thread.sleep(2000);
		Set<String> windId2 = driver.getWindowHandles();
		int a = windId2.size();
		if(a==1) {  //size gives no. of Element would be available
			driver.findElement(By.xpath("//*[@id='login_email1']")).sendKeys("abcc@gmail.com");
		}
	 else {
		 
	   for(String windId:windId2)
		if(!(windId==windId1)) {
			driver.switchTo().window(windId);
		driver.findElement(By.xpath("//*[@id='login_email1']")).sendKeys("abc@gmail.com");
		}
	   
	 }
	 }

}
