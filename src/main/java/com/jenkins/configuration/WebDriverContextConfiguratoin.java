package com.jenkins.configuration;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;


@Configuration
@ComponentScan(basePackages = {"com.jenkins"})
@PropertySource(value = {"classpath:application.properties"})
public class WebDriverContextConfiguratoin {
	
	@Autowired
	private TestProperties testProperties;

    /** This code only for firefox browser;
	@Bean
	public WebDriver webDriver() {
        File file = new File("C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");

		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(testProperties.getWaitTime(),	TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(testProperties.getWaitPageLoad(), TimeUnit.SECONDS);
		return driver;
	}

     // This Bean work with file application.properties
	@Bean
	public static PropertySourcesPlaceholderConfigurer propertySources(){
		return new PropertySourcesPlaceholderConfigurer();
	}
*/

    /** You may use different browsers with this code*/
    private WebDriver getDriver(String browser){

        /** if you want run tests in chrome with maven put in console: mnv test -Dbrowser=chrome
         * and test will run in chrome.
         * if you want run tests in firefox: mvn test*/
        if("CHROME".equalsIgnoreCase(browser)){
            return new ChromeDriver();
        }

        // If the property is empty we will use FirefoxDriver
       return new FirefoxDriver();
    }

    @Bean
    public WebDriver webDriver() {

        WebDriver driver = getDriver(System.getProperty("browser"));
        driver.manage().timeouts().implicitlyWait(testProperties.getWaitTime(),	TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(testProperties.getWaitPageLoad(), TimeUnit.SECONDS);
        return driver;
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySources(){
        return new PropertySourcesPlaceholderConfigurer();
    }
}
