package autoframe.web.pages;

import org.openqa.selenium.By;

import autoframe.web.base.Base;

public class FBAccessPage extends CustomizeStay {

	// Handle for this screen
	private String mainWindow;

	// public FBAccessPage(){
	//
	// }

	public FBAccessPage(String handle) {
		mainWindow = handle;
		// Selecting the POP-up window
		for (String winHandle : Base.getDriver().getWindowHandles()) {
			Base.getDriver().switchTo().window(winHandle);
		}
	}

	// Elements on FBConfirmation Screen

	// CASE 1:Element on FB Login screen
	private String CLK_FBLogin_NAME = "login";
	private String CLK_FBLoginCancel_NAME = "cancel";

	// CASE 2: when the browser have FB session
	private String CLK_CancelAccess_NAME = "__CANCEL__";
	private String CLK_ConfirmAccess_NAME = "__CONFIRM__";

	public CustomizeStay cancelFBAccess() {
		Base.getDriver().findElement(By.name(CLK_CancelAccess_NAME)).click();
		return new CustomizeStay(mainWindow);
	}

	public CustomizeStay cancelFBLogin() {
		Base.getDriver().findElement(By.name(CLK_FBLoginCancel_NAME)).click();
		return new CustomizeStay(mainWindow);
	}

}
