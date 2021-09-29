package Seleniumfolder;

import org.testng.annotations.*;

public class TestNGAnnotations {

@BeforeSuite
public void BS() {
	System.out.println("this is Before Suite");
}
@BeforeTest
public void BT() {
	System.out.println("This is Before Test");

}
@BeforeClass
public void BC() {
	System.out.println("this is Before Class");
}
@BeforeMethod
public void BM() {
	System.out.println("This is before method");
	
}
@Test
public void Test() {
	System.out.println("This is Test");
}
@AfterMethod
public void AM() {
	System.out.println("This is After method");
	
}
@AfterClass
public void AC() {
	System.out.println("this is After Class");
}
@AfterTest
public void AT() {
	System.out.println("This is After Test");

}	
	
	
	
	
	
	
	
	
}
