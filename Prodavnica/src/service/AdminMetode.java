package service;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class AdminMetode {
	private SessionFactory sf = new Configuration()
			.configure()
			.buildSessionFactory();
}
