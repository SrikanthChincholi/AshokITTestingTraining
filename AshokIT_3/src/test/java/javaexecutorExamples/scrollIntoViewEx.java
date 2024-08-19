package javaexecutorExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class scrollIntoViewEx {

	static WebDriver d;

	@Test
	public void test() {
		d = new ChromeDriver();
		d.get("https://demo.automationtesting.in/Register.html");
		d.manage().window().maximize();
		WebElement ele = d.findElement(By.xpath("//div[@id='msdd']"));
		ele.click();
		JavascriptExecutor js = ((JavascriptExecutor) d);
		js.executeScript("arguments[0].scrollIntoView(true)",d.findElement(By.xpath("//div//li//a[text()='Filipino']")));
				//d.findElement(By.xpath("//ul[contains(@class,'ui-autocomplete')]")));
		d.findElement(By.xpath("//div//li//a[text()='Filipino']")).click();

	}

}
