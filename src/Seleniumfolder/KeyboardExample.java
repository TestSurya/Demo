package Seleniumfolder;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class KeyboardExample {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Surya Chowdary\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		
		driver.get("https://fastaglogin.icicibank.com/CUSTLOGIN/Default.aspx");
		
		driver.manage().window().maximize();
	
	
		WebElement cartButton = driver.findElement(By.xpath("//input[@id='rdIndividualLogin']"));
		
	

//		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		Actions mouseHover = new Actions(driver);
		
		
//		Action moveToElement = mouseHover.moveToElement(cartButton).click().build();
//		
//		moveToElement.perform();
		
//		Action moveToElement = mouseHover.moveToElement(cartButton).contextClick().build();
//		
//		moveToElement.perform();
		

		Action moveToElement = mouseHover.moveToElement(cartButton).doubleClick().build();
	
		moveToElement.perform();
		
	
		
		Thread.sleep(10000);
		WebElement CheckMobile = driver.findElement(By.xpath("//input[@id='chkLoginviaMobileNumber']"));
		
	//	CheckMobile.click();
		
		Action click = mouseHover.moveToElement(CheckMobile).click().build();
		click.perform();
		
		

		
	}

}
