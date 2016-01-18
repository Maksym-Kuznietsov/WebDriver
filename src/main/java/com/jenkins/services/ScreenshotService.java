package com.jenkins.services;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.Augmenter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;

/**
 * Created by _MeKa_
 * Service for creation screenshots.
 */
@Service
public class ScreenshotService {

	@Autowired
	private WebDriver driver;

	private TakesScreenshot getTakeScreenshot(){
		// return (TakesScreenshot) driver; - work ONLY for inite like: WebDriver driver = new FirefoxDriver();
		// This init help to take screensot in REMOTE driver.
		return ((TakesScreenshot) new Augmenter().augment(driver));
	}


	// TODO
	public File takeScreenshot(){
		File screenshot = getTakeScreenshot().getScreenshotAs(OutputType.FILE);
		return screenshot;
	}

}
