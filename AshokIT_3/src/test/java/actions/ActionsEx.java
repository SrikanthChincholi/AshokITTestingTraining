package actions;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ActionsEx {

	static WebDriver d;

	// @Test
	public void actions() throws Exception {
		d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		d.get("https://www.letskodeit.com/practice");
		WebElement ele = d.findElement(By.xpath("//input[@placeholder='Start Typing...']"));
		Actions act = new Actions(d);
		act.moveToElement(ele).click().sendKeys("Test Data").perform();
		Thread.sleep(3000);
		act.scrollByAmount(0, 700).perform();
		Thread.sleep(3000);
		act.moveToElement(d.findElement(By.xpath("//button[text()='Mouse Hover']")))
				.moveToElement(d.findElement(By.xpath("//a[text()='Top']"))).pause(Duration.ofSeconds(2)).click()
				.build().perform();

	}

	// @Test
	public void actionsEx2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your option :");
		String option = sc.next();
		d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		d.get("https://swisnl.github.io/jQuery-contextMenu/3.x/demo.html");
		Actions act = new Actions(d);
		act.contextClick(d.findElement(By.xpath("//span[text()='right click me']"))).perform();
		List<WebElement> alloptions = d.findElements(By.xpath("//ul[contains(@class,'context-menu-list')]/li"));
		Iterator<WebElement> ele = alloptions.iterator();
		while (ele.hasNext()) {
			WebElement wele = ele.next();
			String optiontxt = wele.getText();
			System.out.println(optiontxt);
			if (optiontxt.equalsIgnoreCase(option)) {
				act.moveToElement(wele).pause(Duration.ofSeconds(2)).click().build().perform();
				System.out.println("Clicked on : " + optiontxt);
				System.out.print(d.switchTo().alert().getText());
				d.switchTo().alert().accept();
				break;
			}

		}

	}

	// @Test
	public void actionsEx3() {

		d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		d.get("https://demo.automationtesting.in/Slider.html");
		Actions act = new Actions(d);
		act.clickAndHold(d.findElement(By.xpath("//a[contains(@class,'ui-slider-handle')]"))).moveByOffset(200, 0)
				.pause(Duration.ofSeconds(3)).moveToLocation(0, 0).release().build().perform();

	}

	private void getUrl(String url) {
		d = new ChromeDriver();
		//d.manage().window().maximize();
		Dimension dim = new Dimension(800, 800);
		d.manage().window().setSize(dim);
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		/*
		 * Wait<WebDriver> wait = new WebDriverWait(d, Duration.ofSeconds(30));
		 * wait.until(ExpectedConditions.urlMatches("https:"));
		 */
		d.get(url);
	}

	public void dblClck(WebElement ele) {
		Actions act = new Actions(d);
		act.moveToElement(ele).doubleClick().pause(Duration.ofSeconds(2)).build().perform();
	}

	public String getTextfromAlert() {
		String txt = d.switchTo().alert().getText();
		d.switchTo().alert().accept();
		return txt;
	}

	public void switchToFrame(String str) {
		d.switchTo().frame(d.findElement(By.xpath(str)));
	}

	public void switchToFrame(int frameid) {
		d.switchTo().frame(frameid);
	}

	public void switchToFrame(WebElement ele) {
		d.switchTo().frame(ele);
	}

	// @Test
	public void actionEx4() throws InterruptedException {
		getUrl("https://www.w3schools.com/jquery/tryit.asp?filename=tryjquery_event_dblclick");
		switchToFrame("//iframe[@id='iframeResult']");
		dblClck(d.findElement(By.xpath("//p[contains(string(),'Double-click on this paragraph.')]")));
		Thread.sleep(3000);
		System.out.println(getTextfromAlert());
	}

	public WebElement findElement(By by) {
		return d.findElement(by);
	}

	public Actions act() {
		return new Actions(d);
	}

	public void waitforSeconds(int seconds) {
		try {
			Thread.sleep(seconds * 1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// @Test
	public void draggableElement() {
		getUrl("https://jqueryui.com/draggable/");
		switchToFrame(0);
		WebElement ele = findElement(By.xpath("//div[@id='draggable']"));
		Actions actions = act();
		waitforSeconds(2);
		actions.dragAndDropBy(ele, 50, 100).build().perform();

	}

	@Test
	public void dragAndDropElement() {
		getUrl("https://jqueryui.com/droppable/");
		switchToFrame(0);
		//WebElement drag = findElement(By.xpath("//div[@id='draggable']"));
		JavascriptExecutor js = (JavascriptExecutor)d;
		WebElement drag = (WebElement) js.executeScript("return document.getElementById('draggable')");
		WebElement drop = findElement(By.xpath("//div[@id='droppable']"));
		Actions actions = act();
		waitforSeconds(2);
		actions.dragAndDrop(drag, drop).build().perform();
		waitforSeconds(3);
		WebElement txt = drop.findElement(By.tagName("p"));
		System.out.println(txt.getText());
	}
	
	//@Test
	public void scroll()
	{
		getUrl("https://www.amazon.in/");
		Actions act = act();
		waitforSeconds(3);
		act.scrollByAmount(500, 0).build().perform();
		waitforSeconds(3);
		act.scrollByAmount(0, 500).build().perform();
		waitforSeconds(3);
		
		
	}
}
