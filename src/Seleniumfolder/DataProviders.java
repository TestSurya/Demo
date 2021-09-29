package Seleniumfolder;

import org.openqa.selenium.*;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
//import org.testng.annotations.DataProvider;
import org.testng.annotations.*;


public class DataProviders {

@DataProvider(name = "data Provider")
public Object[][] dpmethod(){
	return new Object[][] {{"suryatest123@gmail.com","asdfg@1234"},{"abchd@gmail.com","123345jasdf"}};
	
}
//@Test(dataProvider="data Provider")
//public void Sample(String values) {
//	System.out.println(values);
//}
	
	
WebDriver  driver;
@BeforeMethod

public void Login() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Surya Chowdary\\Downloads\\chromedriver\\chromedriver.exe");

	driver = new ChromeDriver();
	
	driver.get("http://automationpractice.com/index.php");
	
	driver.findElement(By.linkText("Sign in")).click();
}
@Test(dataProvider="data Provider")
public void Details(String un,String pwd) {
	
	driver.findElement(By.id("email")).sendKeys(un);
	
	driver.findElement(By.id("passwd")).sendKeys(pwd);
	
	driver.findElement(By.id("SubmitLogin")).click();
	
	WebElement Text = driver.findElement(By.xpath("//a[@title='View my customer account']//span"));
	System.out.println(Text.getText());
	Assert.assertEquals(Text.getText(), "Surya Test");
	driver.findElement(By.linkText("Sign out")).click();

	driver.manage().deleteAllCookies();
	
	driver.close();
}
	
	
	
	
	
}
