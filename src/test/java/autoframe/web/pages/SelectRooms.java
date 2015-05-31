package autoframe.web.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import autoframe.web.base.Base;

public class SelectRooms {
	
	WebElement element;
	
	//Elements on Select Room Module
	private String LST_QuantitySelector_ID = "quantity_selector";
	
	private String CLK_Reserve_CSS = "buy_room_button";
	
	
	public SelectRooms(){
		//TODO : Need to add basic assertions while the page loads
	}
	
	public SelectRooms selectNumberOfRooms(){
		Select rooms = new Select(Base.getDriver().findElement(By.id(LST_QuantitySelector_ID)));
		rooms.selectByIndex(1);//Will select the second option i.e 1
		return this;
	}
	
	public CustomizeStay clickReserve(){
		WebElement reserve = Base.getDriver().findElement(By.cssSelector("button.buy_room_button"));
		reserve.click();
		return new CustomizeStay();
	}
	

}
