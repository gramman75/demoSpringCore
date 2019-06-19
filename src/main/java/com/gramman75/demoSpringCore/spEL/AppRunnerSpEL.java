/**
 * #{} 안에 표현식을 사용
 * ${} 은 application.properties안의 값을 가져옴.
 * #{} 안에는 ${}사용할 수 있음. 반대는 안됨.
 */
package com.gramman75.demoSpringCore.spEL;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.stereotype.Component;

@Component
public class AppRunnerSpEL implements ApplicationRunner{

	/* 표현식 */
	@Value("#{1+1}")
	int value;
	
	@Value("#{'hello' + 'world'}")
	String greeting;
	
	/* properties data */
	@Value("#{${my.value} eq 100}")
	boolean isMyValue100;
	
	/* Bean Data */
	@Value("#{sample.value}")
	int sampleData;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("=========== SpEL =================");
		System.out.println("value : "+value);
		System.out.println("greeting: "+ greeting);
		System.out.println("isMyValue100 : " + isMyValue100);
		System.out.println("sampleData : " + sampleData);
		
		ExpressionParser parser = new SpelExpressionParser();
		Expression expression =   parser.parseExpression("1+1");
		Integer v = expression.getValue(Integer.class);
		
		System.out.println("SpelExpressionParser : "+ v);
	}

}
