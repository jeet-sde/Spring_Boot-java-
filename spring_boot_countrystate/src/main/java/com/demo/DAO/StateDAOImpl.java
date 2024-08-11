package com.demo.DAO;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.demo.model.StateVO;

@Repository
@Transactional
public class StateDAOImpl implements StateDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	public void insert(StateVO stateVO){
	
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(stateVO);
	}
	
	public List search(){
		
		Session session = sessionFactory.getCurrentSession();
		Query q = session.createQuery("from StateVO");

		List ls = q.list();
		return ls;
	}

	public List stateByCountry(int countryId) {
		Session session = sessionFactory.getCurrentSession();
		Query q = session.createQuery("from StateVO where countryVO = " + countryId);

		List ls = q.list();
		return ls;	}
}
