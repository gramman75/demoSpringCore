package com.gramman75.demoSpringCore.beanScope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Single {
	
	@Autowired
	Proto proto;
	
	public Proto getProto() {
		return proto;
	}

}
