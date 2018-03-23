package com.java;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class data {
	public static void main(String[] args) {  
        
		 Configuration cf=new Configuration(); 
		 cf.configure();
	       
		 SessionFactory factory=cf.buildSessionFactory();
		 
	    Session session=factory.openSession();  
	     
	    Transaction t=session.beginTransaction();  
	          
	    employee e=new employee();  
	  
	    e.setUsername("mahesh");  
	    e.setPassword("kanth");  
	      
	    session.persist(e);  
	      
	    t.commit();  
	    session.close();  
	      
	    System.out.println("successfully saved");  
	      
	}  
}
