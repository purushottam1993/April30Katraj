package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText {
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver",
		"C:\\Users\\pkman\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.manage().window().minimize();
		Thread.sleep(2000);
		
		WebElement lgnpanel = driver.findElement(By.xpath("//div[contains(text(),'LOGIN')]"));

		String Panel = lgnpanel.getText();
		System.out.println(Panel);
		
	}

}
