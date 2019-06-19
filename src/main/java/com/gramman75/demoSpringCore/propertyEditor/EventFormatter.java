/*
 * Converter와 Formatter는 Bean으로 등록이 되면
 * 자동으로 ConversionService에 등록이 됨.
 * 별도 등록과정(WebConfig.java)이 필요 없음.
 * 자동등록은 Spring Boot의 기능 
 */
package com.gramman75.demoSpringCore.propertyEditor;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.format.Formatter;

public class EventFormatter implements Formatter<Event> {
	@Override
	public Event parse(String text, Locale locale) throws ParseException {
		return new Event(Integer.parseInt(text));
	}
	
	@Override
	public String print(Event object, Locale locale) {
		return object.getId().toString();
	}

}
