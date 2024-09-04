package testngparallelruns;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Selenium_TestNG extends BaseClass {
	
	@Test
	public void test1() throws Exception {
		d.get().findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Srikanth");
		d.get().findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Chincholi");
		Thread.sleep(3000);
	}

	/*
	 * @Test public void test2() throws Exception {
	 * d.get().findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys(
	 * "Srikanth");
	 * d.get().findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys(
	 * "Chincholi"); Thread.sleep(3000); }
	 * 
	 * @Test public void test3() throws Exception {
	 * d.get().findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys(
	 * "Srikanth");
	 * d.get().findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys(
	 * "Chincholi"); Thread.sleep(3000); }
	 */

}
