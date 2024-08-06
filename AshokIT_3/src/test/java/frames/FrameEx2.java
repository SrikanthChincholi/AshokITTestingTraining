package frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FrameEx2 {
	
//	@Test
	public void framewithIndex()

	{
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.get("https://docs.oracle.com/javase/8/docs/api/");
		d.switchTo().frame(0);
		d.findElement(By.xpath("//a[text()='java.applet']")).click();
		d.switchTo().defaultContent();
		d.switchTo().frame(1);
		d.findElement(By.xpath("//span[text()='AppletContext']")).click();
		d.switchTo().defaultContent();
		d.switchTo().frame(2);
		d.findElement(By.xpath("//a[text()='Applet']")).click();
	}
	//@Test
	public void framewithIdorName() throws Exception

	{
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.get("https://docs.oracle.com/javase/8/docs/api/");
		d.switchTo().frame("packageListFrame");
		d.findElement(By.xpath("//a[text()='java.applet']")).click();
		Thread.sleep(3000);
		d.switchTo().defaultContent();
		d.switchTo().frame("packageFrame");
		d.findElement(By.xpath("//span[text()='AppletContext']")).click();
		Thread.sleep(3000);
		d.switchTo().defaultContent();
		d.switchTo().frame("classFrame");
		d.findElement(By.xpath("//a[text()='Applet']")).click();
		d.switchTo().defaultContent();
		System.out.println(d.getTitle());
	}
	
	@Test
	public void framewithWebElement() throws Exception

	{
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.get("https://docs.oracle.com/javase/8/docs/api/");
		d.switchTo().frame(0);
		d.findElement(By.xpath("//a[text()='java.applet']")).click();
		Thread.sleep(3000);
		d.switchTo().defaultContent();
		d.switchTo().frame(d.findElement(By.xpath("//frame[@name='packageFrame']")));
		d.findElement(By.xpath("//span[text()='AppletContext']")).click();
		Thread.sleep(3000);
		d.switchTo().defaultContent();
		d.switchTo().frame("classFrame");
		d.findElement(By.xpath("//a[text()='Applet']")).click();
		d.switchTo().defaultContent();
		System.out.println(d.getTitle());
	}
}
