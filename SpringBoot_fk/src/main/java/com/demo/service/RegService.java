package com.demo.service;

import java.util.List;

import com.demo.model.RegisterVO;

public interface RegService {

	void save(RegisterVO registerVO);
	
	List search();

	void delete(RegisterVO registerVO);

}
