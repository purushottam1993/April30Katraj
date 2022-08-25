package iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrameCheck {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
		"C:\\\\Users\\\\pkman\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		
	WebDriver driver = new ChromeDriver();
	driver.navigate().to("https://demoqa.com/frames");
	driver.manage().window().maximize();
	WebElement iframe = driver.findElement(By.id("frame2"));
	driver.switchTo().frame(iframe);
	//Boolean Sentence = driver.findElement(By.id("sampleHeading")).getText().equals("This is a sample page");
	   //  System.out.println(Sentence);
	String txt = driver.findElement(By.id("sampleHeading")).getText();
	  System.out.println(txt);
	
	}

}
