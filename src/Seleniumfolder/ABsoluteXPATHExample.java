package Seleniumfolder;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ABsoluteXPATHExample {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Surya Chowdary\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://automationpractice.com/index.php");
		  
		WebElement SignIn_Link = driver.findElement(By.xpath("/html/body/div/div[1]/header/div[2]/div/div/nav/div[1]"));
		SignIn_Link.click();
		if(driver.getTitle().equals("Login - My Store"))
		{
			//Thread.sleep(5000);
			WebElement EmailID_crt = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div[1]/form/div/div[2]/input"));
			EmailID_crt.sendKeys("surya@gmail.com");
			//Thread.sleep(5000);
			WebElement Create_btn =driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div[1]/form/div/div[3]/button"));
			Create_btn.click();
			
			Thread.sleep(5000);//wait stmt since we need to navigate to other page also known as wait technique 
			// 5000=5 milliseconds, 1 sec =1000ms
			
			WebElement Gender_sel = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/form/div[1]/div[1]/div[1]/label/div/span/input"));
			Gender_sel.click();	
			
			WebElement Customer_Fname = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/form/div[1]/div[2]/input"));
			Customer_Fname.sendKeys("Surya");
			
			WebElement Customer_Lname = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/form/div[1]/div[3]/input"));
			Customer_Lname.sendKeys("Test");
			
			WebElement Password = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/form/div[1]/div[5]/input"));
			Password.sendKeys("Test@1234");
			
			
			/*WebElement NewsLetter_Check1 = driver.findElement(By.id("newsletter"));
			NewsLetter_Check1.click();	
			
			WebElement ReceiverOffers_Checkbox= driver.findElement(By.id("optin"));
			ReceiverOffers_Checkbox.click();
			
			Select Day_ListBox= new Select(driver.findElement(By.id("days")));
			Day_ListBox.selectByIndex(5);
			
			Select Month_ListBox= new Select(driver.findElement(By.id("months")));
			Month_ListBox.selectByVisibleText("May ");
			
			Select Year_ListBox= new Select(driver.findElement(By.id("years")));
			Year_ListBox.selectByValue("1990");
			
			//driver.close();*/
			
			
			
			
		}
		
		else {
			System.out.println("Page opend but there is some error");
		driver.quit();
		}	
	
	
	
	
	
	}
}

