package Seleniumfolder;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameExample {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Surya Chowdary\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://www.selenium.dev/");
		driver.get("https://developer.mozilla.org/en-US/docs/Web/html/element/iframe");
		
		/*WebElement documentation_link= driver.findElement(By.linkText("Documentation"));
		documentation_link.click();
		//WebElement  freely_available_link =driver.findElement(By.xpath("//a[text()='freely available']"));
		//freely_available_link.click();
		WebElement WebDriver_link =driver.findElement(By.xpath("//a[text()='WebDriver']"));
		WebDriver_link.click();
		//WebElement RemoteWebDriver_link =driver.findElement(By.xpath("//a[text()='Remote WebDriver']"));
		//RemoteWebDriver_link.click();
		WebElement browsing_context_link= driver.findElement(By.linkText("browsing context"));
		browsing_context_link.click();
		WebElement Tech_button =driver.findElement(By.id("technologies-button"));
		Tech_button.click();
		WebElement RemoteWebDriver_link =driver.findElement(By.xpath("//li[@id='m-documentation-li']//a[@id='m-documentationwebdriverremote_webdriver']"));
		RemoteWebDriver_link.click();*/
		WebElement Reset_button=driver.findElement(By.id("reset"));
		Reset_button.click();
	}

}
