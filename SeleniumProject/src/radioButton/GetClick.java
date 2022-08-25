package radioButton;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetClick {
	
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.easemytrip.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[text()='Flights']")).click();
		driver.findElement(By.xpath("//input[@id='FromSector_show']")).click();
		driver.findElement(By.xpath("//*[text()='Round-Trip']")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		driver.findElement(By.xpath("//input[@id='FromSector_show']")).click();
		driver.findElement(By.xpath("//*[@class='ar-m']//span[@id='airport3']")).click();
		driver.findElement(By.xpath(
		"//span[@id='spn4']//parent::div//following-sibling::div//*[contains(text(),'Netaji')]")).click();
		driver.findElement(By.xpath("//Li[@id='snd_4_11/08/2022']")).click();
		driver.findElement(By.xpath("//Li[@id='snd_5_12/08/2022']")).click();
		driver.findElement(By.xpath("//span[@class='drpNoTrv']")).click();
		driver.findElement(By.xpath("//input[@class='plus_box1']")).click();
		driver.findElement(By.xpath("//a[@class='dn_btn']")).click();
		driver.findElement(By.xpath("//input[@value='Search']")).click();
		Thread.sleep(3000);
		driver.findElements(By.xpath("//*[@class='ckmark-rdo']")).get(1).click();
		driver.findElement(By.xpath("//input[@class='inptBx2 ng-pristine ng-valid ng-empty ng-touched']")).click();
		driver.findElement(By.xpath("//Li[@id='trd_1_15/08/2022']")).click();
		driver.findElement(By.xpath("//input[@class='inptBx2 ng-pristine ng-valid ng-empty ng-touched']")).click();
		driver.findElement(By.xpath("//Li[@id='trd_4_18/08/2022']")).click();
		driver.findElement(By.xpath("//span[@class='ckmark-rdo']")).click();
		driver.findElement(By.xpath("//*[@id='pAI']//following-sibling::span")).click();
		driver.findElement(By.cssSelector(
		"//*[@class='col-md-3 col-sm-5 col-xs-10 mr']//following-sibling::div//parent::div//div//Li//div[@class='check']")).click();
		//driver.findElement(By.id("dvfarecal")).click();
	}

}
