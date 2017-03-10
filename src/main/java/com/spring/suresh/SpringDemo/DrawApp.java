package com.spring.suresh.SpringDemo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class DrawApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
		Traingle tri = (Traingle) factory.getBean("traingle");
		tri.draw();
		//new Traingle().draw();

	}

}
