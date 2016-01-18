package com.jenkins.services;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class JavaScriptService {

    @Autowired
    private WebDriver driver;


    private JavascriptExecutor getJS(){
        return (JavascriptExecutor) driver;
    }

    public void executeScript(String script){

        getJS().executeScript(script);
    }
}
