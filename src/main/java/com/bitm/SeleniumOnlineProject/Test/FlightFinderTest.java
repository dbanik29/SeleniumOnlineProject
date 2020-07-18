package com.bitm.SeleniumOnlineProject.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.bitm.SeleniumOnlineProject.Utils.DriverManager;
import com.bitm.SeleniumOnlineProject.Utils.XpathUtils;

public class FlightFinderTest {
	
	private WebDriver driver =null;

	@Test
	public void checkFlightfinderPageTitle()
	{
		driver = DriverManager.driver;
	}
	public void flightfinderTest()
	{
		driver.findElement(By.xpath(XpathUtils.FlightFinderModule.oneway_BTN)).sendKeys("");
		
	}
	
}
