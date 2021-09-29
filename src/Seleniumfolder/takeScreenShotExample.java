package Seleniumfolder;

import java.io.File;
import java.io.IOException;
import java.util.NoSuchElementException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class takeScreenShotExample {

	public static <TakeScreenshot> void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Surya Chowdary\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		try {
		driver.findElement(By.id("twotabsearchtextboxsd")).sendKeys("Samsung");
		}catch(NoSuchElementException e) {
			System.out.println("Hello there is a exception");
		}
	
		TakeScreenshot screenshot = ((TakeScreenshot)driver);//Create interface
		
		File scrshtsave =  ((TakesScreenshot) screenshot).getScreenshotAs(OutputType.FILE);//Create file to save the SS
		
		File location = new File("D:\\Selenium\\Class 36\\homepage1.png");//location
		
		FileUtils.copyFile(scrshtsave,location);//SAving 
	
		
	}

}
