package com.gramman75.demoSpringCore.spEL;

import org.springframework.stereotype.Component;

@Component
public class Sample {
	private int value = 11;

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	

}
