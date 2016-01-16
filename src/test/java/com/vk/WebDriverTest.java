package com.vk;

import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;

import com.vk.configuration.TestProperties;
import com.vk.configuration.WebDriverContextConfiguratoin;

@ContextConfiguration(classes = WebDriverContextConfiguratoin.class)
public class WebDriverTest extends AbstractTestNGSpringContextTests{

	
	@Autowired
	protected WebDriver driver;
	
	@Autowired
	protected LoginPagePageObject loginPage;
	
	@Autowired
	protected MenuPageObject menu;
	
	@Autowired
	private TestProperties properties;

	@BeforeClass(alwaysRun = true)
	public void autoLogin() {
		
		driver.get(properties.getStartUrl());
		
	}

	@AfterMethod(alwaysRun = true)
	public void afterMetod() {
        driver.get(properties.getStartUrl());
	}

	@AfterSuite
	public void shutdownDriver() {

        driver.quit();
	}

}
