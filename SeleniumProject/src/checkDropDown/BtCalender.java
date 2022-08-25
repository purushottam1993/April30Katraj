package checkDropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BtCalender {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\pkman\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://demo.automationtesting.in/Datepicker.html");
	driver.manage().window().maximize();
		
	driver.findElement(By.id("datepicker1")).click();
	int i=0;
	while(i==0) {
	driver.findElement(By.xpath
	("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
	String text = driver.findElement(By.xpath
	("//div[@class='ui-datepicker-title']")).getText();
	if(text.equals("August 1993"))
	  break;
	}
	
	driver.findElement(By.xpath("//a[text()='27']")).click();
}
}
