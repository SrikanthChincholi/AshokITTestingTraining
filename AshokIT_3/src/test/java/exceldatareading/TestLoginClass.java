package exceldatareading;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
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
				d = new ChromeDriver();
				d.manage().window().maximize();
				d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
				d.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
				WebElement uname = d.findElement(By.name("username"));
				uname.sendKeys(Uname);
				WebElement pswd = d.findElement(By.name("password"));
				pswd.sendKeys(Pswd);
				Thread.sleep(3000);
				d.quit();
			}
		}

	}

}
