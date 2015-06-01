package autoframe.web.scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
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
	
	@AfterSuite
	public void tearDown(){
		driver.quit();
	}


	@Test(groups="All")
	public void HomeUICheck_Test() {

	}

	@Test(groups="All")
	public void HomeScrollCheck_Test() {
	
	}
}
