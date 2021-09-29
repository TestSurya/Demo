package Seleniumfolder;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithIDLocator {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Surya Chowdary\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		//<WebElement><Name> = driver.findElement(By.<Locator>).Action
		WebElement Search_Textbox = driver.findElement(By.id("search_query_top"));
		Search_Textbox.sendKeys("Surya");
		
		
	
	
	
	
	}

}
