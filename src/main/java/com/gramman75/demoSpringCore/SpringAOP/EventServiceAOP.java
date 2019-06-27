package com.gramman75.demoSpringCore.SpringAOP;

import org.springframework.stereotype.Service;

@Service
public class EventServiceAOP{

	@PerfAnnotation
	public void createEvent() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("createEvent");
		
	}

	@PerfAnnotation
	public void publishEvent() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("publishEvent");
		
	}

	public void deleteEvent() {
		System.out.println("deleteEvent");
	}
	

}
