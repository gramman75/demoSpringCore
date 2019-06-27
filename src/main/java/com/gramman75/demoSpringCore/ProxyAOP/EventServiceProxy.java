package com.gramman75.demoSpringCore.ProxyAOP;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class EventServiceProxy implements IEventService {
	
	@Autowired
	EventService eventService;

	@Override
	public void createEvent() {
		long start = System.currentTimeMillis();
		eventService.createEvent();
		System.out.println(System.currentTimeMillis() - start);
	}

	@Override
	public void publishEvent() {
		long start = System.currentTimeMillis();
		eventService.publishEvent();
		System.out.println(System.currentTimeMillis() - start);
		
	}

	@Override
	public void deleteEvent() {
		eventService.deleteEvent();
		
	}
	

}
