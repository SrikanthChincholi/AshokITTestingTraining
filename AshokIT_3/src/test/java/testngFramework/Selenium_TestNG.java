package testngFramework;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Selenium_TestNG extends BaseClass {
	
	@Test(groups = { "Smoke" })
	public void test1() throws Exception {
		d.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Srikanth");
		d.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Chincholi");
		Thread.sleep(3000);
	}

	@Test(groups = { "Regression" })
	public void test2() throws Exception {
		d.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Srikanth");
		d.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Chincholi");
		Thread.sleep(3000);
	}

	@Test(groups = { "Sanity" })
	public void test3() throws Exception {
		d.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Srikanth");
		d.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Chincholi");
		Thread.sleep(3000);
	}

}
