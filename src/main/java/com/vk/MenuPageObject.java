package com.vk;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.stereotype.Component;

/** Class contains PageObjects for navigation menu*/
@Component
public class MenuPageObject extends AbstractPageObject{

	@FindBy(id = "myprofile")
	private WebElement myprofile;
	
	@FindBy(id="myprofile_edit")
	private WebElement myprofile_edit;
	
	@FindBy(xpath=".//*[@id='l_fr']/a/span[2]")
	private WebElement friends;
	

	@FindBy(xpath = "//*[contains (text(), 'Мои Сообщения')]")
	private WebElement messages;

	public WebElement getMyprofile() {
		return myprofile;
	}

	public WebElement getMyprofile_edit() {
		return myprofile_edit;
	}

	public WebElement getFriends() {
		return friends;
	}
	
	public WebElement getMyMessages() {
		return messages;
	}
}