package com.example.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.demo.accountdao.AccountDAO;
import com.example.demo.aspect.DemoConfig;

public class maindemoapp {
public static void main(String[] args) {
	AnnotationConfigApplicationContext context =new AnnotationConfigApplicationContext(DemoConfig.class);
	AccountDAO theAccountDAO=context.getBean("accountDAO", AccountDAO.class);
theAccountDAO.addAccount();
context.close();
}
}
