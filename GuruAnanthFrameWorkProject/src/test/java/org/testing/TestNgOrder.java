package org.testing;

import java.io.IOException;
import java.util.Date;

import org.BaseClass.BasePojo;
import org.BaseClass.BaseXLFill;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNgOrder extends BaseXLFill {
     @BeforeClass
     public static void browserLaunch() {
    	 launchChrome();
    	 WinMax();  	 
     }
     
     @AfterClass
     public void browserClose() {
    	 closeBrowser();
     }
     
     @Test(priority = -1, enabled=true)
     public void tc1() throws InterruptedException, IOException {
    	 BasePojo l = new BasePojo();
    	 fill(l.getTxtUser(), getData(3, 0));
    	 fill(l.getTxtPass(), getData(3, 3));
    	 btnClick(l.getBtnLogin());
    	 Thread.sleep(2000);
     }
     
     @Test(priority = -3 , invocationCount = 1)
     public void tc3() throws IOException, InterruptedException {
    	 BasePojo l = new BasePojo();
    	 fill(l.getTxtUser(), getData(2, 0));
    	 fill(l.getTxtPass(), getData(2, 3));
    	 btnClick(l.getBtnLogin());
    	 Thread.sleep(2000);
     }
     
     @Parameters({"NAME","PH NO"})
     @Test(priority = -2)
     public void tc2 (@Optional("ANANTH")String s1,@Optional("9715799035")String s2) throws InterruptedException {
    	 BasePojo l = new BasePojo();
    	 fill(l.getTxtUser(),s1);
    	 fill(l.getTxtPass(),s2);
    	 btnClick(l.getBtnLogin());
    	 Thread.sleep(2000);
     }
     @BeforeMethod
     public void startTime() {
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