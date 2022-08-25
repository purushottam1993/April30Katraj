package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
      public class AlertHandling {
	  public static void main(String[] args) throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", 
		"C:\\Users\\pkman\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@name='alert']")).click();//Simple Alert
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//*[@name='confirmation']")).click(); //Conformation Alert
		driver.switchTo().alert().dismiss();
		
		driver.findElement(By.xpath("//*[@name='prompt']")).click(); //Prompt popUp
		Thread.sleep(2000);
		driver.switchTo().alert().sendKeys("Accept");
		driver.switchTo().alert().accept();
	}

}
