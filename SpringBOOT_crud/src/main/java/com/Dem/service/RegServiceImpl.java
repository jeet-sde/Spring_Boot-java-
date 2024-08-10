package com.Dem.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.Dem.DAO.RegDAO;
import com.Dem.model.RegisterVO;

@Service
@Transactional
public class RegServiceImpl implements RegService {

	@Autowired
	private RegDAO dao;

	public void save(RegisterVO registerVO) {
		this.dao.save(registerVO);
	}

	public List search(){
		 return (List) this.dao.search();
	}
	
	
	public void delete(RegisterVO registerVO){
		this.dao.delete(registerVO);
	}

	   
	    public void update(RegisterVO registerVO) {
	    	this.dao.update(registerVO);
	    }
		
		public RegisterVO findById(int id) {
		    return this.dao.findById(id);
		}

		


	
		
}
