package Seleniumfolder;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameMailExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Surya Chowdary\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
	
		driver.get("https://developer.mozilla.org/en-US/docs/Web/html/element/iframe");
		
		WebElement framename=driver.findElement(By.xpath("//iframe[@title='MDN Web Docs Interactive Example']"));
		
		driver.switchTo().frame(framename);//Switching to frame by Xpath
		
		//driver.switchTo().frame(0);//Switching from main page to frame by Index
		
		WebElement CSS_button=driver.findElement(By.id("css"));
		CSS_button.click();
		
		WebElement html_button=driver.findElement(By.id("html"));
		html_button.click();
		
		driver.switchTo().parentFrame();//moves back to page
		
		WebElement Brswer_cnt= driver.findElement(By.linkText("browsing context"));
		Brswer_cnt.click();
	
	}

}
