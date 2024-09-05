package dprovidertestng;

import java.util.ArrayList;
import java.util.*;

import org.testng.annotations.*;

public class DataProviderTestClass {

	@DataProvider(name = "DP1")
	public Object[][] getData1() {
		Object data[][] = new Object[][] { {"Yes", "admin","admin123" }, { "No","admin1","admin123" }, { "Yes","admin1","admin1234" } };
		return data;
	}
	
	@DataProvider(name = "DP2")
	public Object[] getData2() {
		Object data[] = new Object[] {"test","test1","test2","test3","test4","test5" } ;
		return data;
	}
	
	@DataProvider(name="DP3")
	public Iterator<String> getData3()
	{
		List<String> list = new ArrayList<>();
		list.add("admin");
		list.add("admin123");
		return list.iterator();
		
	}
	
	@DataProvider(name="DP4")
	public Iterator<String[]> getData4()
	{
		List<String[]> list = new ArrayList<>();
		list.add(new String[] {"test1","test2"});
		list.add(new String[] {"test3","test4"});
		list.add(new String[] {"test5","test6"});
		return list.iterator();
	}

	@Test(dataProvider = "DP4")
	public void readData(String[] s) {
		System.out.println(s[0] + " -- "+ s[1]);
		
	}
	
	

}



