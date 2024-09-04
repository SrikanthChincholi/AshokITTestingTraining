package testngparallelruns;

import java.time.Duration;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class BaseClass {

	static ThreadLocal<WebDriver> d = new ThreadLocal<>();

	@Parameters({ "browser", "Url" })
	@BeforeMethod(alwaysRun = true)
	public void bmeth(@Optional("Chrome") String browser, String url) {
		if (browser.equalsIgnoreCase("Chrome")) {
			d.set(new ChromeDriver());
			d.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			Dimension dim = new Dimension(300, 500);
			d.get().manage().window().setSize(dim);
			getUrl(url);
		} else if (browser.equalsIgnoreCase("FireFox")) {
			d.set(new FirefoxDriver());
			d.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			Dimension dim = new Dimension(300, 500);
			d.get().manage().window().setSize(dim);
			getUrl(url);
		} else if (browser.equalsIgnoreCase("Edge")) {
			d.set(new EdgeDriver());
			d.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			Dimension dim = new Dimension(300, 500);
			d.get().manage().window().setSize(dim);
			getUrl(url);

		}
	}

	public void getUrl(String url) {
		d.get().get(url);
	}

	@AfterMethod(alwaysRun = true)
	public void tearDown() {
		d.get().quit();
	}

}
