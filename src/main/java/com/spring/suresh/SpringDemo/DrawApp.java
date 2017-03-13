package com.spring.suresh.SpringDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawApp {

	public static void main(String[] args)   {
		// TODO Auto-generated method stub
		//BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
		//Traingle tri = (Traingle) factory.getBean("traingle");
		//tri.draw();
		//new Traingle().draw();
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/suresh/SpringDemo/spring.xml");
		Traingle triangle = (Traingle) context.getBean("traingle");
		triangle.draw();

	}

}
