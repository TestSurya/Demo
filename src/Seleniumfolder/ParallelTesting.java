package Seleniumfolder;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class ParallelTesting {


	WebDriver  driver;
	WebDriver  driver1;

@Test
@Parameters({"URL","un","pwd"})
public void ChromeLogin(String URL, String un, String pwd) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Surya Chowdary\\Downloads\\chromedriver\\chromedriver.exe");

	driver = new ChromeDriver();
	
	driver.get(URL);
	
	driver.findElement(By.linkText("Sign in")).click();
	System.out.println("Chrome Signin page");
	
	driver.findElement(By.id("email")).sendKeys(un);
	System.out.println("Chrome email given");
	
	driver.findElement(By.id("passwd")).sendKeys(pwd);
	System.out.println("Chrome password given");
	
	driver.findElement(By.id("SubmitLogin")).click();
	System.out.println("Chrome Submit button clicked");
	
	driver.findElement(By.linkText("Sign out")).click();
	System.out.println("Chrome Signout");
	
}

@Test
@Parameters({"URL","un","pwd"})
public void MozillaLogin(String URL, String un, String pwd) {
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\Surya Chowdary\\Downloads\\geckodriver-v0.29.1-win64\\geckodriver.exe");

	driver1 = new FirefoxDriver();
	
	driver1.get(URL);
	
	driver1.findElement(By.linkText("Sign in")).click();
	System.out.println("Mozilla Signin page");
	
	driver1.findElement(By.id("email")).sendKeys(un);
	System.out.println("Mozilla Email given");
	
	driver1.findElement(By.id("passwd")).sendKeys(pwd);
	System.out.println("Mozilla pass given");
	
	driver1.findElement(By.id("SubmitLogin")).click();
	System.out.println("Mozilla submit");
	
	driver1.findElement(By.linkText("Sign out")).click();
	System.out.println("Mozilla Signout");
}


}
