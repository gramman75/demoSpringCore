package com.gramman75.demoSpringCore.Env;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.core.env.Environment;
/**
 * profile을 적용하기 위해서는 vm option에
 * -Dspring.profiles.active=test
 * 와 같이 profile명을 지정
 * 
 * @Component @Profile("test")와 같이 등록시 Profile을 지정할 수도 있음.
 */
import org.springframework.stereotype.Component;

@Component
public class AppRunnerEnv implements ApplicationRunner {
	
	@Autowired
	ApplicationContext ctx;
	
	@Autowired
	EnvRepository envRepository;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("========= Environment =================");
		
		Environment environment = ctx.getEnvironment();
		System.out.println(Arrays.toString(environment.getActiveProfiles()));
		System.out.println(Arrays.toString(environment.getDefaultProfiles()));
		
		System.out.println("========= Property =================");
		/**
		 * @PropertySource Annotation이용
		 * 동일 key일경우 우선순위가 있음.
		 * VM Option(-Dkey=value)
		 */
		
		System.out.println(environment.getProperty("app.name"));
	}

}
