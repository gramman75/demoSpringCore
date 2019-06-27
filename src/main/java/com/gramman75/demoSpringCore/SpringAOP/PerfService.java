package com.gramman75.demoSpringCore.SpringAOP;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class PerfService {
	
	@Around("@annotation(PerfAnnotation)")
	public Object logPerf(ProceedingJoinPoint pjp) throws Throwable {
		long begin = System.currentTimeMillis();
		Object retVal = pjp.proceed();
		System.out.println(System.currentTimeMillis() - begin);
		return retVal;
	}

}
