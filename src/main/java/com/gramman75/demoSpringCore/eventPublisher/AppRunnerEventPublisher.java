/**
 * Event는 일반 POJO Object
 * ApplicationEventPublisher를 이용하여 Event를 Publish
 * Handler class를 bean으로 등록하고 처리하는 method는
 * @EventListener Annotation을 적용함.
 * 처리되는 handler를 선언부와 동일한 것을 찾는것으로 생각됨.(확인필요)
 * 
 * 기타 스프링이 제공하는 event가 있음.(ContextRefreshEvent, ContextClosedEvent등)
 * 스프링 부트에는 더 추가된 event들이 있음.
 * 
 * Event처리는 동일 Thread에서 순차적으로 처리가 됨.
 * 순서지정을 위해서 @Order Annotation을 적용
 * 
 * 비동기처리를 위해서 Main Class에 @EnableAsync을 적용하고
 * handler에 @Async를 적용하면 멀티 Thread에서 처리가 됨.
 */

package com.gramman75.demoSpringCore.eventPublisher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Component;

@Component
public class AppRunnerEventPublisher implements ApplicationRunner {
	
	@Autowired
	ApplicationEventPublisher eventPublisher;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("============== Event ==============");
		MyEvent event = new MyEvent(100);
		eventPublisher.publishEvent(event);

		
	}

}
