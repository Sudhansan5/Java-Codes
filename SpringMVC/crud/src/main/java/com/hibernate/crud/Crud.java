package com.hibernate.crud;

import java.util.List;

import org.hibernate.query.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Crud {

	private SessionFactory factory = new Configuration().configure().buildSessionFactory();
	private Session session = factory.openSession();

	public void sessionClose() {
		session.close();
		factory.close();
	}

	public void create(int id, String name, String city) {
		Employee emp = new Employee(id, name, city);
		System.out.println(emp);

		Transaction tx = session.beginTransaction();
		session.save(emp);
		tx.commit();
	}

	public void read() {
		String query = "from Employee";
		Query q = session.createQuery(query);
		List<Employee> li = q.list();
		for (Employee emp : li) {
			System.out.println(emp.getName() + ": " + emp.getCity());
		}

	}

	public void update(String city, String name) {
		Transaction tx = session.beginTransaction();
		String query = "update Employee set city=:city where name=:name";
		Query q = session.createQuery(query);
		q.setParameter("city", city);
		q.setParameter("name", name);
		int count = q.executeUpdate();
		System.out.println(count + " rows affected");
		tx.commit();
	}

	public void delete(String city) {
		Transaction tx = session.beginTransaction();
		String query = "delete from Employee where city=:city";
		Query q = session.createQuery(query);
		q.setParameter("city", city);
		int count = q.executeUpdate();
		System.out.println(count);
		tx.commit();
	}

}
