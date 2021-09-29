package Seleniumfolder;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class TestNG_Example3 {
	WebDriver driver;
	@BeforeSuite
	public void ChromeSetup() {
		System.out.println("Chrome Setup.....");
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Surya Chowdary\\Downloads\\chromedriver\\chromedriver.exe");
	}
	@BeforeTest
	public void WebDriverSetup() {
	driver = new ChromeDriver();
	
		System.out.println("Webdriver and open url");
		
	}
	@BeforeClass
	public void OpenURL() {
		
		driver.get("http://automationpractice.com/index.php");
		
	}
	@BeforeMethod
	public void Login() {
		
		driver.findElement(By.linkText("Sign in")).click();
		
		driver.findElement(By.id("email")).sendKeys("suryatest123@gmail.com");
		
		driver.findElement(By.id("passwd")).sendKeys("asdfg@1234");
		
		driver.findElement(By.id("SubmitLogin")).click();
		
	}
	@Test
	public void Verify_Login() {
		
		WebElement ProfileText = driver.findElement(By.xpath("//a[@title='View my customer account']//span"));
		String Name = ProfileText.getText();
		System.out.println(Name);
		Assert.assertEquals(Name, "Surya Test");
		System.out.println("Valid name");
	}
	
	@AfterMethod
	public void Logout() {
		driver.findElement(By.linkText("Sign out")).click();
	}
	@AfterClass
	public void CloseBrowswer() {
		driver.close();
	}
	
}
