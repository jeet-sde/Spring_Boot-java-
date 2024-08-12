package com.demo.DAO;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.demo.model.RegisterVO;
import com.demo.model.LoginVO;

@Repository
@Transactional
public class loginDAOImpl implements loginDAO {

    @Autowired
    private SessionFactory sessionFactory;

    public void save(LoginVO loginVO) {
    		Session session = sessionFactory.getCurrentSession();
    		session.saveOrUpdate(loginVO);
    		}
    
    public  List search() {

		Session session = sessionFactory.getCurrentSession();
		Query q = session.createQuery("from RegisterVO");
		List ls = (List) q.list();
		return ls;
	}
    
   
	public void delete(LoginVO loginVO){
		Session session = sessionFactory.getCurrentSession();
		session.delete(loginVO);
	}
	
	public List findById(int id) {


		Session session = sessionFactory.openSession();
		Query q = session.createQuery("from LoginVO where id="+id);

		List ls = q.list();
		session.close();

		return ls;
	}



}
