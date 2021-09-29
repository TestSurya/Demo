package Seleniumfolder;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Surya Chowdary\\Downloads\\chromedriver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		
		driver.get("http://automationpractice.com/index.php");
		
		//driver.manage().window().maximize();
	
		driver.manage().timeouts().pageLoadTimeout(3, TimeUnit.SECONDS);
		
		WebElement signInlink = driver.findElement(By.linkText("Sign in"));
	
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("arguments[0].click();", signInlink);
		
		WebElement emailTxt = driver.findElement(By.id("email"));
		WebElement passwordTxt = driver.findElement(By.id("passwd"));
		WebElement LoginLink = driver.findElement(By.id("SubmitLogin"));
		
		
		
		js.executeScript("arguments[0].value='suryatest123@gmail.com';", emailTxt);
		js.executeScript("arguments[0].value='asdfg@1234';", passwordTxt);
	
		
		
	}

}
