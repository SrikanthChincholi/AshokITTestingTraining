package javaexecutorExamples;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class JSExampleForSelenium extends commonMethds {

	static String url = ReadPropertiesClass.getValue("url");
	static String srchbx = ReadPropertiesClass.getValue("srchbxn");
	static String value = ReadPropertiesClass.getValue("srchValue");
	static String srchbtn = ReadPropertiesClass.getValue("srchbtn");
	static String toaster = ReadPropertiesClass.getValue("xpath_Toaster");

	@Test
	public void executeScripts() throws Exception {
		getUrl(url);
		highlightElement(findElementWithJsId(srchbx));
		scrollIntoViewAndClickAndEnterText(findElementWithJsId(srchbx), value);
		List<WebElement> srchbtn = findElementWithJsClass(this.srchbtn);
		jsClick(srchbtn.get(1));
		click(findElementXpath(toaster));
	}
}
