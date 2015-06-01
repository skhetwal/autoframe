package autoframe.web.pages;

import org.openqa.selenium.By;
import org.testng.Assert;

import autoframe.web.base.Base;

public class BookingSummery {

	private String LBL_Confirmation_CSS = "span.padL5";
	
	private String CLK_Close_CSS = "";
	
	public BookingSummery ConfirmMessage(){
		String confirmationMessage = Base.getDriver().findElement(By.cssSelector(LBL_Confirmation_CSS)).getText();
		return this;
	}
}
