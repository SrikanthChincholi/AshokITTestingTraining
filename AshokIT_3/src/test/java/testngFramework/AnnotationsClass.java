package testngFramework;

import org.testng.annotations.*;

public class AnnotationsClass {

	@BeforeSuite
	public void bsuite() {
		System.out.println("BSuite");
	}

	@AfterSuite
	public void asuite() {
		System.out.println("ASuite");
	}

	@BeforeTest
	public void btest() {
		System.out.println("BTest");
	}

	@AfterTest
	public void atest() {
		System.out.println("ATest");
	}

	@BeforeClass
	public void bclass() {
		System.out.println("BClass");
	}

	@AfterClass
	public void aclass() {
		System.out.println("Aclass");
	}

	@Test
	public void test1() {
		System.out.println("Test1");
	}
	@Test
	public void test2() {
		System.out.println("Test2");
	}

	@BeforeMethod
	public void bmeth() {
		System.out.println("BMeth");
	}

	@AfterMethod
	public void ameth() {
		System.out.println("Ameth");
	}

}
