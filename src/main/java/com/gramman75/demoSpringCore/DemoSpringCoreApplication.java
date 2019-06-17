/**
 * Autowired
 * Interface를 구현한 class 주입시 주의사항
 * @Service, @Controller, @Repository 사용처. 
 * @ComponentScan의 Scope(Annotation이 등록된 패키지)
 */
package com.gramman75.demoSpringCore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@PropertySource("classpath:/app.properties")
@EnableAsync
public class DemoSpringCoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoSpringCoreApplication.class, args);
	}
	
	@Bean
	public MessageSource messageSource() {
		var messageSource = new ReloadableResourceBundleMessageSource();
		messageSource.setBasename("classpath:/messages");
		messageSource.setDefaultEncoding("UTF-8");
		messageSource.setCacheSeconds(3);
		return messageSource;
	}

//	@Bean
//    public Validator validator() {
//
//        return new org.springframework.validation.beanvalidation.LocalValidatorFactoryBean();
//    }
	
	

}
 