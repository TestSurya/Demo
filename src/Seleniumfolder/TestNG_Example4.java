package Seleniumfolder;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class TestNG_Example4 {

	WebDriver  driver;
@BeforeMethod

public void Login() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Surya Chowdary\\Downloads\\chromedriver\\chromedriver.exe");

	driver = new ChromeDriver();
	
	driver.get("http://automationpractice.com/index.php");
	
	driver.findElement(By.linkText("Sign in")).click();
	
	driver.findElement(By.id("email")).sendKeys("suryatest123@gmail.com");
	
	driver.findElement(By.id("passwd")).sendKeys("asdfg@1234");
	
	driver.findElement(By.id("SubmitLogin")).click();
	
}

@Test(priority=1)
public void verifyProfile() {
	WebElement ProfileText = driver.findElement(By.xpath("//a[@title='View my customer account']//span"));
	
	String Name = ProfileText.getText();
	
	Assert.assertEquals(Name, "Surya Test");
	
	System.out.println("Valid name");
	
}

@Test(priority=2)
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
}
	
}
