package Seleniumfolder;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTablesExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Surya Chowdary\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.w3schools.com/sql/sql_select.asp");
		
		driver.manage().window().maximize();
		
		/*WebElement firstRow_firstcolumn=driver.findElement(By.xpath("//table[@class='ws-table-all notranslate']//tbody//tr[1]//th[1]"));
		System.out.println(firstRow_firstcolumn.getText());
		
		WebElement firstRow_Secondcolumn=driver.findElement(By.xpath("//table[@class='ws-table-all notranslate']//tbody//tr[1]//th[2]"));
		System.out.println(firstRow_Secondcolumn.getText());
		
		//WebElement firstRow_thirdcolumn=driver.findElement(By.xpath("//table[@class='ws-table-all notranslate']//tbody//tr[1]//th[3]"));
		//System.out.println(firstRow_Secondcolumn.getText());*/
		
		/*for(int i=1;i<=7;i++)
		{
			List<WebElement> firstRow_thirdcolumn=driver.findElements(By.xpath("//table[@class='ws-table-all notranslate']//tbody//tr[1]//th['"+i+"']"));
			System.out.println(firstRow_thirdcolumn.getText());
			
		}*/
	
		List<WebElement> rows=driver.findElements(By.xpath("//table[@class='ws-table-all notranslate']//tbody//tr"));
		System.out.println(rows.size());
	
		List<WebElement> cloumn =driver.findElements(By.xpath("//table[@class='ws-table-all notranslate']//tbody//tr[1]//th"));
		System.out.println(cloumn.size());
	
		
		
//			for(int i=1;i<=cloumn.size();i++)
//			{			
//				String Coldata=driver.findElement(By.xpath("//table[@class='ws-table-all notranslate']//tbody//tr//th"+"["+i+"]")).getText();
//				System.out.println(Coldata);
//				}
			for (int j=1 ;j<=rows.size();j++) {
			String Rowdata=driver.findElement(By.xpath("//table[@class='ws-table-all notranslate']//tbody//tr"+"["+j+"]")).getText();
			System.out.println(Rowdata);
			}
	
			
	
	}

}
