package selectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IsSelectedMethod {
	
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://mbasic.facebook.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@value='Create New Account']")).click();
		Thread.sleep(1000);
		
		WebElement day = driver.findElement(By.xpath("//*[@id='day']"));
		WebElement month = driver.findElement(By.xpath("//*[@id='month']"));
		WebElement year = driver.findElement(By.xpath("//*[@id='year']"));
//Slect ByIndex(0),SelectByValue(1) and SelectByText(Name)Is Applicable..
		Select selday = new Select(day);
		selday.selectByIndex(27); //day not requir double inverted quama
		Select selmonth = new Select(month);
		selmonth.selectByValue("8");
		Thread.sleep(1000);
		Select selyear = new Select(year);
		selyear.selectByVisibleText("1993");
		
		
		
	}

}
