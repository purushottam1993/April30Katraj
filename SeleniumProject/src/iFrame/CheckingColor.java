package iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CheckingColor {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\\\Users\\\\pkman\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
				
			WebDriver driver = new ChromeDriver();
			driver.get("https://jqueryui.com/slider/#colorpicker");
			driver.manage().window().maximize();
			WebElement iframe = driver.findElement(By.xpath("//*[@class='demo-frame']"));
			driver.switchTo().frame(iframe);
		/*WebElement clrValue = driver.findElement(By.cssSelector("#red div"));
		//String colorRGBvalue = clrValue.getCssValue("color");
		String colorRGBvalue = clrValue.getCssValue("background-color");
		System.out.println(colorRGBvalue);*/
			WebElement redbarSlide = driver.findElement(By.cssSelector("#red div"));
			WebElement bluebarSlide = driver.findElement(By.cssSelector("#blue div"));
			WebElement greenbarSlide = driver.findElement(By.cssSelector("#green div"));
			
			/*Actions act = new Actions(driver);
		act.clickAndHold(redbarSlide).moveToElement(redbarSlide, 600 , 0).release().build().perform();
		Thread.sleep(1000);
		act.clickAndHold(bluebarSlide).moveToElement(bluebarSlide, 300 , 0).release().build().perform();
		Thread.sleep(2000);
		act.clickAndHold(greenbarSlide).moveToElement(greenbarSlide, 200, 0).release().build().perform();*/
          Thread.sleep(3000);
		String redbar = redbarSlide.getCssValue("background-color");
        String bluebar = bluebarSlide.getCssValue("background-color");
		String greenbar = greenbarSlide.getCssValue("background-color");
		Thread.sleep(2000);
		WebElement colorgrup = driver.findElement(By.id("swatch"));
		String clrgr = colorgrup.getCssValue("color");
		
		System.out.println(redbar);
		System.out.println(bluebar);
		System.out.println(greenbar);
		System.out.println(clrgr);
		
	}

}
