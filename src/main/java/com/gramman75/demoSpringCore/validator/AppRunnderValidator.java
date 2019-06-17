/*
 * Maven에 dependency추가
 * spring-boot-starter-validation
 */
package com.gramman75.demoSpringCore.validator;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import org.springframework.validation.BeanPropertyBindingResult;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
public class AppRunnderValidator implements ApplicationRunner {
	
	@Autowired
	Validator validator;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("=============== Validator =====================");
		System.out.println(validator.getClass());
		MyEvent myEvent = new MyEvent();
//		EventValidator eventValidator = new EventValidator();
		Errors errors = new BeanPropertyBindingResult(myEvent, "myevent");
		
//		eventValidator.validate(myEvent, errors);
		validator.validate(myEvent, errors);
		
		errors.getAllErrors().forEach( e ->{
			Arrays.stream(e.getCodes()).forEach(System.out::println);
			System.out.println(e.getDefaultMessage());
		});
		
		
			
		
		
	}

}
