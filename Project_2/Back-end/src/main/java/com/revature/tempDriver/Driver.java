package com.revature.tempDriver;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class Driver {

	static SessionFactory fact = null; 
	
	public static void main(String[] args) 
	{
		Configuration con = new Configuration().configure("hibernate.cnf.xml");
		ServiceRegistry sr = new StandardServiceRegistryBuilder().applySettings(con.getProperties()).build();
		fact = con.buildSessionFactory(sr);
		
	}
	
	
	public static Session getSession()
	{
		return fact.openSession();
	}

}
