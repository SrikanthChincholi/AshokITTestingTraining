package selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Alerts {
	static WebDriver d;

	// @Test
	public void alert1() throws Exception {
		d = new ChromeDriver();
		d.manage().window().maximize();
		// d.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		d.get("https://demo.automationtesting.in/Alerts.html");
		d.findElement(By.xpath("//button[contains(string(),'click the button to display an  alert box:')]")).click();
		Thread.sleep(3000);
		d.switchTo().alert().accept();
		Thread.sleep(3000);
		d.quit();

	}

	//@Test
	public void alert2() throws Exception {
		d = new ChromeDriver();
		d.manage().window().maximize();
		// d.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		d.get("https://demo.automationtesting.in/Alerts.html");
		String str[] = { "Ok", "Cancel" };
		for (String s : str) {
			if (s.equalsIgnoreCase("ok")) {
				d.findElement(By.xpath("//a[contains(text(),'Alert with OK & Cancel')]")).click();
				Thread.sleep(3000);
				d.findElement(By.xpath("//button[contains(text(),'click the button to display a confirm box')]"))
						.click();
				Thread.sleep(3000);
				d.switchTo().alert().accept();
				Thread.sleep(3000);
				List<WebElement> txt = d.findElements(By.xpath("//p[@id='demo']"));
				if (txt.size() > 0) {
					System.out.println(txt.get(0).getText());
				}
			} else if (s.equalsIgnoreCase("cancel")) {
				d.findElement(By.xpath("//a[contains(text(),'Alert with OK & Cancel')]")).click();
				Thread.sleep(3000);
				d.findElement(By.xpath("//button[contains(text(),'click the button to display a confirm box')]"))
						.click();
				Thread.sleep(3000);
				d.switchTo().alert().dismiss();
				Thread.sleep(3000);
				List<WebElement> txt = d.findElements(By.xpath("//p[@id='demo']"));
				if (txt.size() > 0) {
					System.out.println(txt.get(0).getText());
				}
			}
		}

		d.quit();

	}
	@Test
	public void alert3() throws Exception {
		d = new ChromeDriver();
		d.manage().window().maximize();
		// d.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		d.get("https://demo.automationtesting.in/Alerts.html");
		String str[] = { "Ok", "Cancel" };
		for (String s : str) {
			if (s.equalsIgnoreCase("ok")) {
				d.findElement(By.xpath("//a[contains(text(),'Alert with Textbox')]")).click();
				Thread.sleep(3000);
				d.findElement(By.xpath("//button[contains(text(),'click the button to demonstrate the prompt box ')]"))
						.click();
				Thread.sleep(3000);
				System.out.println(d.switchTo().alert().getText());
				Thread.sleep(3000);
				d.switchTo().alert().sendKeys("Srikanth");
				Thread.sleep(3000);
				d.switchTo().alert().accept();
				Thread.sleep(3000);
				List<WebElement> txt = d.findElements(By.xpath("//p[@id='demo1']"));
				if (txt.size() > 0) {
					System.out.println(txt.get(0).getText());
				}
			} else if (s.equalsIgnoreCase("cancel")) {
				d.findElement(By.xpath("//a[contains(text(),'Alert with Textbox')]")).click();
				Thread.sleep(3000);
				d.findElement(By.xpath("//button[contains(text(),'click the button to demonstrate the prompt box ')]"))
						.click();
				Thread.sleep(3000);
				System.out.println(d.switchTo().alert().getText());
				Thread.sleep(3000);
				d.switchTo().alert().sendKeys("Srikanth");
				Thread.sleep(3000);
				d.switchTo().alert().dismiss();
				Thread.sleep(3000);
				List<WebElement> txt = d.findElements(By.xpath("//p[@id='demo1']"));
				if (txt.size() > 0) {
					System.out.println(txt.get(0).getText());
				}
			}
		}

		d.quit();

	}

}
