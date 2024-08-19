package javaexecutorExamples;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class JSExampleForSelenium extends commonMethds {

	@Test
	public void identifyElewithXpath() throws Exception {
		getUrl("https://demo.automationtesting.in/Register.html");
		WebElement ele = findElementByJSXpath("//div[@id='msdd']");
		ele.click();
		List<WebElement> str = (findElements(By.xpath("//ul[contains(@class,'ui-autocomplete')]/li/a")));
		for (WebElement e : str)
			scrollIntoViewAndClick(
					By.xpath("//ul[contains(@class,'ui-autocomplete')]/li/a[text()='" + e.getText() + "']"));
	}

}
