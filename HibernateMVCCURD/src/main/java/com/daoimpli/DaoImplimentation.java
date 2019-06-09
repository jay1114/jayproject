package com.daoimpli;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.dao.Dao;
import com.model.Login;
import com.model.User;
import com.util.HibernateUtil;

public class DaoImplimentation implements Dao {


	// Session session=sf.openSession();
	// CriteriaBuilder crb=session.getCriteriaBuilder();
	public int addUser(User e) {
		 SessionFactory sf = HibernateUtil.getSessionFactory();

		Session session = sf.openSession();
		CriteriaBuilder crb = session.getCriteriaBuilder();

		System.out.println("Start Dao addUser");
		session.save(e);
		System.out.println("End Dao addUser");

		return 0;
	}

	public void deleteUser(int id) {
		System.out.println("Start Dao deleteUser");
		 SessionFactory sf = HibernateUtil.getSessionFactory();

		Session session = sf.openSession();
		CriteriaBuilder crb = session.getCriteriaBuilder();
		Transaction t = session.beginTransaction();
		User user = session.get(User.class, id);
		session.delete(user);
		t.commit();
		System.out.println("End Dao deleteUser");
	}

	public 	List<User> updateUser(User e) {
		System.out.println("userupdate start");
		System.out.println(e.getId());
		 SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		CriteriaBuilder crb = session.getCriteriaBuilder();
		Transaction t= session.beginTransaction();
		session.update(e);
		t.commit();
		System.out.println("userupdate end");
		return this.display();

	}

	public User editUser(int id) {
		 SessionFactory sf = HibernateUtil.getSessionFactory();

		Session session = sf.openSession();
		CriteriaBuilder crb = session.getCriteriaBuilder();

		CriteriaQuery<User> query = crb.createQuery(User.class);
		Root<User> root = query.from(User.class);
		query.select(root).where(crb.equal(root.get("id"), id));
		Query<User> q = session.createQuery(query);
		User u = q.getSingleResult();
		return u;
	}

	public List<User> display() {
		 SessionFactory sf = HibernateUtil.getSessionFactory();

		Session session=sf.openSession();
		Transaction t = session.beginTransaction();
		CriteriaBuilder builder = session.getCriteriaBuilder();
		CriteriaQuery<User> query = builder.createQuery(User.class);
		Root<User> root = query.from(User.class);
		query.select(root);
		
		Query<User> q = session.createQuery(query);
		
		List<User> elist = q.getResultList();
		
		return elist;
	}

}
