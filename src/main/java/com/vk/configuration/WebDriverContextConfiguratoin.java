package com.vk.configuration;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;


@Configuration
@ComponentScan(basePackages = { "com.vk" })
@PropertySource(value = {"classpath:application.properties"})
public class WebDriverContextConfiguratoin {
	
	@Autowired
	private TestProperties testProperties;

	@Bean
	public WebDriver webDriver() {
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(testProperties.getWaitTime(),	TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(testProperties.getWaitPageLoad(), TimeUnit.SECONDS);
		return driver;
	}
	
	@Bean
	public static PropertySourcesPlaceholderConfigurer propertySources(){
		return new PropertySourcesPlaceholderConfigurer();
	}
}
