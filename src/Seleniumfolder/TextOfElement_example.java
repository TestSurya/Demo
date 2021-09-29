package Seleniumfolder;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextOfElement_example {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Surya Chowdary\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		//driver.manage().window().maximize();
		
		driver.get("http://automationpractice.com/index.php");
		
		WebElement phoneText = driver.findElement(By.xpath("//span[@class='shop-phone']/strong"));
		System.out.println(phoneText.getText());
		WebElement bestSeller_text= driver.findElement(By.xpath("//ul[@id='home-page-tabs']//li[2]/a"));
		System.out.println(bestSeller_text.getText());
	
		WebElement Paragraph =driver.findElement(By.xpath("(//div[@class='col-xs-6'])[2]//p[2]"));
		System.out.println(Paragraph.getText());
		
		driver.getCurrentUrl();
		driver.getPageSource();
	}

}
