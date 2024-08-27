package exceldatareading;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestLoginClass {
	static WebDriver d;

	@Test
	public void login() throws Exception {
		List<Map<String, String>> data = ReadExcelData.readData();
		for (int i = 0; i < data.size(); i++) {
			String Uname = data.get(i).get("Uname");
			String Pswd = data.get(i).get("Password");
			String Run = data.get(i).get("Run");
			if (Run.equalsIgnoreCase("Yes")) {
				try {
					d = new ChromeDriver();
					d.manage().window().maximize();
					//d.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(2));
					d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
					d.get("https://demo.automationtesting.in/Register.html");
					WebElement uname = d.findElement(By.xpath("//input[@placeholder='First Name']"));
					uname.sendKeys(Uname);
					WebElement pswd = d.findElement(By.xpath("//input[@placeholder='Last Name']"));
					pswd.sendKeys(Pswd);
					Thread.sleep(3000);
					d.findElement(By.xpath("//div[@id='msdd']")).click();
					WebElement lang = d.findElement(By.xpath("//a[text()='Thai']"));
					((JavascriptExecutor) d).executeScript("arguments[0].scrollIntoView(true)", lang); // ((JavascriptExecutor)d).executeScript("window.scrollTo(0,400)");
					lang.click();
					Thread.sleep(3000);
				} catch (Exception e) {
					e.printStackTrace();
				} finally {
					d.quit();
				}
			}

		}

	}

}
