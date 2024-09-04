package testngFramework;

import java.lang.reflect.Method;

import org.openqa.selenium.By;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class Selenium_TestNG_Priorty {

	@Test(groups = { "test2" })
	public void test_1(Method meth) throws Exception {
		System.out.println(meth.getName());
		Thread.sleep(500);
		//throw new SkipException("This test is skipped !!");
	}

	@Test(groups = { "test2" })
	public void test_4(Method meth) throws Exception {
		System.out.println(meth.getName());
		
	}

	@Test(groups = { "test1" })
	public void test_3(Method meth) throws Exception {
		System.out.println(meth.getName());
		throw new SkipException("Skipped!!");
	}

	@Test(groups = { "test1" })
	public void test_2(Method meth) throws Exception {
		System.out.println(meth.getName());
	}

}
