package Seleniumfolder;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Surya Chowdary\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rediff.com/");
		
		WebElement SignIn =driver.findElement(By.linkText("Sign in"));
		SignIn.click();
		WebElement SignInbutton=driver.findElement(By.xpath("//input[@name='proceed']"));
		SignInbutton.click();
	
		Alert al=driver.switchTo().alert();
		String altmsg= al.getText();
	if(altmsg.equals("Please enter a valid user name"))
	{
		
		al.accept();
	System.out.println("User name Alert Validated");
	}
	else {
		System.out.println("Can't validate the alert");
	}
		WebElement UN=driver.findElement(By.id("login1"));
		WebElement PWD=driver.findElement(By.id("password"));
		UN.sendKeys("Surya@gmail.com");
		
		SignInbutton.click();
		String altmsg2= al.getText();
		if(altmsg2.equals("Please enter your password"))
		{
			
			al.accept();
		System.out.println("Pass word Alert Validated");
		}
		else {
			System.out.println("Can't validate the alert");
		}
		PWD.sendKeys("Hello@123");
	
	}

}
