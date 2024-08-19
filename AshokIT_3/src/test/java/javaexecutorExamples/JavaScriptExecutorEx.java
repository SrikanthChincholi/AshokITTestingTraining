package javaexecutorExamples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class JavaScriptExecutorEx {

	static WebDriver d;

	@Test
	public void test() throws Exception {
		d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.amazon.in");
		JavascriptExecutor js = ((JavascriptExecutor)d);
		//WebElement ele = (WebElement) js.executeScript("return document.getElementById('twotabsearchtextbox')");
		//ele.sendKeys("Air Fryer");
		WebElement txtbox = d.findElement(By.id("twotabsearchtextbox"));
		js.executeScript("arguments[0].setAttribute('style','border : 2px solid red; background : yellow;');", txtbox);
		js.executeScript("arguments[0].scrollIntoView(true)", txtbox);
		js.executeScript("arguments[0].value='Air Fryer'", txtbox);
		//js.executeScript("document.getElementById('twotabsearchtextbox').value='Air Fryer'");
		String txtvalue = (String) js.executeScript("return document.getElementById('twotabsearchtextbox').value");
		System.out.println(txtvalue);
		//WebElement submit = d.findElement(By.xpath("//input[@type='submit']"));
		js.executeScript("document.getElementById('nav-search-submit-button').click()");
		
		//List<WebElement> submit = (List<WebElement>) js.executeScript("return document.getElementsByClassName('nav-input nav-progressive-attribute')");
		//submit.get(1).click();
		Thread.sleep(5000);
		WebElement ele =  (WebElement) js.executeScript("return document.querySelector('#deliveryRefinements')");
				//(WebElement) js.executeScript("return document.evaluate(\"//div[@id='deliveryRefinements']\",document.body,null,XPathResult.FIRST_ORDERED_NODE_TYPE).singleNodeValue");
		System.out.println(ele.getText());
		js.executeScript("window.scrollTo(0,1000)");
		int i=10;
		while(i <= 500)
		{
			js.executeScript("window.scrollBy(0,1000)");
			Thread.sleep(2000);
			i = i + 10;
		}
		
		
	
		
	}
}
