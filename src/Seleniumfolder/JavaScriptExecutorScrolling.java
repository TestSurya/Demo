package Seleniumfolder;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorScrolling {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Surya Chowdary\\Downloads\\chromedriver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		
		driver.get("http://automationpractice.com/index.php");
		
		driver.manage().window().maximize();
	
		driver.manage().timeouts().pageLoadTimeout(3, TimeUnit.SECONDS);
		
		WebElement bottomLink = driver.findElement(By.linkText("Our stores"));
		WebElement UpperLink = driver.findElement(By.linkText("Sign in"));
		
	
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("arguments[0].scrollIntoView();",bottomLink);
		Thread.sleep(5000);//This is given to check the scrolling has been implemented or not
		js.executeScript("arguments[0].scrollIntoView();",UpperLink);
		
		
//		js.executeScript("window.scrollBy(0,5000)");// X & Y coordinates of a page
//		js.executeScript("window.scrollBy(0,1000)");

	}

}
