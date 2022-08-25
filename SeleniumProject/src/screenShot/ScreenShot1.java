package screenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot1 {
	static WebDriver driver;
	public void SS1() throws IOException {
		TakesScreenshot shot = (TakesScreenshot)driver;
		File source = shot.getScreenshotAs(OutputType.FILE);
		File store = new File("D:\\Purush doc\\Slenium Screenshot\\Velocity30April.png");
		FileHandler.copy(source, store);
	}
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		
		 driver = new ChromeDriver();
		driver.navigate().to("https://mbasic.facebook.com/");
		driver.manage().window().maximize();
		
		ScreenShot1 PrtSc = new ScreenShot1();
		PrtSc.SS1();
		Thread.sleep(1000);
		driver.quit();
	}
}
