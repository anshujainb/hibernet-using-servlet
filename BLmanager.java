package com.model;



import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.pojo.Pancard;
import com.pojo.User;

public class BLmanager {
	
	SessionFactory sf=new Configuration().configure().buildSessionFactory();
	
	public void Insert(Pancard p){
		Session session=sf.openSession();
		Transaction t=session.beginTransaction();
		session.save(p);
		t.commit();
		session.close();
		
	}

	public Pancard serachByPanNum(String pan) {
		Session session=sf.openSession();
		Criteria c=session.createCriteria(Pancard.class);
		c.add(Restrictions.eq("pnum", pan));
		Pancard p=(Pancard)c.uniqueResult();
		return p;
	}

	public void InsertUser(User u) {
		Session session=sf.openSession();
		Transaction t=session.beginTransaction();
		session.save(u);
		t.commit();
		session.close();
		
	}

}
