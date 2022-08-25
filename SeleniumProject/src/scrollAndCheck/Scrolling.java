  package scrollAndCheck;

  import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

   public class Scrolling {
	  
	  public static void main(String[] args) throws InterruptedException{
			System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
			
			ChromeDriver driver = new ChromeDriver();
			//driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
			driver.navigate().to("https://github.com/StMarco89/automationpractice.com");
			driver.manage().window().maximize();

		/*driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		
		driver.findElement(By.xpath("//*[@id='menu_admin_viewAdminModule']")).click();
		driver.findElement(By.xpath("//*[@id='menu_admin_viewAdminModule']")).click();*/
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,900)");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,-700)");	
	  }
}
