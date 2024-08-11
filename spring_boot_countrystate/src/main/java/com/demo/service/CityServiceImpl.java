package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.demo.DAO.CityDAO;
import com.demo.model.CityVO;

@Service
@Transactional
public class CityServiceImpl implements CityService{
	
	@Autowired
	private CityDAO cityDAO;
	
	public void insert(CityVO cityVO){
		this.cityDAO.insert(cityVO);
	}
	
	public List search(){
		return this.cityDAO.search();
	}
	
	public List cityByState(int stateId) {
		return this.cityDAO.cityByState(stateId);
	}
}
