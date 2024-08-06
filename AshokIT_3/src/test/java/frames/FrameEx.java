package frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FrameEx {
	
	@Test
	public void framewithIndex()
	{
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.get("https://demo.automationtesting.in/Frames.html");
		d.switchTo().frame(0);
		d.findElement(By.xpath("//input[@type='text']")).sendKeys("Srikanth");
				
	}

}
