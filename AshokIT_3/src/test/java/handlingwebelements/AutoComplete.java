package handlingwebelements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class AutoComplete {

	static WebDriver d;

	@Test
	public void autoComplete() {
		try {
			d = new EdgeDriver();
			d.get("https://jqueryui.com/autocomplete/");
			d.manage().window().maximize();
			d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			d.switchTo().frame(0);
			WebElement ele = d.findElement(By.id("tags"));
			ele.sendKeys("-");
			List<WebElement> options = d.findElements(By.xpath("//ul[@id='ui-id-1']/li"));
			if (options.size() > 0) {
				for (WebElement option : options) {
					if (option.getText().equals("Lisp")) {
						option.click();
						break;
					}
				}
			} else {
				String s = new MyException().toString();
				System.out.println(s);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			d.quit();
		}
	}

}
