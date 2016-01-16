package com.vk;


import org.testng.annotations.Test;

public class SimpleTest extends WebDriverTest {
		
	
	@Test
	public void simpleTest(){
		
		loginPage.getTasksTable().get(0).click();
		driver.navigate().back();
        driver.navigate().refresh();
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
    public void simpleTest2(){

        loginPage.getTasksTable().get(0).click();
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
    public void simpleTest3(){

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
    public void simpleTest4(){

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
