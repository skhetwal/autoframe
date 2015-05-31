package autoframe.web.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import autoframe.web.base.Base;
import autoframe.web.pages.BookingPage;
import autoframe.web.pages.Home;

public class Test_UserBooking {

	WebDriver driver;
	WebElement element;

	@BeforeClass
	public void setup() {
		driver = Base.getDriver();
		driver.get(Base.FRAME_URL);
	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}

	@Test
	public void BookRoom_Test() {
		BookingPage bp = new BookingPage();
		bp.selectInDate().selectOutDate().selectAdults().selectChildren()
				.clickSearch().selectNumberOfRooms().clickReserve()
				.clickContinueReservation().enterContactInformation()
				.click_BookRooms().ConfirmMessage();
	}

	@Test
	public void BookRoomWithFBShare_Test() {
		BookingPage bp = new BookingPage();
		bp.selectInDate().selectOutDate().selectAdults().selectChildren()
				.clickSearch().selectNumberOfRooms().clickReserve().ShareOnFB()
				.cancelFBLogin().clickContinueReservation()
				.enterContactInformation().click_BookRooms().ConfirmMessage();
	}

}
