package com.vk;

import javax.annotation.PostConstruct;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.springframework.beans.factory.annotation.Autowired;


public abstract class AbstractPageObject{

	@Autowired
	protected WebDriver driver;
	
	public AbstractPageObject() {}

	@PostConstruct
	public void init(){
		PageFactory.initElements(driver, this);
	}
}
