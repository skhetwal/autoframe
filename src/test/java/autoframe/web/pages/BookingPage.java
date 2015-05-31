package autoframe.web.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import autoframe.web.base.Base;

public class BookingPage extends Home{
	
	WebDriver driver;
	WebElement element;

	//Elements  in the Booking Page
	private String DTE_CheckIn_ID = "dpd2";
	private String INPUT_CheckIn_ID = "checkin_date";
	private String DTE_CheckOut_ID = "left_form_end";
	private String LST_RoomsCount_ID = "rooms_count";
	private String LST_AdultCount_ID = "1_adult_count";
	private String LST_ChildrenCount_ID = "1_child_count";
	
	private String CLK_PromoCode_ID = "promoCode";
	
	private String CLK_Search_ID = "searchButton";
	
	
	private String CLK_Close_CSS = "fa fa-times marR10 closeFrameIcon";
	
	private String DTE_ActiveDate_CSS = "day active";
	

	public BookingPage selectInDate(){
		Base.getDriver().findElement(By.id(DTE_CheckIn_ID)).click();
		this.selectCurrentDate(0);
		//	element = (WebElement) ((JavascriptExecutor) Base.getDriver()).executeScript("return $('.datepicker-wrap.parsley-success')[0]");
		//Base.getDriver().findElement(By.id(DTE_CheckIn_ID)).click();
		
//		List<WebElement> allinputs = Base.getDriver().findElements(By.tagName("input"));
//		for (WebElement xelement : allinputs){
//			System.out.println(" element : " + xelement+" element text : " + xelement.getText()+" element location : "+xelement.getLocation() +" element class : "+ xelement.getClass());
//			System.out.println(xelement.getText());
//		}
		//element.click();
		return this;
	}
	
	public BookingPage selectOutDate(){
		Base.getDriver().findElement(By.id(DTE_CheckOut_ID)).click();
		this.selectCurrentDate(1);
		return this;
	}
	
	private BookingPage selectCurrentDate(int index){
		element = (WebElement) ((JavascriptExecutor) Base.getDriver()).executeScript("return $('td.day.active')["+index+"]");
		element.click();
		return this;
	}
	
	public BookingPage selectRooms(){
		Base.getDriver().findElement(By.id(LST_RoomsCount_ID)).sendKeys("1");
		return this;
	}
	
	public BookingPage selectAdults(){
		Base.getDriver().findElement(By.id(LST_AdultCount_ID)).sendKeys("1 Adult");
		return this;
	}
	
	public BookingPage selectChildren(){
		Base.getDriver().findElement(By.id(LST_ChildrenCount_ID)).sendKeys("0 Children");
		return this;
	}

	public SelectRooms clickSearch(){
		Base.getDriver().findElement(By.id(CLK_Search_ID)).click();
		return new SelectRooms();
	}
	
	
//	selenium.open("/#/home");
//	selenium.selectFrame("");
//	selenium.selectFrame("");
//	selenium.click("id=dpd2");
//	selenium.click("css=td.day.active");
//	selenium.click("//div[@id='sizzle-1433003418014']/div/table/tbody/tr/td[3]");
//	selenium.click("id=left_form_end");
//	selenium.click("css=#sizzle-1433003418014 > div.datepicker-days > table..table-condensed > tbody > tr > td.day.active");
//	selenium.click("id=searchButton");
//	selenium.waitForPageToLoad("30000");
//	selenium.select("id=quantity_selector", "label=1");
//	selenium.click("css=option[value=\"1\"]");
//	selenium.click("css=button.buy_room_button");
//	selenium.waitForPageToLoad("30000");
//	selenium.click("id=checkout-link");
//	selenium.waitForPageToLoad("30000");
//	selenium.type("id=order_bill_address_attributes_firstname", "jagga");
//	selenium.type("id=order_bill_address_attributes_lastname", "dee");
//	selenium.select("id=order_bill_address_attributes_country_id", "label=Afghanistan");
//	selenium.type("id=order_bill_address_attributes_phone", "123456789");
//	selenium.type("id=order_bill_address_attributes_email", "asdf@asdf.com");
//	selenium.type("id=comment", "no notes");
//	selenium.click("xpath=(//input[@id='button_purchase'])[2]");
//	selenium.waitForPageToLoad("30000");
//	selenium.click("css=i.fa.fa-times");

	
	
}
