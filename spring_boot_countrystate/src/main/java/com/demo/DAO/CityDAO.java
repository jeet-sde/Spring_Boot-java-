package com.demo.DAO;

import java.util.List;

import com.demo.model.CityVO;

public interface CityDAO {

	void insert(CityVO cityVO);
	
	List search();
	
	List cityByState(int stateId);

}
