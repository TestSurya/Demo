package Seleniumfolder;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountingnoofFrames {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Surya Chowdary\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://developer.mozilla.org/en-US/docs/Web/html/element/iframe");
		
		driver.manage().window().maximize();
		
		
		
		
		List<WebElement> listframes =   driver.findElements(By.tagName("iframe"));
		System.out.println("Frames =" +listframes.size());
		
		List<WebElement> Link =   driver.findElements(By.tagName("a"));
		System.out.println("Links = " +Link.size());
	}

}
