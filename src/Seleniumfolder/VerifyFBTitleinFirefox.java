package Seleniumfolder;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class VerifyFBTitleinFirefox {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Surya Chowdary\\Downloads\\geckodriver-v0.29.1-win64\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		
		driver.get("https://www.gmail.com");
		String pTitle1 = driver.getTitle();
		System.out.println(pTitle1);
				
		driver.get("https://www.facebook.com");
		String pTitle2 = driver.getTitle();
		System.out.println(pTitle2);
		
		
		
		driver.quit();//it will close all the browsers windows current and previous 
		
		
		
		

	}

}
