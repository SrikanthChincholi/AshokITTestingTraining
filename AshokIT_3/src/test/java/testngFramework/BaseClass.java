package testngFramework;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	
	static WebDriver d;

	@BeforeMethod(alwaysRun = true)
	public void bmeth() {
		d = new ChromeDriver();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.manage().window().maximize();
		d.get("https://demo.automationtesting.in/Register.html");
	}
	
	@AfterMethod(alwaysRun = true)
	public void tearDown() {
		d.quit();
	}

}
