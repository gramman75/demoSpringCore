package com.gramman75.demoSpringCore.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class EventValidator implements Validator {
	
	@Override
	public boolean supports(Class<?> clazz) {
		return MyEvent.class.equals(clazz);
	}
	
	@Override
	public void validate(Object target, Errors errors) {
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "title", "notEmpty", "default message");
		
	}
 
}
