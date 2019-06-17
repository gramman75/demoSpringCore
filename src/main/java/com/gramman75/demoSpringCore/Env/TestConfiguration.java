package com.gramman75.demoSpringCore.Env;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile(value = "test")
public class TestConfiguration {
	
	@Bean
	public EnvRepository envRepository() {
		return new EnvRepository();
	}

}
