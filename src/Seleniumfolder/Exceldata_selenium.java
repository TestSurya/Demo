package Seleniumfolder;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exceldata_selenium {

	public static void main(String[] args) throws IOException {
File fpath = new File("C:\\Users\\Surya Chowdary\\Desktop\\Surya.xlsx");
		
		FileInputStream input = new FileInputStream(fpath);
		
		XSSFWorkbook wb= new XSSFWorkbook(input);
		
		XSSFSheet sheet = wb.getSheet("Testing");
		
		
		String URL = sheet.getRow(1).getCell(0).getStringCellValue();
		String email = sheet.getRow(1).getCell(1).getStringCellValue();
		String pwd = sheet.getRow(1).getCell(2).getStringCellValue();
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Surya Chowdary\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get(URL);
		
		driver.manage().window().maximize();
		
		WebElement signInLink = driver.findElement(By.linkText("Sign in"));
		
		signInLink.click();
		
		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.id("passwd")).sendKeys(pwd);
		driver.findElement(By.id("SubmitLogin")).click();
		driver.findElement(By.linkText("Sign out")).click();
		driver.close();
		

	}

}
