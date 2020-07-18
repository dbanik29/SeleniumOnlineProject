package com.bitm.SeleniumOnlineProject.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import com.bitm.SeleniumOnlineProject.Utils.DriverManager;
import com.bitm.SeleniumOnlineProject.Utils.UrlTextUtils;
import com.bitm.SeleniumOnlineProject.Utils.XpathUtils;

public class LoginTest {
	
	private WebDriver driver =null;
	
	public void checkLoginPageTitle()
	{
		driver = DriverManager.driver;
		driver.get(UrlTextUtils.URL.Base_URL);
		Assert.assertEquals(driver.getTitle(), UrlTextUtils.TEXT.HomePageTitle);
	}
	public void logintest()
	{
		driver.findElement(By.xpath(XpathUtils.LoginModule.user_name)).sendKeys("tutorial");
		driver.findElement(By.xpath(XpathUtils.LoginModule.password)).sendKeys("tutorial");
		driver.findElement(By.xpath(XpathUtils.LoginModule.signIN_BTN)).sendKeys("tutorial");
	}
}
