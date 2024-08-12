package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.demo.model.RegisterVO;
import com.demo.DAO.RegDAO;

@Service
@Transactional
public class RegServiceImpl implements RegService{

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
	
}
