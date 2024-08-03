package selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumEx {

	static WebDriver d = null;
	static String url = "https://demo.automationtesting.in/Register.html";
	static String name = "Srikanth";
	static By xpath = By.xpath("//input[@placeholder='First Name']");

	public static void main(String[] args) throws Exception {

		enterText(url,xpath,name);
	}

	public static void enterText(String url, By by, String name) {
		try {
			d = new ChromeDriver();
			d.get(url);
			d.manage().window().maximize();
			String pageTitle = d.getTitle();
			if (pageTitle.equalsIgnoreCase("Register")) {
				System.out.println("Title Matched !!");
				WebElement ele = d.findElement(by);
				ele.sendKeys(name);
				ele.clear();
				ele.sendKeys("Chincholi");
				String data = ele.getAttribute("value");
				System.out.println(data);
				Thread.sleep(5000);
			} else {
				throw new Exception("Page title didn't match !!");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());

		} finally {
			d.quit();
		}
	}
}
