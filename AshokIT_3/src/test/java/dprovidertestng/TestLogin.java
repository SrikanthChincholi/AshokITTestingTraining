package dprovidertestng;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.Date;
import java.util.Map;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
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

	//@Test(dataProvider = "ExcelDataFromPOI", dataProviderClass = DataProviderTestClass.class)
	public void testLogin(String run, String username, String password, String isactive, String eno, String sal)
			throws Exception {
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

	@Test(dataProvider = "DPFromListOfMap", dataProviderClass = ExcelData.class)
	public void testLogin(Map<String, String> map) throws Exception {
		String run = map.get("Run");
		String username = map.get("Username");
		String password = map.get("Password");
		try {
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
		} catch (Exception e) {
			getScreens();
			e.printStackTrace();
		}
	}

	public static void getScreens() throws Exception {
		File src = ((TakesScreenshot) d).getScreenshotAs(OutputType.FILE);
		Date d = new Date();
		SimpleDateFormat format = new SimpleDateFormat("YYYY-mm-dd-HH-MM-SS");
		String date = format.format(d);
		File dest = new File(".//Screens//failed_" + date + ".png");
		FileUtils.copyFile(src, dest);
	}

	@AfterMethod(alwaysRun = true)
	public void tearDown() {
		d.quit();
	}
}
