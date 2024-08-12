package com.demo.DAO;

import java.util.List;

import com.demo.model.LoginVO;

public interface loginDAO {

	void save(LoginVO loginVO);
	
	List search();
	
	void delete(LoginVO loginVO);
	List findById(int id);

}
