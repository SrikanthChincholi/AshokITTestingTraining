package handlingwebelements;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BrowserClass {

	static WebDriver d;

	@Test
	public void getTableData() throws Exception {
		d = new ChromeDriver();
		d.manage().window().maximize();
		// d.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		d.get("https://opensource-demo.orangehrmlive.com/");
		d.findElement(By.name("username")).sendKeys("admin");
		d.findElement(By.name("password")).sendKeys("admin123");
		d.findElement(By.xpath("//button[@type='submit']")).click();
		d.findElement(By.xpath("//a/span[text()='Admin']")).click();
		Thread.sleep(5000);
		// d.quit();
		List<Map<String, String>> lmap = new ArrayList<>();
		ArrayList<String> columns = new ArrayList<>();
		List<WebElement> allcolumns = d
				.findElements(By.xpath("//div[@class='oxd-table-header']//div[@role='columnheader']"));
		for (WebElement ele : allcolumns) {
			columns.add(ele.getText());
		}
		for (int i = 0; i < columns.size(); i++) {
			List<WebElement> allvalues = d.findElements(
					By.xpath("//div[@class='oxd-table-card'][" + i + "]//div[contains(@class,'oxd-table-cell ')]"));
			
			ArrayList<String> values = new ArrayList<>();
			for (WebElement ele : allvalues) {
				values.add(ele.getText());
			}
			Map<String, String> map = new LinkedHashMap<>();
			for (int j = 0; j < values.size(); j++) {
				map.put(columns.get(j), values.get(j));
			}
			lmap.add(map);
		}
		System.out.println(lmap);
		for (int i = 0; i < lmap.size(); i++) {
			if (!lmap.get(i).containsValue(" ") && !lmap.get(i).containsKey(" ")) {
				System.out.print("Username");
				System.out.print(lmap.get(i).get("Username") + " ");
				System.out.print("User Role");
				System.out.print(lmap.get(i).get("User Role") + " ");
				System.out.print("Employee Name");
				System.out.print(lmap.get(i).get("Employee Name") + " ");
				System.out.print("Status");
				System.out.print(lmap.get(i).get("Status") + " ");
				System.out.println(" ");
			}
		}
		d.quit();
	}

}
