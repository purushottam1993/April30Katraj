package iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ColorCheck {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\\\Users\\\\pkman\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
				
			WebDriver driver = new ChromeDriver();
			driver.get("https://jqueryui.com/slider/#colorpicker");
			driver.manage().window().maximize();
			WebElement iframe = driver.findElement(By.xpath("//*[@class='demo-frame']"));
			driver.switchTo().frame(iframe);
			WebElement redColor = driver.findElement(By.cssSelector("div#red"));
			String clr = redColor.getCssValue("background-color");
			System.out.println(clr);
	}
}