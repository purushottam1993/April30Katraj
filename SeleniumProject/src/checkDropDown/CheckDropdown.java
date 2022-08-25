package checkDropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
    public class CheckDropdown {
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\pkman\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://mbasic.facebook.com/");
		driver.manage().window().maximize();
		
	    driver.findElement(By.name("sign_up")).click();
	    driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Purushottam");
	    driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Mangate");
	    driver.findElement(By.name("reg_email__")).sendKeys("pkmangate93@gmail.com");
	    
	    List<WebElement> dayList = driver.findElements(By.xpath("//*[@id='day']//option"));
	    for(WebElement day:dayList) {
	    	//System.out.println(day.getText()); [list of day show]
	    	if(day.getText().equals("27"))
	    		day.click();
	    }
	      List<WebElement> monthList = driver.findElements(By.xpath("//*[@id='month']//option"));
	    for(WebElement month:monthList) {
	    	if(month.getText().equals("Aug"))
	    		month.click();
	    }
	    	List<WebElement> Years = driver.findElements(By.xpath("//*[@id='year']//option"));
	    	for(WebElement year:Years) {
	    		if(year.getText().equals("1993"))
	    			year.click();
	  }
	    Thread.sleep(2000);
	         //driver.quit();
	}
}
