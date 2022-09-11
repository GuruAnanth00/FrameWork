package org.testing;

import java.io.IOException;
import java.util.Date;

import org.BaseClass.BasePojo;
import org.BaseClass.BaseXLFill;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvide extends BaseXLFill {
	@BeforeClass
	public static void browserLaunch() {
		launchChrome();
		WinMax();

	}

	@AfterClass
	public  void BrowserClose() {
		closeBrowser();
	}

	@Test(priority = -1, enabled = true, dataProvider = "login")
	public void tc1(String s1, String s2) throws InterruptedException {
		BasePojo l = new BasePojo();
		fill(l.getTxtUser(), s1);
		fill(l.getTxtPass(), s2);
		btnClick(l.getBtnLogin());
		Thread.sleep(2000);
	}

	@DataProvider(name = "login")
	private Object[][] loginDataProvider() throws IOException {
		return new Object[][] { 
			{ getData(1, 0), getData(1, 3) },
			{ getData(2, 0), getData(2, 3) },
			{ getData(3, 0), getData(3, 3) },
			{ getData(4, 0), getData(4, 3) } };
	}

	@BeforeMethod
	public void startTime()  {
		loadUrl("https://www.saucedemo.com/");
		Date d = new Date();
		System.out.println(d);
	}

	@AfterMethod
	public void endTime() {
		Date d = new Date();
		System.out.println(d);
	}

}
