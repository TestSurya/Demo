package Seleniumfolder;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BroswerNavigationExample {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Surya Chowdary\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		driver.navigate().to("https://www.facebook.com");
		System.out.println(driver.getTitle());
		driver.navigate().to("https://www.flipkart.com");
		System.out.println(driver.getTitle());
		driver.navigate().refresh();
		System.out.println(driver.getTitle());
		driver.navigate().to("https://www.google.com");
		System.out.println(driver.getTitle());
		driver.navigate().back();
		
		System.out.println(driver.getTitle());
		
		
		
		
		
		//driver.quit();//it will close all the browsers windows current and previous 
		
		
		

	}

}
