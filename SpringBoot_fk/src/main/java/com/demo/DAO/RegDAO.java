package com.demo.DAO;

import java.awt.List;

import com.demo.model.LoginVO;
import com.demo.model.RegisterVO;

public interface RegDAO {

	void save(RegisterVO registerVO);
	
	java.util.List search();
		
	void delete(RegisterVO registerVO);
	
	java.util.List findById(int id);



}
