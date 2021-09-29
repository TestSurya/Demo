package Seleniumfolder;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithTextBox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Surya Chowdary\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://automationpractice.com/index.php");
		
		//String StoreTitle = "My Store";
		//String ExpTitle = driver.getTitle();
		if (driver.getTitle().equals("My Store")) {
			System.out.println("The MainStore page opened");
			WebElement SignIn_Link = driver.findElement(By.partialLinkText("Sign"));
			SignIn_Link.click();
			
			
			if(driver.getTitle().equals("Login - y Store"))
			{
				WebElement Forgot_link = driver.findElement(By.partialLinkText("Forgot your "));
				Forgot_link.click();
			}
			
			else {
				driver.quit();
				
				System.out.println("Sigin opened but not correct");
			}
			
			
		}
		
		
		else {
			driver.quit();
			System.out.println("Page Opend but please check next steps");
		}
		
	}

}
