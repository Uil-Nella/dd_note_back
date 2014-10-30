package org.dd.note.back.cxf.service;

import javax.jws.WebParam;
import javax.jws.WebService;

@WebService	
public interface HelloWorld {
	String sayHello(@WebParam(name="text") String text);
}
