package Seleniumfolder;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AssigVerifyinChrome {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Surya Chowdary\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		String pTitle = driver.getTitle();
		System.out.println(pTitle);
		
		String myExpTitle = "Facebook – log in or sign up";
		System.out.println(pTitle.equals(myExpTitle));
		
		driver.get("https://www.gmail.com");
		String pTitle1 = driver.getTitle();
		System.out.println(pTitle1);
				
		String myExpTitle1 = "Gmail";
		System.out.println(pTitle.equals(myExpTitle1));
		
		
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Surya Chowdary\\Downloads\\geckodriver-v0.29.1-win64\\geckodriver.exe");
		WebDriver driver2= new FirefoxDriver();

		driver2.get("https://www.facebook.com");
		String pTitle2 = driver2.getTitle();
		System.out.println(pTitle2);
		String myExpTitle2 = "Facebook – log in or sign up";
		System.out.println(pTitle.equals(myExpTitle2));
		driver2.get("https://www.gmail.com");
		String pTitle3 = driver2.getTitle();
		System.out.println(pTitle3);
				
		String myExpTitle3 = "Gmail";
		System.out.println(pTitle2.equals(myExpTitle3));
		
		System.out.println(pTitle.equals(pTitle2));
		
		
		
	}

}
