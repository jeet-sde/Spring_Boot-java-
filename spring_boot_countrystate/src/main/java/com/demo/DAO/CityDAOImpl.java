package com.demo.DAO;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.demo.model.CityVO;

@Repository
@Transactional
public class CityDAOImpl implements CityDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public void insert(CityVO cityVO) {

		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(cityVO);
	}

	public List search() {

		Session session = sessionFactory.getCurrentSession();
		Query q = session.createQuery("from CityVO");

		List ls = q.list();
		return ls;
	}

	public List cityByState(int stateId) {
		Session session = sessionFactory.getCurrentSession();
		System.out.println(stateId);
		Query q = session.createQuery("from CityVO where stateVO = " + stateId);

		
		System.out.println(q);
		
		List ls = q.list();

		System.out.println(ls);
		
		return ls;
	}
	
}
