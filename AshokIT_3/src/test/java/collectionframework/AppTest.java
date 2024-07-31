package collectionframework;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AppTest {

	public static void main(String[] args) throws Exception {

		WebDriver d = new ChromeDriver();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		d.get("https://demo.automationtesting.in/Register.html");
		List<WebElement> allskills = d.findElements(By.xpath("//select[@placeholder='Month']/option"));
		List<String> skills = new ArrayList<>();
		if (allskills.size() > 0) {
			for (WebElement ele : allskills) {
				skills.add(ele.getText().trim());
			}
			skills.remove("Month");
			System.out.println(skills);
			Collections.singleton(skills);
			Collections.sort(skills,Collections.reverseOrder());
			System.out.println("************************************");
			System.out.println(skills);

			Thread.sleep(5000);
			d.quit();

		}
	}

}
