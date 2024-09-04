package dprovidertestng;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.SkipException;
import org.testng.annotations.*;

public class TestLogin {

	static WebDriver d;

	@BeforeMethod(alwaysRun = true)
	public void bmeth() {

		d = new ChromeDriver();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.manage().window().maximize();
		d.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@Test(dataProvider = "DP1", dataProviderClass = DataProviderTestClass.class)
	public void testLogin(String run, String username, String password) throws Exception {
		if (run.equalsIgnoreCase("Yes")) {
			d.findElement(By.name("username")).sendKeys(username);
			Thread.sleep(2000);
			d.findElement(By.name("password")).sendKeys(password);
			Thread.sleep(2000);
			d.findElement(By.xpath("//button[@type='submit']")).click();
			assertEquals("Dashboard", d.findElement(By.xpath("//h6[contains(string(),'Dashboard')]")).getText());
			System.out.println("Login Success !!");
		} else {
			throw new SkipException("Run skipped !!");
		}
	}

	@AfterMethod(alwaysRun = true)
	public void tearDown() {
		d.quit();
	}
}
