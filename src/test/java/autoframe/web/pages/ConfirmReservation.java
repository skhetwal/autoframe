package autoframe.web.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import autoframe.web.base.Base;

public class ConfirmReservation {

	//Elements on the screen
	private String TXT_FirstName_ID = "order_bill_address_attributes_firstname";
	private String TXT_LastName_ID = "order_bill_address_attributes_lastname";
	
	private String LIST_Country_ID = "order_bill_address_attributes_country_id";
	private String TXT_PHONENO_ID = "order_bill_address_attributes_phone";
	private String TXT_EMAIL_ID = "order_bill_address_attributes_email";
	private String TXT_COMMENT_ID = "comment";
	
	
	private String CLK_Purchase_XPATH = "button_purchase";
	
	public ConfirmReservation enterContactInformation(){
		Base.getDriver().findElement(By.id(TXT_FirstName_ID)).sendKeys("FirstName");
		Base.getDriver().findElement(By.id(TXT_LastName_ID)).sendKeys("LastName");
		Base.getDriver().findElement(By.id(LIST_Country_ID)).sendKeys("India");
		Base.getDriver().findElement(By.id(TXT_PHONENO_ID)).sendKeys("0987654321");
		Base.getDriver().findElement(By.id(TXT_EMAIL_ID)).sendKeys("abcd@abcd.com");
		Base.getDriver().findElement(By.id(TXT_COMMENT_ID)).sendKeys("This is a sample comment, just for testing");
		return this;
	}
	
	public BookingSummery click_BookRooms(){
		Base.getDriver().findElement(By.xpath(CLK_Purchase_XPATH)).click();
		return new BookingSummery();
	}
}
