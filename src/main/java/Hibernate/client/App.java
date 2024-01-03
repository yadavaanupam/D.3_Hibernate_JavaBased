package Hibernate.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import Hibernate.entity.Employee;
import Hibernate.util.HibernateConfig;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee vikas=new Employee();
		// vikas.setId(1);
		vikas.setName("Piyush");
		vikas.setGender("Male");
		vikas.setSalary(35000);
		
		SessionFactory sf =HibernateConfig.getSessionFactory();
		Session session= sf.openSession();
		Transaction tx = session.beginTransaction();
		
		// it is used for print one value from a table.
		
		 Employee e = session.get(Employee.class,2);
		System.out.println(e);
		
		session.save(vikas);
		tx.commit();

	}

}
