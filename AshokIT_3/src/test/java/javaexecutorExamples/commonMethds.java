package javaexecutorExamples;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class commonMethds {

	static WebDriver d;

	public void getUrl(String url) {
		d = new ChromeDriver();
		// Dimension dim = new Dimension(500, 500);
		// d.manage().window().setSize(dim);
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		d.get(url);
	}

	public WebElement findElementXpath(String identifier) {
		return findElement(By.xpath(identifier));
	}

	public WebElement findElementCssSelector(String identifier) {
		return findElement(By.cssSelector(identifier));
	}

	public WebElement findElement(By by) {
		return d.findElement(by);
	}

	public void click(WebElement ele) {
		ele.click();
	}

	public List<WebElement> findElements(By by) {
		return d.findElements(by);
	}

	public JavascriptExecutor JsObject() {
		return ((JavascriptExecutor) d);
	}

	public WebElement findElementByJSXpath(String xpath) {
		JavascriptExecutor js = ((JavascriptExecutor) d);
		return (WebElement) js.executeScript("return document.evaluate(\"" + xpath
				+ "\",document.body,null,XPathResult.FIRST_ORDERED_NODE_TYPE,null).singleNodeValue");
	}

	public WebElement findElementByJSCss(String cssPath) {
		JavascriptExecutor js = ((JavascriptExecutor) d);
		return (WebElement) js.executeScript("return document.querySelector(\"" + cssPath + "\")");
	}

	public void scrollTop(int yvalue) {
		JsObject().executeScript("window.scrollTo(0," + (-yvalue) + ")");

	}

	public void scrollDown(int yvalue) {
		JsObject().executeScript("window.scrollTo(0," + (yvalue) + ")");

	}

	public void scrollToLeft(int xvalue) {
		JsObject().executeScript("window.scrollTo(" + (-xvalue) + ",0)");

	}

	public void scrollToRight(int xvalue) {
		JsObject().executeScript("window.scrollTo(" + (xvalue) + ",0)");

	}

	public void scrollByTop(int yvalue) {
		JsObject().executeScript("window.scrollBy(0," + (-yvalue) + ")");

	}

	public void scrollByDown(int yvalue) {
		JsObject().executeScript("window.scrollBy(0," + (yvalue) + ")");

	}

	public void scrollByLeft(int xvalue) {
		JsObject().executeScript("window.scrollBy(" + (-xvalue) + ",0)");

	}

	public void scrollByRight(int xvalue) {
		JsObject().executeScript("window.scrollBy(" + (xvalue) + ",0)");

	}

	public void scrollIntoView(By by) {
		JsObject().executeScript("arguments[0].scrollIntoView(true)", findElement(by));

	}

	public void scrollIntoView(WebElement ele) {
		JsObject().executeScript("arguments[0].scrollIntoView(true)", ele);

	}

	public void scrollIntoViewAndClick(By by) throws InterruptedException {
		JsObject().executeScript("arguments[0].scrollIntoView(true)", findElement(by));
		Thread.sleep(1000);
		JsObject().executeScript("arguments[0].click();", findElement(by));
	}

	public void scrollIntoViewAndClick(WebElement ele) throws InterruptedException {
		JsObject().executeScript("arguments[0].scrollIntoView(true)", ele);
		Thread.sleep(1000);
		JsObject().executeScript("arguments[0].click();", ele);
	}

	public void jsClick(WebElement ele) {
		JsObject().executeScript("arguments[0].click();", ele);
	}

	public void scrollIntoViewAndClickAndEnterText(WebElement ele, String value) throws InterruptedException {
		JsObject().executeScript("arguments[0].scrollIntoView(true)", ele);
		Thread.sleep(1000);
		JsObject().executeScript("arguments[0].click();", ele);
		Thread.sleep(3000);
		JsObject().executeScript("arguments[0].value='" + value + "';", ele);
	}

	public WebElement findElementWithJsId(String id) {
		return (WebElement) JsObject().executeScript("return document.getElementById('" + id + "')");
	}

	public List<WebElement> findElementWithJsClass(String classname) {
		return (List<WebElement>) JsObject()
				.executeScript("return document.getElementsByClassName('" + classname + "')");
	}

	public void highlightElement(WebElement ele) {
		JsObject().executeScript("arguments[0].setAttribute('style', 'background : yellow; border : 4px solid red;')",
				ele);
	}

}
