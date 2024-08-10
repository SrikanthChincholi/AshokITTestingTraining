package timeouts;

import java.time.Duration;
import java.time.Instant;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class SyncClass {

	static WebDriver d;

	// @Test
	public void timeout1() {
		d = new ChromeDriver();
		Instant stime = Instant.now();
		d.get("https://tourism.telangana.gov.in/blog/touristplacestovisitinhyderabad");
		Instant etime = Instant.now();
		Duration timediff = Duration.between(stime, etime);
		System.out.println(timediff.getSeconds());
		d.quit();
	}

	// @Test
	public void timeout2() {
		d = new ChromeDriver();
		d.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		d.get("https://opensource-demo.orangehrmlive.com/");
		d.quit();
	}

	// @Test
	public void implicitwaits() throws Exception {
		d = new ChromeDriver();
		d.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		Thread.sleep(1000);
		d.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		d.findElement(By.name("username")).sendKeys("admin");
		d.findElement(By.name("password")).sendKeys("admin123");
		d.findElement(By.xpath("//button[text()=' Login ']")).submit();
		Thread.sleep(3000);
		d.quit();
	}

	// @Test
	public void explicitWaitEx() {
		d = new ChromeDriver();
		d.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		// d.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		d.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		WebElement username = waituntilEleVisibility(By.name("username"), 5);
		username.sendKeys("admin");
		WebElement password = waituntilEleVisibility(By.name("password"), 10);
		password.sendKeys("admin123");
		d.findElement(By.xpath("//button[text()=' Login ']")).submit();
		d.quit();
	}

	public static WebElement waituntilEleVisibility(By by, int duration) {
		Wait<WebDriver> wait = new WebDriverWait(d, Duration.ofSeconds(duration));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(by));
	}

	public static WebElement waituntilPresenceofElement(By by, int duration) {
		Wait<WebDriver> wait = new WebDriverWait(d, Duration.ofSeconds(duration));
		return wait.until(ExpectedConditions.presenceOfElementLocated(by));
	}

	// @Test
	public void explicitWaitEx1() {
		d = new ChromeDriver();
		d.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		// d.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		d.get("https://www.letskodeit.com/practice");
		d.findElement(By.xpath("//input[@value='Hide']")).click();
		WebElement txtboxpresence = waituntilPresenceofElement(By.xpath("//input[@placeholder='Hide/Show Example']"),
				10);
		System.out.println("Element present in the DOM ");
		try {
			WebElement txtbox = waituntilEleVisibility(By.xpath("//input[@placeholder='Hide/Show Example']"), 4);
			txtbox.sendKeys("SampleText");
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

		// d.quit();
	}

	@Test
	public void fluentWaitEx1() {
		d = new ChromeDriver();
		d.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		// d.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		d.get("https://www.letskodeit.com/practice");
		d.findElement(By.xpath("//input[@value='Hide']")).click();
		WebElement txtboxpresence = fluentwait(By.xpath("//input[@placeholder='Hide/Show Example']"), 10, 2);
		txtboxpresence.sendKeys("TestSample");
		// d.quit();
	}

	public WebElement fluentwait(By by, int waitforSec, int polltime) {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(d).withTimeout(Duration.ofSeconds(waitforSec))
				.pollingEvery(Duration.ofSeconds(polltime)).ignoring(ElementNotInteractableException.class)
				.withMessage("Failed to find the element");
		return wait.until(ExpectedConditions.visibilityOfElementLocated(by));
	}

}
