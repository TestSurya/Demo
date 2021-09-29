package Seleniumfolder;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Surya Chowdary\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		/*driver.get("https://www.google.com");
		String pTitle = driver.getTitle();
		System.out.println(pTitle);*/
		
		/*driver.get("https://www.gmail.com");
		String pTitle1 = driver.getTitle();
		System.out.println(pTitle1);*/
				
		driver.get("https://www.facebook.com");
		String pTitle2 = driver.getTitle();
		System.out.println(pTitle2);
		
		//String myExpTitle = "Gmail";
		//System.out.println(pTitle1.equals(myExpTitle));
		
		//driver.quit();//it will close all the browsers windows current and previous 
		//driver.close();//it will close only current opened broswer
	}

}
