package com.gramman75.demoSpringCore.propertyEditor;

import org.springframework.core.convert.converter.Converter;

public class EventConverter {
	
	public static class StringToEvent implements Converter<String, Event>{
		@Override
		public Event convert(String source) {
			return new Event(Integer.parseInt(source));
		}
	}
	
	public static class EventToString implements Converter<Event, String>{
		@Override
		public String convert(Event source) {
			return source.getId().toString();
		}
	}

}
