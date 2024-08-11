package com.demo.DAO;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.demo.model.CountryVO;

@Repository
@Transactional
public class CountryDAOImpl implements CountryDAO{

	@Autowired
	private SessionFactory sessionFactory;
	
	public void insert(CountryVO countryVO){
		
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(countryVO);
	}
	
	public List search() {

		Session session = sessionFactory.getCurrentSession();
		Query q = session.createQuery("from CountryVO");

		List ls = q.list();
		return ls;
	}

}
