package Seleniumfolder;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MethodsExample {
	WebDriver driver;

	public void setupChrome() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Surya Chowdary\\Downloads\\chromedriver\\chromedriver.exe");
	}
	
	public void setupDriverMaxmimum() {
		driver =new ChromeDriver();
		//driver.manage().window().maximize();
	}
	
	public void launchURL() {
		driver.get("http://automationpractice.com/index.php");
	}
	
	public void verifyPageTitle() {
		String pTitle = driver.getTitle();
		if(pTitle.equals("My Store")) {
			System.out.println("User is on Correct page");
		}
		else {
			System.out.println("In correct page");
		}
	}
	
	public void ClickSignIn() {
		
		WebElement SignIn = driver.findElement(By.linkText("Sign in"));
		SignIn.click();
	
	}
	
	public void loginApp(String UN,String PW) {
		WebElement Email= driver.findElement(By.id("email"));
		Email.sendKeys(UN);
		WebElement password= driver.findElement(By.id("passwd"));
		password.sendKeys(PW);
		WebElement submit= driver.findElement(By.id("SubmitLogin"));
		submit.click();
		
		
	}
	public static void main(String[] args) {
		MethodsExample obj = new MethodsExample();
		obj.setupChrome();
		obj.setupDriverMaxmimum();
		obj.launchURL();
		obj.verifyPageTitle();
		obj.ClickSignIn();
		obj.loginApp("XYZ@GMAIL.COM","TEST");
		
		
		
	}

}
