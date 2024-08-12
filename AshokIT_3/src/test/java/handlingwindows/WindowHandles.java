package handlingwindows;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WindowHandles {

	static WebDriver d;

	@Test
	public void wndHandle() throws Exception {
		d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		d.get("https://demo.automationtesting.in/Windows.html");
		String pwnd = d.getWindowHandle();
		System.out.println(d.getTitle());
		d.findElement(By.xpath("//a[text()='Open New Seperate Windows']")).click();
		Thread.sleep(2000);
		for (int i = 0; i <= 3; i++) {
			d.findElement(By.xpath("//button[text()='click']")).click();
			d.switchTo().window(pwnd);
		}
		Thread.sleep(3000);
		Set<String> allwindids = d.getWindowHandles();
		System.out.println(allwindids);
		for (String wnd : allwindids) {
			if (!wnd.equals(pwnd)) {
				d.switchTo().window(wnd);
				System.out.println(d.getTitle());
				List<WebElement> allmenus = d.findElements(By.xpath("//div[@id='main_navbar']/ul/li"));
				for (WebElement ele : allmenus) {
					System.out.println(ele.getText());

				}
				Thread.sleep(3000);
				d.close();
			//	break;
			}
		}
		Thread.sleep(3000);
		d.switchTo().window(pwnd);
		System.out.println(d.getTitle());
		d.quit();

	}

}
