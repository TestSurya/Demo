package Seleniumfolder;

import org.testng.annotations.*;

public class TestNG_Example_program2 {

@BeforeSuite
public void ChromeSetup() {
	System.out.println("Chrome Setup.....");
//	System.setProperty(null, null);
}
@BeforeTest
public void WebDriverSetup() {
	System.out.println("Webdriver and open url");
}
@BeforeClass
public void OpenURL() {
	System.out.println("Launch URL");
}
@BeforeMethod
public void Login() {
	System.out.println("Login to Application");
}
@Test
public void AddtoCart() {
	System.out.println("Add to Cart");
}
@Test
public void Cancel_order() {
	System.out.println("cancel order");
}
@Test
public void MakePayment() {
	System.out.println("Makepayment");
}
@AfterMethod
public void Logout() {
	System.out.println("Logout Successfully");
}
@AfterClass
public void CloseBrowswer() {
	System.out.println("Close Browser");
}
@AfterTest
public void GenerateReport() {
	System.out.println("Generate report");
}







}
