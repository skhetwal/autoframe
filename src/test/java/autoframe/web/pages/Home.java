package autoframe.web.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import autoframe.web.base.Base;

public class Home {
	WebElement element ;
	
	// Elements in Home screen
	private String clk_BookNow = "book_now_tab";
	private String scrpt_Home = "span:contains(Home)";
	private String clk_Property = "span:contains(Property)";
	private String clk_RoomsNRates = "span:contains(Rooms & Rates)";
	private String clk_Gallery = "span:contains(Gallery)";
	private String clk_Contact = "span:contains(Contact)";

	public BookingPage click_BookId(){
		Base.getDriver().findElement(By.id(clk_BookNow)).click();
		return new BookingPage();
	}

	protected void click_Home() {
		//TODO: Need to work on this line and need to remove the dependency on the element object
		//Base.getDriver().executeScript("return $('span:contains(Home)')[1]");
		element = (WebElement) ((JavascriptExecutor) Base.getDriver()).executeScript("return $('span:contains(Home)')[1]");
		element.click();
	}

	protected void click_Property() {
		element = (WebElement) ((JavascriptExecutor) Base.getDriver())
				.executeScript("return $('span:contains(Property)')[1]");
		element.click();
	}

	protected void click_RoomsNRates() {
		element = (WebElement) ((JavascriptExecutor) Base.getDriver())
				.executeScript("return $('span:contains(Rooms & Rates)')[1]");
		element.click();
	}

	protected void click_Gallery() {
		element = (WebElement) ((JavascriptExecutor) Base.getDriver())
				.executeScript("return $('span:contains(Gallery)')[1]");
		element.click();
	}

	protected void click_Contact() {
		element = (WebElement) ((JavascriptExecutor) Base.getDriver())
				.executeScript("return $('span:contains(Contact)')[1]");
		element.click();
	}

}
