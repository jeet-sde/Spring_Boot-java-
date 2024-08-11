package com.demo.DAO;

import java.util.List;

import com.demo.model.CountryVO;

public interface CountryDAO {

	void insert(CountryVO countryVO);
	
	List search();

}
