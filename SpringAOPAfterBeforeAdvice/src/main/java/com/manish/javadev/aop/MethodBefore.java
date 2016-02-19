package com.manish.javadev.aop;

import java.lang.reflect.Method;
import org.springframework.aop.MethodBeforeAdvice;

public class MethodBefore implements MethodBeforeAdvice {

	public void before(Method method, Object[] args, Object target)
			throws Throwable {
		System.out.println("Method before called");

	}
}