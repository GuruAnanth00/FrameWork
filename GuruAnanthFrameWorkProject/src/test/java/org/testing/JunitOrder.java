package org.testing;

import java.io.IOException;
import java.util.Date;

import org.BaseClass.BasePojo;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class JunitOrder extends BasePojo {
	@BeforeClass
	public static void browserLaunch() {
		launchChrome();
		WinMax();
	}
	@AfterClass
	public  static void browserClose() {
		closeBrowser();
	}
	
	@Before
	public void startTime() throws InterruptedException {
		loadUrl("https://www.saucedemo.com/");
		Date d = new Date();
		System.out.println(d);
	}
	@After
	public void endTime() {
		Date d =new Date();
		System.out.println(d);
	}
	// valid  surename and invalid password
	@Test
	public void tc1() throws IOException, InterruptedException {
		BasePojo l = new BasePojo();
		fill(l.getTxtUser(),getData(1,0));
		fill(l.getTxtPass(),getData(1,3));
		btnClick(l.getBtnLogin());
		Thread.sleep(2000);
	}
	
	// invalid username valid password
	@Test
	public void tc3() throws IOException, InterruptedException {
		BasePojo l = new BasePojo();
		fill(l.getTxtUser(), getData(2, 0));
		fill(l.getTxtPass(), getData(2, 3));
		btnClick(l.getBtnLogin());
		Thread.sleep(2000);
	}
	
	// invalid username invalid password
	@Ignore
	@Test
	public void tc2() throws IOException, InterruptedException {
		BasePojo l = new BasePojo();
		fill(l.getTxtUser(), getData(3, 0));
		fill(l.getTxtPass(), getData(3, 3));
		btnClick(l.getBtnLogin());
		Thread.sleep(2000);
	}

}
