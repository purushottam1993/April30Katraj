package locator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatrXpath {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
		"C:\\Users\\pkman\\Downloads\\chromedriver_win32\\chromedriver.exe");
				
			WebDriver driver = new ChromeDriver();
			driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
				
				driver.manage().window().maximize();
				/*String title = driver.getTitle();
				System.out.println(title);
				String url = driver.getCurrentUrl();
				System.out.println(url);*/
				 
			driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
			
			driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin123");
			
		    driver.findElement(By.id("btnLogin")).click();
		    
		    //driver.findElement(By.xpath("//b[text()='Admin']")).click();
		    
	 driver.findElement(By.xpath("//*[text()='PIM']")).click();
 //driver.findElement(By.xpath("//*[@id='resultTable']//tbody//tr//td//a[text()='Aaliyah']")).click();
	 driver.findElement
 (By.xpath("//a[text()='Aaliyah']//parent::td//ancestor::table//tbody//input[@type='checkbox']")).click();
	 
	 Thread.sleep(2000);
 
	 driver.findElement(By.id("welcome")).click();
	 driver.findElement(By.linkText("Logout")).click();
	}


}
