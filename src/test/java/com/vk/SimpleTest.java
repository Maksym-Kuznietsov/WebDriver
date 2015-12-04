package com.vk;


import org.testng.annotations.Test;

public class SimpleTest extends WebDriverTest {
		
	
	@Test
	public void simpleTest() throws Exception {
		
		loginPage.getTasksTable().get(2).click();
		Thread.sleep(100000);

	}
}
