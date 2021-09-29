package Seleniumfolder;

import org.testng.annotations.*;

public class TestNG_Groups_example {

@BeforeMethod
public void login() {
	System.out.println("Login Successful");
}
@Test(groups= {"Module1"},priority=1)
public void TestCase1() {
	System.out.println("TestCase1 ");
}
@Test(groups= {"Module1"},priority=2)
public void TestCase2() {
	System.out.println("TestCase2");
}
@Test(groups= {"Module2"},priority=3)
public void TestCase3() {
	System.out.println("TestCase3");	
}
@Test(groups= {"Module2"},priority=4)
public void TestCase4() {
	System.out.println("TestCase4");	
}
@Test(groups= {"Module3"},enabled = false,priority=5)
public void TestCase5() {
	System.out.println("TestCase5");	
}
@Test(groups= {"Module3"},priority=6)
public void TestCase6() {

	System.out.println("TestCase6");
}

@AfterMethod
public void Logout() {
	System.out.println("Logout");
}
}
