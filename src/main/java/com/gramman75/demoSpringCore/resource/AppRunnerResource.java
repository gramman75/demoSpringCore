package com.gramman75.demoSpringCore.resource;

import java.nio.file.Files;
import java.nio.file.Path;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;

@Component
public class AppRunnerResource  implements ApplicationRunner {
	@Autowired
	ResourceLoader resourceLoader;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("================ Resource Loader ==================");
		/**
		 * Application Context(xml, file, servlet)에 따라서 getResource의 변수값이 
		 * 가르키는 곳이 다름.
		 * 명시적으로 clsspath, file을 지정해서 사용.
		 */
		Resource resource = resourceLoader.getResource("classpath:text.txt");
		System.out.println(resource.getClass());
		System.out.println(resource.exists());
		System.out.println(Files.readString(Path.of(resource.getURI())));

		
	}

}
