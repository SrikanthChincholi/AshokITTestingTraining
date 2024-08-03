package selenium;

import org.testng.annotations.Test;

public class MainClass extends HandlingElements {

	@Test
	public void test() throws Exception {
		getUrl(url);
		enterData(getElement(xpath_fname), fname);
		enterData(getElement(xpath_lname), lname);
		enterData(getElement(xpath_addrs), address);
		// Please enter F or f for Female / enter M or m for Male
		selectGender(gender);
		waitForSecs(3);
		selectLang(lang);
		waitForSecs(3);
		tearDown();

	}

}
