package radioButton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckSelected {
	
	 public static void main(String[] args) throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
				
		  ChromeDriver driver = new ChromeDriver();
		  driver.navigate().to("https://demoqa.com/checkbox");
		  driver.manage().window().maximize();
				
		driver.findElement(By.xpath("//*[@class='rct-checkbox']")).click();
		 driver.findElement(By.xpath("//*[@class='rct-checkbox']")).click();
		driver.findElement(By.xpath("//*[@title='Toggle']")).click();
				
  /*boolean CheckBox = driver.findElement(
 By.xpath("//*[text()='Desktop']//ancestor::Label//span//*[@class='rct-icon rct-icon-uncheck']")).isSelected();
    System.out.println(CheckBox);*/
  WebElement CheckBox = driver.findElement(
  By.xpath("//*[text()='Desktop']//ancestor::Label//span//*[@class='rct-icon rct-icon-check']"));
  //CheckBox.click();
  Thread.sleep(2000);
    String AttValue = CheckBox.getAttribute("class");  
    if(AttValue.contains("-check"))
    	System.out.println("CheckBox is UnChecked");
    else
    	System.out.println("CheckBox is Checked");
	 }

}
