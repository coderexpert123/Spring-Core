package com.learn.nishant.com.learn.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.learn.nishant.com.learn.nishant.Student;

public class main {

	public static void main() {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/learn/nishant/com/learn/ci/config.xml");
		ci ci = (ci) context.getBean("ci");
		System.out.println(ci);
		
	}
}
