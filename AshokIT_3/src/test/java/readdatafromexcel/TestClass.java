package readdatafromexcel;

import java.time.Duration;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestClass {

	static WebDriver d;

	@Test(dataProvider = "DP", dataProviderClass = ReadDataFromExcel.class)
	public void getData(Map<String, String> m) throws Exception {
		d= new ChromeDriver();
		d.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		d.findElement(By.name("username")).sendKeys(m.get("Uname"));
		d.findElement(By.name("password")).sendKeys(m.get("Password"));
		d.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(5000);
		d.quit();
		/*
		 * System.out.println(m.get("Uname")); System.out.println(m.get("Password"));
		 */
	}

}
