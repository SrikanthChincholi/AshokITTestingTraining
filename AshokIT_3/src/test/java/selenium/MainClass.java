package selenium;

import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

import collectionprgms.ReadDataFromExcelToListMap;

public class MainClass extends HandlingElements {

	@Test
	public void test() throws Exception {
		List<Map<String, String>> dataset = ReadDataFromExcelToListMap.readDataFromExcelToListMap();
		for (int i = 0; i <dataset.size(); i++) {
			getUrl(url);
			enterData(getElement(xpath_fname), dataset.get(i).get("Username"));
			enterData(getElement(xpath_lname), dataset.get(i).get("Password"));
			enterData(getElement(xpath_addrs), address);
			// Please enter F or f for Female / enter M or m for Male
			selectGender(gender);
			waitForSecs(3);
		//	selectLang(lang);
			waitForSecs(3);
			tearDown();
		}

	}

}
