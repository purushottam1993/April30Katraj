package radioButton;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetClickk {


	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://mbasic.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@value='Create New Account']")).click();
		
		driver.findElements(By.xpath("//input[@type='radio']")).get(1).click();
		Thread.sleep(1000);
		driver.quit();

	}
}
