package com.vk;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.springframework.stereotype.Component;
@Component
public class LoginPagePageObject{
	
	protected WebDriver driver = new FirefoxDriver();
	
	LoginPagePageObject(){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="quick_email")
	private WebElement login;
	
	@FindBy(id="quick_pass")
	private WebElement password;
	
	@FindBy(id="quick_login_button")
	private WebElement loginButton;	
	
	public WebElement getLogin() {
		return login;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}
}
