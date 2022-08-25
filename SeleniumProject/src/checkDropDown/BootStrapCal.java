package checkDropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BootStrapCal {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\pkman\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
	WebDriver driver = new ChromeDriver();
	driver.get("https://demo.automationtesting.in/Datepicker.html");
	driver.manage().window().maximize();
		
	driver.findElement(By.xpath("//input[@id='datepicker2']")).click();
	
	WebElement month = driver.findElement(By.xpath(
			"//div[@class='datepick-month-header']//parent::select[@title='Change the month']"));
			Select mnth = new Select(month);
			mnth.selectByIndex(7);
			
	driver.findElement(By.xpath
("//select[@class='datepick-month-year']//following-sibling::select//option[contains(text(),'▲')]")).click();
WebElement Years = driver.findElement(By.xpath
	("//select[@class='datepick-month-year']//following-sibling::select"));
	 
       Select selyr = new Select(Years);
		selyr.selectByValue("8/1993");
		Thread.sleep(2000);
	driver.findElement(By.xpath("//a[text()='27']")).click();
		
		
		}	
	}


