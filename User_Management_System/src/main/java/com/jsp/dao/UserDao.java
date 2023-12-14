package com.jsp.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.jsp.entity.User;

public class UserDao 
{
		Configuration cfg=new Configuration().configure().addAnnotatedClass(User.class);
		SessionFactory sf=cfg.buildSessionFactory();
	
		public String userSave(User use)
		{
			Session ses=sf.openSession();
			Transaction t=ses.beginTransaction();
			ses.save(use);
			t.commit();
			ses.close();
			return"User  Data saved Successful";
		}
		
		public User getUserBYId(int userId)
		{
			Session ses=sf.openSession();
//			Transaction t=ses.beginTransaction();
			User u = ses.get(User.class, userId);
			System.out.println();
			return u;
		}
		
}
