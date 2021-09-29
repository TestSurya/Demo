package Seleniumfolder;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class TestNG_DependsonMethod_Example {

	WebDriver  driver;
@BeforeMethod
public void Setup() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Surya Chowdary\\Downloads\\chromedriver\\chromedriver.exe");

	driver = new ChromeDriver();
	
	driver.get("http://automationpractice.com/index.php");
	
	driver.manage().window().maximize();
}
@Test()
public void Login() {
	
	driver.findElement(By.linkText("Sign in")).click();
	
	driver.findElement(By.id("email")).sendKeys("suryatest123@gmail.com");
	
	driver.findElement(By.id("passwd")).sendKeys("asdfg@1234");
	
	driver.findElement(By.id("SubmitLogin")).click();
	
}

@Test(priority = 2,dependsOnMethods = "Login")
public void verifyProfile() {
	WebElement ProfileText = driver.findElement(By.xpath("//a[@title='View my customer account']//span"));
	
	String Name = ProfileText.getText();
	
	Assert.assertEquals(Name, "Surya Test");
	
	System.out.println("Valid name");
	
}

@Test(priority = 3,dependsOnMethods = "Login")
public void SearchAnyProduct() {
	driver.findElement(By.id("search_query_top")).sendKeys("Shirts");
	driver.findElement(By.name("submit_search")).click();
	
	WebElement ResultsfoundText = driver.findElement(By.xpath("//*[@id='center_column']//span[2]"));
	
	String foundText = ResultsfoundText.getText();
	Assert.assertEquals(foundText, "1 result has been found.");
	
}
@AfterMethod
public void Logout() {
	driver.findElement(By.linkText("Sign out")).click();
	
	driver.close();
	
}
	
}
	


