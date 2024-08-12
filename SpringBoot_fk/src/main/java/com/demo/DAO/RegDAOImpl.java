package com.demo.DAO;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.demo.model.RegisterVO;

@Repository
@Transactional
public class RegDAOImpl implements RegDAO{
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public void save(RegisterVO registerVO){
	Session session = sessionFactory.getCurrentSession();
	session.saveOrUpdate(registerVO);
	}
	public  List search() {

		Session session = sessionFactory.getCurrentSession();
		Query q = session.createQuery("from RegisterVO");
		List ls = (List) q.list();
		return ls;
	}
	public void delete(RegisterVO registerVO){
		Session session = sessionFactory.getCurrentSession();
		session.delete(registerVO);
	}
	public List findById(int id) {


		Session session = sessionFactory.openSession();
		Query q = session.createQuery("from RegisterVO where id="+id);

		List ls = q.list();
		session.close();

		return ls;
	}



}
