package radioButton;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledDisabled {
	

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://mbasic.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@value='Create New Account']")).click();
		
		driver.findElements(By.xpath("//input[@type='radio']")).get(1).click();
	   boolean check = 	driver.findElements(By.xpath("//input[@type='radio']")).get(1).isSelected();
	   Thread.sleep(1000);
	   boolean check1 = driver.findElements(By.xpath("//input[@name='sex']")).get(0).isEnabled();
	   boolean check2 = driver.findElements(By.xpath("//input[@name='sex']")).get(2).isDisplayed();
	   
	   System.out.println(check);
	   System.out.println(check1);
	   System.out.println(check2);
	   


	}
}
