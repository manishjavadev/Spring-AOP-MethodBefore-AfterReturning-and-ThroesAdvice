package com.manish.javadev.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.manish.javadev.services.AccountService;
import com.manish.javadev.services.CustomerService;

public class SpringAOPDemo {

	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext(
				new String[] { "Spring-Context.xml" });

		CustomerService customerService = (CustomerService) appContext
				.getBean("csProxy");

		// Start Operation of Customer Service
		System.out.println("=====Customer Operation Start from Here========");
		System.out.println("===========================");

		customerService.addCustomer();

		System.out.println("===========================");

		// customerService.updateCustomer();
		// System.out.println("===========================");

		try {
			customerService.getCustomer(1);
		} catch (Exception e) {
			System.out
					.println("Sorry! Your Log created by Advice class method");
		}
		// End Operation of Customer Service

		System.out.println("================================================");

		AccountService accountService = (AccountService) appContext
				.getBean("asProxy");

		// Start Operation of Account Service
		System.out.println("======Account Operation Start from here==========");
		System.out.println("===========================");

		accountService.addAccount();

		System.out.println("===========================");

		// accountService.updateAccount();
		// System.out.println("===========================");

		try {
			accountService.getAccount(1);
		} catch (Exception ex) {
			System.out
					.println("Sorry! Your Log created by Advice class method");
		}
	}
}
