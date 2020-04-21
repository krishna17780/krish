package com.example.demo.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Customer;

@Repository
public class customerDAoimp implements CustomerDAO {
	
	@Autowired
	private SessionFactory sessionfactory;

	@Transactional
	public List<Customer> getCustomer() {
		// TODO Auto-generated method stub
		//get the current hibernate session
	Session	currentSession=sessionfactory.getCurrentSession();
	//create a query

	Query<Customer> theQuery=currentSession.createQuery("from Customer", Customer.class);
		// execute and get result list
	List<Customer> customers= theQuery.getResultList();
		//return the results
		return customers;
	}

}
