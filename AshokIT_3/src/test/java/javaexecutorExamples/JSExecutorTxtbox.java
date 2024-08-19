package javaexecutorExamples;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JSExecutorTxtbox {

	static WebDriver d;

	private void getUrl(String url) {
		d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		d.get(url);
	}

	@Test
	public void jsExecutor() {
		getUrl("https://www.amazon.in/");
		((JavascriptExecutor) d).executeScript("document.getElementById('twotabsearchtextbox').value='Air Fryer'");
		WebElement search = (WebElement) ((JavascriptExecutor) d).executeScript("return document.getElementById('twotabsearchtextbox')");
		((JavascriptExecutor) d).executeScript("arguments[0].value='Air Fryer'",search);
		String value = (String) ((JavascriptExecutor) d).executeScript("return document.getElementById('twotabsearchtextbox').value");
		System.out.println(value);
		((JavascriptExecutor) d).executeScript("document.getElementById('nav-search-submit-button').click()");
		
	}

}
