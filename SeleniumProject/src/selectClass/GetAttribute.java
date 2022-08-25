package selectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttribute {
	

	 public static void main(String[] args) throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
			
	  ChromeDriver driver = new ChromeDriver();
	  driver.navigate().to("https://mbasic.facebook.com/reg/?cid=103&refsrc=deprecated&_rdr");
	  driver.manage().window().maximize();
	  
    String AttValue = driver.findElement(By.xpath("//input[@name='firstname']")).getAttribute("name");
			System.out.println(AttValue);

	 }
}
//getAttribute()-- The getAttribute() method of the Element interface 
//returns the value of a specified attribute on the element. 
//If the given attribute does not exist,
//the value returned will either be null or (the empty string)