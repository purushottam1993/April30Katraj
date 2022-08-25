package testSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckTest {
	
	public static void main(String[] args) throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\pkman\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver	= new ChromeDriver();
	
	    //driver.get("https://www.facebook.com/");
          //Thread.sleep(2000);
          driver.manage().window().maximize();
          driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
          Thread.sleep(2000);
          driver.quit();
          
          WebElement userName = driver.findElement(By.name("txtUsername"));
          userName.sendKeys("Admin");
          
          WebElement passWord = driver.findElement(By.id("txtPassword"));
          passWord.sendKeys("Admin123");
          
          WebElement loginBut = driver.findElement(By.id("btnLogin"));
          
          loginBut.click();
          Thread.sleep(2000);
          driver.quit();
          
	}


}
