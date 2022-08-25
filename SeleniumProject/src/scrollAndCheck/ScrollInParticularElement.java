package scrollAndCheck;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollInParticularElement {
	
	  public static void main(String[] args) throws InterruptedException{
			System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
			
			ChromeDriver driver = new ChromeDriver();
			driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
			driver.manage().window().maximize();
			driver.findElement(By.cssSelector("#txtUsername")).sendKeys("Admin");
			driver.findElement(By.cssSelector("#txtPassword")).sendKeys("admin123");
			driver.findElement(By.cssSelector("#btnLogin")).click();
			driver.findElement(By.id("menu_pim_viewPimModule")).click();
			driver.findElement(By.id("menu_pim_viewEmployeeList")).click();
//WebElement checkBoxNeedToCheck = driver.findElement(By.xpath("//*[text()='Rebecca']//parent::td//preceding-sibling::td//input[@type='checkbox']"));
			WebElement checkBoxNeedToCheck = driver.findElement(By.xpath(
			"//*[text()='Rebecca']//parent::td//preceding-sibling::td//input"));
			JavascriptExecutor js =  (JavascriptExecutor)driver;
			js.executeScript("arguments[0].scrollIntoView()",checkBoxNeedToCheck);
			Thread.sleep(1000);
			checkBoxNeedToCheck.click();
	  }

}
