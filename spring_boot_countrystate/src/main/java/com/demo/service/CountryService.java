package com.demo.service;

import java.util.List;

import com.demo.model.CountryVO;

public interface CountryService {

	void insert(CountryVO countryVO);
	
	List search();

}
