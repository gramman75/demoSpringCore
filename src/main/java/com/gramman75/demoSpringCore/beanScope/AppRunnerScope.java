/**
 * bean의 등록은 기본이 singleton 
 * @Scope을 이용하여 Prototype scope로 등록.
 */

package com.gramman75.demoSpringCore.beanScope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class AppRunnerScope implements ApplicationRunner {
	
	@Autowired
	Single single;
	
	@Autowired
	Proto proto;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("=========== Scope ===============");
		System.out.println(proto);
		
		/**
		 *  proto가 prototype scope이기 때문에 모두 다른 proto가 
		 *  생성될 것이라고 생각하지만 singleton안에서 생성된 prototype scope bean은 
		 *  새로 생성되지 않음.
		 *  매번 새로 생성을 하려면 proxyMode 옵션 사용.
		 */
		System.out.println(single.getProto());
		System.out.println(single.getProto());
		System.out.println(single.getProto());
		
		
		
		
	}

}
