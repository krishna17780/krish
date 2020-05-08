package com.example.demo.instructorDetailsBiDir;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class GetInstructorDemo {
	public static void main(String[] args) {
		// create session factory
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetails.class).buildSessionFactory();
		// create sessio
		Session session = factory.getCurrentSession();

		try {
			session.beginTransaction();
			int theId1=2;
			InstructorDetails temInstructorDetails= session.get(InstructorDetails.class, theId1);
					System.out.println(temInstructorDetails);
			System.out.println("the associated instructor"+temInstructorDetails.getInstructor());
			session.getTransaction().commit();
		} finally {
			session.close();
			factory.close();
		}
	}
}
