package configFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class configProperties {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe" );
		
	File path = new File("D:\\Purush doc\\New Automation Doc 26-05-2022\\SeleniumProject\\config.properties");
		
		FileInputStream loadfile = new FileInputStream(path);
		Properties prop = new Properties();//we want to apply properties method into .file 
		                                     //i.e we load file into the properties method
		prop.load(loadfile);
		WebDriver driver = new ChromeDriver();
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		driver.findElement(By.id("txtUsername")).sendKeys(prop.getProperty("userName"));
		driver.findElement(By.id("txtPassword")).sendKeys(prop.getProperty("password"));
		driver.findElement(By.id("btnLogin")).click();
	}
}
