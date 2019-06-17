/**
 * message관리 파일명칭은
 * default : messages.properties
 * 언어별: messages_ko_ko.properties
 * 
 * 별도 설정을 하려면 main application에서 별도 bean을 등록하고 설정함.
 */

package com.gramman75.demoSpringCore.message;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

@Component
public class AppRunnerMessage implements ApplicationRunner {

	@Autowired
	MessageSource messageSource;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("========= Message =================");
//		while(true) {
			String msg = messageSource.getMessage("greeting", new String[] {"kim"}, Locale.KOREA);
			System.out.println(msg);
			Thread.sleep(3000);
//		}
		
	}

}
