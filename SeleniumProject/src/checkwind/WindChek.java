package checkwind;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindChek {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		String windId1 = driver.getWindowHandle();
		System.out.println("primary windId: "+windId1);
		driver.findElement(By.xpath("//*[text()='OrangeHRM, Inc']")).click();
		Set<String> allwindId = driver.getWindowHandles();
		for(String eachwindId:allwindId) {
	if(!(eachwindId.equals(windId1))){
			driver.switchTo().window(eachwindId);
		driver.findElement(By.xpath("//*[@type='email']")).sendKeys("abc@gmail.com");
	}
		}
		driver.switchTo().window(windId1);
	
	}
}
