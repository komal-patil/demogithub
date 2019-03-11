package com.Utility;

import java.util.HashMap;
import java.util.Map;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Environment;

import com.model.Student;

public class HibernateUtil {

	
	private static StandardServiceRegistry registry=null;
	private static SessionFactory sessionfactory;
	
	public static SessionFactory getsessionfactory()
	{
		Map<String, Object> settings=new HashMap<>();
		settings.put(Environment.DRIVER, "com.mysql.jdbc.Driver");
		settings.put(Environment.URL,"jdbc:mysql://localhost:3306/hibernate");
		settings.put(Environment.USER, "root");
		settings.put(Environment.PASS, "root");
		settings.put(Environment.DIALECT,"org.hibernate.dialect.MySQLDialect");
		settings.put(Environment.HBM2DDL_AUTO, "update");    //update,create,create-drop,validate
		settings.put(Environment.SHOW_SQL, "true");
		settings.put(Environment.FORMAT_SQL, "true");
		
		
		registry=new StandardServiceRegistryBuilder().applySettings(settings).build();
		
		MetadataSources mds=new MetadataSources(registry).addAnnotatedClass(Student.class);
		Metadata md=mds.getMetadataBuilder().build();
		sessionfactory=md.getSessionFactoryBuilder().build();
		
		
		
		return sessionfactory;
		
		
		
	}
		
		
	
	

}
