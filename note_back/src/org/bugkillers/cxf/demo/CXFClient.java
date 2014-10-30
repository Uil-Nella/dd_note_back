package org.bugkillers.cxf.demo;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.dd.note.back.cxf.service.HelloWorld;

public class CXFClient {
	public static void main(String[] args) {
		System.out.println("...");
		
		
		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
		factory.setServiceClass(HelloWorld.class);
		factory.setAddress("http://localhost:8080/note_back/WebService/HelloWorld");
		HelloWorld hello = (HelloWorld)factory.create();
		System.out.println(hello.sayHello("lxy"));
		System.exit(0);
	}
}
