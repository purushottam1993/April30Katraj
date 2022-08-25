package testSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TitleAndURL {
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\pkman\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		//driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		String title = driver.getTitle();
		String url = driver.getCurrentUrl();
		System.out.println(title);
		System.out.println(url);
			
	}

}
