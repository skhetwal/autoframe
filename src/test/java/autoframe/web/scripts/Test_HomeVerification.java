package autoframe.web.scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import autoframe.web.base.Base;
import autoframe.web.pages.BookingPage;

public class Test_HomeVerification {
	WebDriver driver;
	WebElement element;

	@BeforeClass
	public void setup() {
		driver = Base.getDriver();
		driver.get(Base.BASE_URL);
	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}

	@Test
	public void HomeUICheck_Test() {

	}

	@Test
	public void HomeScrollCheck_Test() {
	
	}
}
