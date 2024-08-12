package com.demo.service;

import java.util.List;

import com.demo.model.LoginVO;

public interface LogService {


	void save(LoginVO loginVO);
	
	List search();

	void delete(LoginVO loginVO);

}
