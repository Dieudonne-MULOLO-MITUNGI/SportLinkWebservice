package com.cdi.exec;

import javax.xml.ws.Endpoint;

import com.cdi.model.dao.speci.DaoLieu;
import com.cdi.model.dao.speci.DaoMachine;
import com.cdi.model.dao.speci.DaoResponsable;
import com.cdi.model.dao.speci.DaoUtilisation;

/**
 * Hello world!
 *
 */
public class AppManyWS 
{
    public static void main( String[] args )
    

    {
    	

    	Endpoint ep =Endpoint.publish("http://192.168.5.105:8888/ws/daoLieu", new DaoLieu());
        System.out.println( "WS = "  + ep.isPublished());
        
        ep =Endpoint.publish("http://192.168.5.105:8888/ws/daoMachine", new DaoMachine());
        System.out.println( "WS = "  + ep.isPublished());
        
        ep =Endpoint.publish("http://192.168.5.105:8888/ws/daoResponsable", new DaoResponsable());
        System.out.println( "WS = "  + ep.isPublished());
        
        ep =Endpoint.publish("http://192.168.5.105:8888/ws/daoUtilisation", new DaoUtilisation());
        System.out.println( "WS = "  + ep.isPublished());
    }
}
