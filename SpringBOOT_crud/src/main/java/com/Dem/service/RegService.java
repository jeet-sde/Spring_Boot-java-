package com.Dem.service;

import java.util.List;

import com.Dem.model.RegisterVO;

public interface RegService {

	void save(RegisterVO registerVO);

		List search();
	
		void delete(RegisterVO registerVO);
		
	    RegisterVO findById(int id);

	    void update(RegisterVO registerVO);

}
