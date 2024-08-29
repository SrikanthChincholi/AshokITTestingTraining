package testngFramework;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class BaseClass {

	static WebDriver d;

	@Parameters({ "browser" })
	@BeforeMethod(alwaysRun = true)
	public void bmeth(@Optional("Chrome") String browser) {
		if (browser.equals("Chrome")) {
			d = new ChromeDriver();
			d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			d.manage().window().maximize();
			d.get("https://demo.automationtesting.in/Register.html");
		}
		else if (browser.equals("FireFox")) {
			d = new FirefoxDriver();
			d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			d.manage().window().maximize();
			d.get("https://demo.automationtesting.in/Register.html");
		}
		else if (browser.equals("Edge")) {
			d = new EdgeDriver();
			d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			d.manage().window().maximize();
			d.get("https://demo.automationtesting.in/Register.html");
		}
	}

	@AfterMethod(alwaysRun = true)
	public void tearDown() {
		d.quit();
	}

}
