package Seleniumfolder;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class verifyFacebookTitle {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Surya Chowdary\\Downloads\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); // I can use all the methods of WebDriver
		
		
		driver.get("https://www.facebook.com"); // get method is used to launch/open a url
		//System.out.println(driver.getTitle());	//This method will get the title of the page in strong format
		
		String pTitle = driver.getTitle();
		System.out.println(pTitle);
		
		String myExpTitle ="Facebook – log in or sign up";
		String myExpTitle2 ="gmail";
		
		System.out.println(pTitle.equals(myExpTitle));
		System.out.println(pTitle.equals(myExpTitle2));
		
	
	
	
	
	}

}
