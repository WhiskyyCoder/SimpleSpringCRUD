package io.github.gacus007.DAOs;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import io.github.gacus007.Models.Customer;
//must add to config spring proxy-target-class="true"
@Repository
public class DAOCustomer implements ICustomer{

	@Autowired
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public DAOCustomer() {

	}
	
	@Transactional
	public List<Customer> getCustomers() {
		Session session = getSessionFactory().getCurrentSession();
		List<Customer> customers = session.createQuery("from Customer", Customer.class).getResultList();

		return customers;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void save(Customer object) {
		// TODO Auto-generated method stub

	}

	public void delete(Customer object) {
		// TODO Auto-generated method stub

	}

	public void update(Customer object) {
		// TODO Auto-generated method stub

	}

	public void read(Customer object) {
		// TODO Auto-generated method stub

	}

}
