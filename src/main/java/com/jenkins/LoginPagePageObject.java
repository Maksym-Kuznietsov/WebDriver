package com.jenkins;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.stereotype.Component;

@Component
public class LoginPagePageObject extends AbstractPageObject{
	
	@FindBy(css = "div[id='tasks']")
	private WebElement tasksTable;

    @FindBy(id = "jenkins-home-link")
    private WebElement jenkins;
	
//	public List<WebElement> getTasksTable(){
//		List<WebElement> hrefList = null;
//		By by = By.cssSelector("div[id='tasks']");
//		List<WebElement> divList = driver.findElement(by).findElements(By.tagName("div"));
//		for(WebElement i:divList){
//		hrefList = i.findElements(By.tagName("a"));
//		}
//		return hrefList;
//	}
	
//	public List<WebElement> getTasksTable(){
//		List<WebElement> hrefList = new ArrayList<WebElement>();
//		List<WebElement> divList = tasksTable.findElements(By.tagName("div"));
//		for(WebElement itr:divList){
//			List<WebElement> temp = itr.findElements(By.tagName("a"));
//			for(WebElement href:temp){
//				hrefList.add(href);
//			}
//		}
//		return hrefList;
//	}

	public List<WebElement> getTasksTable(){
		List<WebElement> divList = tasksTable.findElements(By.tagName("div"));
		List<WebElement> hrefList = new ArrayList<WebElement>(divList.size());
		for(WebElement itr:divList){			
				hrefList.add(itr.findElement(By.tagName("a")));			
		}
		return hrefList;
	}

}
