package com.prototype;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PrototypeMain {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		
		PrototypeBean pb = (PrototypeBean) context.getBean("prototypeBean");
		pb.setMessage("Gayathri");
		pb.getMessage();
		
		PrototypeBean pb2 = (PrototypeBean) context.getBean("prototypeBean");
		pb2.getMessage();
		
	}

}
