package com.gramman75.demoSpringCore.eventPublisher;

import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class MyListener {
	
	@EventListener
	@Async
	public void handler(MyEvent event) {
		System.out.println(Thread.currentThread().toString());
		System.out.println(event.getData());
		
	}
	
	@EventListener
	@Async
	public void handler(ContextRefreshedEvent event) {
		System.out.println(Thread.currentThread().toString());
		System.out.println("ContextRefreshedEvent");
	}

}
