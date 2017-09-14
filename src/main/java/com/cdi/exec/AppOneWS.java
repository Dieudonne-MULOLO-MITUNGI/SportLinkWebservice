package com.cdi.exec;

import javax.xml.ws.Endpoint;

import com.cdi.model.webService.DaoWebService;

/**
 * Hello world!
 *
 */
public class AppOneWS {
	
	public static void main(String[] args){

		Endpoint ep = Endpoint.publish("http://192.168.23.109:8888/ws/dao", new DaoWebService());
		System.out.println("WS = " + ep.isPublished());

	}
}
