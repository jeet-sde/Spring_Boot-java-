package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.demo.DAO.RegDAO;
import com.demo.DAO.loginDAO;
import com.demo.model.LoginVO;

@Service
@Transactional

public class LogServiceImpl implements LogService {


	@Autowired
	private loginDAO logindao;
	
	
	public void save(LoginVO loginVO) {
		this.logindao.save(loginVO);
	}
	public List search(){
		 return (List) this.logindao.search();
	}
	public void delete(LoginVO loginVO){
		this.logindao.delete(loginVO);
	}
	
	}
