package Seleniumfolder;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingLinksPartial {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Surya Chowdary\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		
		WebElement SignIn_Link = driver.findElement(By.partialLinkText("Sign"));
		SignIn_Link.click();
		
		WebElement Forgot_link = driver.findElement(By.partialLinkText("Forgot your "));
		Forgot_link.click();
		
		WebElement EmailAdd_TextBox = driver.findElement(By.id("email"));
		EmailAdd_TextBox.sendKeys("xyz@xyz.com");
		
		WebElement BackToLogin_link = driver.findElement(By.linkText("Back to Login"));
		BackToLogin_link.click();
		
	//	driver.quit();
		
		
	}

}
