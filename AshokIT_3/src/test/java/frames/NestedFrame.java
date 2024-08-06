package frames;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class NestedFrame {
	
	@Test
	public void testNestedFrames() throws Exception
	{
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.get("https://demo.automationtesting.in/Frames.html");
		Thread.sleep(3000);
		d.findElement(By.xpath("//a[text()='Iframe with in an Iframe']")).click();
		Thread.sleep(3000);
		d.switchTo().parentFrame();
		d.switchTo().frame(0);
		Actions act = new Actions(d);
		Thread.sleep(3000);
		act.sendKeys(Keys.TAB).sendKeys("Srikanth").perform();
					
	}

}
