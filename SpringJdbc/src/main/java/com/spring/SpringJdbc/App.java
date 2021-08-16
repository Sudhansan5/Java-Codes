package com.spring.SpringJdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("Spring.xml");

		StudentDao dao = (StudentDao) ctx.getBean("edao");
		System.out.println("Number of rows in table: " + dao.count());
		dao.addStudent(10, "Harry");
		System.out.println("Number of rows in table: " + dao.count());
	}
}
