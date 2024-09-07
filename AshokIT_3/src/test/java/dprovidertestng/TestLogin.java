package dprovidertestng;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
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

	static ThreadLocal<WebDriver> d = new ThreadLocal<>();

	@BeforeMethod(alwaysRun = true)
	public void bmeth() {

		d.set(new ChromeDriver());
		d.get().manage().window().maximize();
		d.get().get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@Test(dataProvider = "ExcelDataFromPOI", dataProviderClass = ExcelData.class)
	public void testLogin(String run, String username, String password, String isactive, String eno, String sal)
			throws Exception {
		try {
			if (run.equalsIgnoreCase("Yes")) {
				Thread.sleep(3000);
				d.get().findElement(By.name("username")).sendKeys(username);
				Thread.sleep(2000);
				d.get().findElement(By.name("password")).sendKeys(password);
				Thread.sleep(2000);
				d.get().findElement(By.xpath("//button[@type='submit']")).click();
				assertEquals("Dashboard",
						d.get().findElement(By.xpath("//h6[contains(string(),'Dashboard')]")).getText());
				System.out.println("Login Success !!");
			} else {
				throw new SkipException("Run skipped !!");
			}
		} catch (Exception e) {
			getScreens();
			e.printStackTrace();
		}
	}

	@Test(dataProvider = "DPFromListOfMap", dataProviderClass = ExcelData.class)
	public void testLogin(Map<String, String> map) throws Exception {
		String run = map.get("Run");
		String username = map.get("Username");
		String password = map.get("Password");
		try {
			if (run.equalsIgnoreCase("Yes")) {
				Thread.sleep(3000);
				d.get().findElement(By.name("username")).sendKeys(username);
				Thread.sleep(2000);
				d.get().findElement(By.name("password")).sendKeys(password);
				Thread.sleep(2000);
				d.get().findElement(By.xpath("//button[@type='submit']")).click();
				assertEquals("Dashboard",
						d.get().findElement(By.xpath("//h6[contains(string(),'Dashboard')]")).getText());
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
		Thread.sleep(3000);
		File src = ((TakesScreenshot) d.get()).getScreenshotAs(OutputType.FILE);
		LocalDateTime myDateObj = LocalDateTime.now();
	  //  System.out.println("Before formatting: " + myDateObj);
	    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy-HH-mm-ss-ms");
	    String formattedDate = myDateObj.format(myFormatObj);
	 //   System.out.println("After formatting: " + formattedDate);
		File dest = new File(".//Screens//failed_" + formattedDate + ".png");
		FileUtils.copyFile(src, dest);
	}

	@AfterMethod(alwaysRun = true)
	public void tearDown() {
		d.get().quit();
	}
}
