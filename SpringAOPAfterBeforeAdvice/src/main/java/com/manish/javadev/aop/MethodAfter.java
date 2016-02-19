package com.manish.javadev.aop;

import java.lang.reflect.Method;
import org.springframework.aop.AfterReturningAdvice;

public class MethodAfter implements AfterReturningAdvice {

	public void afterReturning(Object returnValue, Method method,
			Object[] args, Object target) throws Throwable {
		System.out.println("Method after called");

	}
}