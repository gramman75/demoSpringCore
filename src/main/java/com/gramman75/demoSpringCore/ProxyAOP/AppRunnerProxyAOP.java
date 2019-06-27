package com.gramman75.demoSpringCore.ProxyAOP;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class AppRunnerProxyAOP implements ApplicationRunner {
	
	@Autowired
	IEventService iEventService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		System.out.println("=============== Proxy AOP ===================");
		
		iEventService.createEvent();
		iEventService.publishEvent();
		iEventService.deleteEvent();
		
	}
}
