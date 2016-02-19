package com.manish.javadev.aop;

import org.springframework.aop.ThrowsAdvice;

public class MethodThrow implements ThrowsAdvice {
	public void afterThrowing(Exception e) {
		System.out.println("Exception Thrown Check Your Log");
	}
}