package Seleniumfolder;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_Selector_example {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Surya Chowdary\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://automationpractice.com/index.php");
		WebElement SignIn_Link = driver.findElement(By.linkText("Sign in"));
		SignIn_Link.click();
		Thread.sleep(5000);
		WebElement EmailID_crt = driver.findElement(By.cssSelector("input[id='email']"));
		EmailID_crt.sendKeys("surya@gmail.com");
	}

}
