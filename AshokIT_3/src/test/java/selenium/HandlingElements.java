package selenium;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class HandlingElements {

	static WebDriver d;
	static By xpath_fname = By.xpath("//input[@placeholder='First Name']");
	static By xpath_lname = By.xpath("//input[@placeholder='Last Name']");
	static By xpath_addrs = By.xpath(".//*[@ng-model='Adress']");
	static By css_gender_male = By.cssSelector("input[value='Male']");
	static By css_gender_female = By.cssSelector("input[value='FeMale']");
	static String fname = "Srikanth";
	static String lname = "Chincholi";
	static String address = "Hyderabad - 500019, Telangana";
	static String url = "https://demo.automationtesting.in/Register.html";
	static By xpath_langs = By.xpath("//multi-select//ul/li");
	static By xpath_multiselect = By.xpath("//multi-select/div[contains(@class,'ui-autocomplete-multiselect')]");
	static char gender = 'm';
	static String[] lang = { "English", "Dutch", "Arabic", "Danish", "Czech" };

	public WebElement getElement(By by) {
		return d.findElement(by);
	}

	public List<WebElement> getElements(By by) {
		return d.findElements(by);
	}

	public String getText(WebElement ele) {
		return ele.getText();
	}

	public void clickElement(WebElement ele) {
		ele.click();
	}

	public void enterData(WebElement ele, String value) {
		ele.sendKeys(value);
	}

	public void getUrl(String url) {
		getDriver();
		maxwindow();
		d.get(url);
	}

	public void maxwindow() {
		d.manage().window().maximize();
	}

	public WebDriver getDriver() {
		return d = new ChromeDriver();
	}

	public void tearDown() {
		d.quit();
	}

	public void waitForSecs(int value) throws Exception {
		Thread.sleep(value * 1000);
	}

	public void selectGender(char ch) throws Exception {
		if (ch == 'M' || ch == 'm')
			clickElement(getElement(css_gender_male));
		else if (ch == 'F' || ch == 'f')
			clickElement(getElement(css_gender_female));
		else
			throw new Exception("Select proper gender");
	}

	public void selectLang(String language[]) throws Exception {
		StringBuilder str = new StringBuilder();
		// str = String.join(",", language);
		for (String s : language) {
			str.append(s + ",");
		}
		str.deleteCharAt(str.toString().lastIndexOf(","));
		selectLang(str.toString());
	}

	public void selectLang(String language) throws Exception {
		String lang[] = language.split(",");
		for (int i = 0; i < lang.length; i++) {
			clickElement(getElement(xpath_multiselect));
			waitForSecs(2);
			List<WebElement> allelements = getElements(xpath_langs);
			for (WebElement ele : allelements) {
				if (lang[i].equalsIgnoreCase(getText(ele))) {
					clickElement(ele);
					System.out.println("Selected option - " + lang[i]);
					break;
				}
			}
		}
	}

	public static WebElement fleuntWaitforElement1(By by) {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(d);
		return wait.until(ExpectedConditions.visibilityOfElementLocated(by));

	}

	private static Wait<WebDriver> fleuntWaitforElement2(By by) {
		return new FluentWait<WebDriver>(d).pollingEvery(Duration.ofMillis(500)).withTimeout(Duration.ofSeconds(30))
				.ignoring(ElementClickInterceptedException.class);

	}

}
