package autoframe.web.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	
	
	public final static String FRAME_URL = "https://test-hotel.hotelrunner.com/bv2/search?opener=test-hotel.hotelrunner.com&w=1";
	public final static String APPLICATION_BASE_URL = "http://test-hotel.hotelrunner.com/";
	
	private static FirefoxDriver driver;
	
	public static FirefoxDriver getDriver(){
		if(driver == null){
			synchronized(Base.class){
				if(driver == null){
					driver = configureDriver();
				}
			}
		}
		return driver;
	}
	
	public static FirefoxDriver configureDriver(){
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}

}
