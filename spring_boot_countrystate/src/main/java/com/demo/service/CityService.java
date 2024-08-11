package com.demo.service;

import java.util.List;

import com.demo.model.CityVO;

public interface CityService {

	void insert(CityVO cityVO);
	
	List search();
	
	List cityByState(int stateId);

}
