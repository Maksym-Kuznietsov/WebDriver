package com.vk.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class TestProperties{

	@Value("${start.url}")
	private String startUrl;
	
	@Value("${wait.time}")
	private int waitTime;
	
	@Value("${wait.page.load}")
	private int waitPageLoad;
	
	
	public String getStartUrl() {
		return startUrl;
	}

	public int getWaitTime() {
		return waitTime;
	}

	public int getWaitPageLoad() {
		return waitPageLoad;
	}

}