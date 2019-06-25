package com.gramman75.demoSpringCore.SpringAOP;

import org.springframework.stereotype.Component;

@Component
public interface IEventService {
	void createEvent();
	void publishEvent();
	void deleteEvent();

}
