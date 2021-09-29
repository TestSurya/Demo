package Seleniumfolder;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkwithObjectPRoperly2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Surya Chowdary\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		WebElement email_textbox = driver.findElement(By.id("email"));
		
		WebElement Password_textbox = driver.findElement(By.id("pass"));
		
		if(email_textbox.isDisplayed()) {
		System.out.println("Email text box is present and going to enter the data");
		email_textbox.clear();
		email_textbox.sendKeys("Surya");
		}
		else {
			System.out.println("Email text box is missing");
		}
		if(Password_textbox.isDisplayed()) {
			System.out.println("Password textbox  is present and going to enter the data");
			Password_textbox.clear();
			Password_textbox.sendKeys("Surya@123");
		}
			else {
				System.out.println("Password textbox  is missing");
			}
	}

}
