package com.vk;


import org.testng.annotations.Test;

public class SimpleTest2 extends WebDriverTest {
		
	
	@Test
	public void simpleTest5(){
		
		loginPage.getTasksTable().get(0).click();
		driver.navigate().back();
		loginPage.getTasksTable().get(1).click();
		driver.navigate().back();
		loginPage.getTasksTable().get(2).click();
		driver.navigate().back();
		loginPage.getTasksTable().get(3).click();
		driver.navigate().back();
		loginPage.getTasksTable().get(4).click();
		driver.navigate().back();
	}

    @Test
    public void simpleTest6(){

        loginPage.getTasksTable().get(0).click();
        driver.navigate().back();
        loginPage.getTasksTable().get(1).click();
        driver.navigate().back();
        loginPage.getTasksTable().get(2).click();
        driver.navigate().back();
        loginPage.getTasksTable().get(3).click();
        driver.navigate().back();
        loginPage.getTasksTable().get(4).click();
        driver.navigate().back();
    }
    @Test
    public void simpleTest7(){

        loginPage.getTasksTable().get(0).click();
        driver.navigate().back();
        loginPage.getTasksTable().get(1).click();
        driver.navigate().back();
        loginPage.getTasksTable().get(2).click();
        driver.navigate().back();
        loginPage.getTasksTable().get(3).click();
        driver.navigate().back();
        loginPage.getTasksTable().get(4).click();
        driver.navigate().back();
    }
    @Test
    public void simpleTest8(){

        loginPage.getTasksTable().get(0).click();
        driver.navigate().back();
        loginPage.getTasksTable().get(1).click();
        driver.navigate().back();
        loginPage.getTasksTable().get(2).click();
        driver.navigate().back();
        loginPage.getTasksTable().get(3).click();
        driver.navigate().back();
        loginPage.getTasksTable().get(4).click();
        driver.navigate().back();
    }

}
