package Seleniumfolder;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingNameLocatorinFacebook {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Surya Chowdary\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		WebElement Email_Textbox = driver.findElement(By.name("email"));
		Email_Textbox.sendKeys("Surya");
		WebElement Password_Textbox = driver.findElement(By.name("pass"));
		Password_Textbox.sendKeys("xyzabcdef@123");
		WebElement Login_Button = driver.findElement(By.name("login"));
		Login_Button.click();

	}

}
