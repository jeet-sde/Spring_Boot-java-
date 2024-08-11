package com.demo.service;

import java.util.List;

import com.demo.model.StateVO;
public interface StateService {

	void insert(StateVO stateVO);
	
	List search();

	List stateByCountry(int countryId);

}
