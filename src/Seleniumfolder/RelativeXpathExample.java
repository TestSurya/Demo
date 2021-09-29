package Seleniumfolder;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpathExample {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Surya Chowdary\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://automationpractice.com/index.php");
		
		WebElement SignIn_Link = driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a"));
		SignIn_Link.click();
		if(driver.getTitle().equals("Login - My Store"))
		{
			Thread.sleep(5000);
			WebElement EmailID_crt = driver.findElement(By.xpath("//*[@id=\"email_create\"]"));
			EmailID_crt.sendKeys("surya@gmail.com");
			Thread.sleep(5000);
			WebElement Create_btn =driver.findElement(By.xpath("//*[@id=\"SubmitCreate\"]"));
			Create_btn.click();
		}

	}

}
