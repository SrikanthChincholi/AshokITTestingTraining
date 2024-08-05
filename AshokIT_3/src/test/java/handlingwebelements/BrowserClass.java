package handlingwebelements;

import java.time.Duration;
import java.util.List;

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
		d.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		d.get("https://opensource-demo.orangehrmlive.com/");
		d.findElement(By.name("username")).sendKeys("admin");
		d.findElement(By.name("password")).sendKeys("admin123");
		d.findElement(By.xpath("//button[@type='submit']")).click();
		d.findElement(By.xpath("//a/span[text()='Admin']")).click();
		Thread.sleep(5000);
		// d.quit();
		System.out.println("Columns : ");
		List<WebElement> allcolumns = d.findElements(By.xpath("//div[@class='oxd-table-header']/div"));
		for (WebElement ele : allcolumns) {
			System.out.print(ele.getText());
		}
		System.out.println(" ");
		System.out.println("Values :");
		List<WebElement> allrecords = d.findElements(By.xpath("//div[@class='oxd-table-body']/div"));
		for (WebElement ele : allrecords) {
			System.out.print(ele.getText());
		}

	}

}
