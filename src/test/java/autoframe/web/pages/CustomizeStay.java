package autoframe.web.pages;

import org.openqa.selenium.By;

import autoframe.web.base.Base;

public class CustomizeStay {
	
	//Handle for this screen
	private String mainWindow;
	
	public CustomizeStay(){}
	
	public CustomizeStay(String handle){
		Base.getDriver().switchTo().window(handle);
	}
		
	private String CLK_FBButton_CSS = "section.boxShare.single";	
	
	//Cancel button for FB Access interface
	private String CLK_Confirm_NAME = "__CONFIRM__";
	
	private String CLK_Continue_ID = "checkout-link";
	
	public FBAccessPage ShareOnFB(){
		//Storing the current window handle
		mainWindow = Base.getDriver().getWindowHandle();
		
		String mainWindow = Base.getDriver().getWindowHandle();
		Base.getDriver().findElement(By.cssSelector(CLK_FBButton_CSS)).click();
		
		return new FBAccessPage(mainWindow);
	}
	
	public ConfirmReservation clickContinueReservation(){
		Base.getDriver().findElement(By.id(CLK_Continue_ID)).click();		
		return new ConfirmReservation();
	}
	
}
