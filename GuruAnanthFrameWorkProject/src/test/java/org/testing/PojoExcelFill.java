package org.testing;

import java.io.IOException;

import org.BaseClass.BasePojo;
import org.openqa.selenium.WebElement;

public class PojoExcelFill extends BasePojo {

	public static void main(String[] args) throws IOException {
	       launchChrome();
	       WinMax();
	       loadUrl("https://www.saucedemo.com/");
	       printTitle();
	       printCurrentUrl();
	       
	       BasePojo l = new BasePojo();
	       fill(l.getTxtUser(),getData(1, 0));
	       
	       WebElement t = l.getTxtPass();
	       fill(t,getData(1, 3));
	       
	       WebElement btn= l.getBtnLogin();
	       btnClick(btn);

	}

	
		
	}


