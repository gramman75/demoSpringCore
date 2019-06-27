package com.gramman75.demoSpringCore.ProxyAOP;

import org.springframework.stereotype.Service;

@Service
public class EventService implements IEventService{

	@Override
	public void createEvent() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("createEvent");
		
	}

	@Override
	public void publishEvent() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("publishEvent");
		
	}

	@Override
	public void deleteEvent() {
		System.out.println("deleteEvent");
	}
	

}
