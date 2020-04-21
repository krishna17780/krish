package com.example.demo.instructorDetails;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class createInstructoeDemo {
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
            //create a student object 
    	   Instructor tempInstructor = new Instructor("krishna", "lastname", "k@gmail.com");
    	   InstructorDetails tempInstructorDetails= new InstructorDetails("ravi.you.com", "playing games");
    	   tempInstructor.setInstructorDetails(tempInstructorDetails);
    	   //start a traction
    	   session.beginTransaction();
    	   //save the student object
    	   System.out.println("saving the instructor.......");
    	   session.save(tempInstructor);
    	   //commit transaction
       session.getTransaction().commit();
       }finally {
		factory.close();
	}
	}
}
