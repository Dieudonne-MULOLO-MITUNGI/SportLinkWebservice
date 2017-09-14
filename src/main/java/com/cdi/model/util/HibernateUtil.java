package com.cdi.model.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
//import org.hibernate.cfg.AnnotationConfiguration;

public class HibernateUtil {

 
	
	 public static SessionFactory buildSessionFactory() {
		    try {           
		        StandardServiceRegistry standardRegistry = new StandardServiceRegistryBuilder()
		        .configure( "hibernate.cfg.xml" )
		        .build();

		        Metadata metadata = new MetadataSources( standardRegistry )
		        .getMetadataBuilder()
		        .build();

		        return metadata.getSessionFactoryBuilder().build();

		    }catch(Exception e){
		    	e.printStackTrace();
		    }
		    
		    return null;
		    
	 }	    

	
	
	

}