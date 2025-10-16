package util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import model.Complaint;
import model.Resident;

public class HibernateUtil {
	static SessionFactory sessionFactory = null;
	public static SessionFactory getConnection() {
		if(sessionFactory==null) {
			Configuration cfg = new Configuration();
			cfg.configure("hibernate.cfg.xml");
			cfg.addAnnotatedClass(Resident.class);
			cfg.addAnnotatedClass(Complaint.class);

			sessionFactory = cfg.buildSessionFactory();
		}
		return sessionFactory;
	}
}
