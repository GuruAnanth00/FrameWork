package org.testing;

import java.io.IOException;

import org.BaseClass.BaseXLFill;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ExcelFill extends BaseXLFill {

	public static void main(String[] args) throws InterruptedException, IOException {
		 launchChrome();
	     WinMax();
	     loadUrl("https://www.saucedemo.com/");
	     printTitle();
	     printCurrentUrl();
	     
	     WebElement user= driver.findElement(By.id("user-name"));
	     String u = getData(1,0);
	     System.out.println(u);
	     fill(user,u);
	     
	     WebElement pass= driver.findElement(By.id("password"));
	     String p = getData(1,0);
	     System.out.println(p);
	     fill(pass,p);
	     
	     WebElement btn= driver.findElement(By.id("login-button"));
	     btnClick(btn);
	     
	     

	}

}
