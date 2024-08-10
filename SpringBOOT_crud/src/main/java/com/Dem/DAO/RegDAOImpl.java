package com.Dem.DAO;


import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Dem.model.RegisterVO;

@Repository
@Transactional
public class RegDAOImpl implements RegDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public void save(RegisterVO registerVO) {
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
	
	 public RegisterVO findById(int id) {
	        Session session = sessionFactory.getCurrentSession();
	        return session.get(RegisterVO.class, id);
	    }

	  
	    public void update(RegisterVO registerVO) {
	        Session session = sessionFactory.getCurrentSession();
	        session.update(registerVO);
	    }

	}