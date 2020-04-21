package com.example.demo.instructorDetails;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DeleteInstructor {
	public static void main(String[] args) {
		//create session factory
       SessionFactory factory= new Configuration()
    		   .configure("hibernate.cfg.xml")
    		   .addAnnotatedClass(Instructor.class)
    		   .addAnnotatedClass(InstructorDetails.class)
    		   .buildSessionFactory();
       //create sessio
       Session session =factory.getCurrentSession();
       
       try {
            session.beginTransaction();
            int theId=1;
            Instructor tempInstructor= session.get(Instructor.class, theId);
            System.out.println("found instructor"+tempInstructor);
            if (tempInstructor!=null) {
				System.out.println("deleting ");
				session.delete(tempInstructor);
			}
            
    	   
       session.getTransaction().commit();
       }finally {
		factory.close();
	}
	}
}
