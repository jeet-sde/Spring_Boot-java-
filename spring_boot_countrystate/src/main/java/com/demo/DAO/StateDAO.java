package com.demo.DAO;

import java.util.List;

import com.demo.model.StateVO;

public interface StateDAO {

	void insert(StateVO stateVO);
	
	List search();

	List stateByCountry(int countryId);

}
