package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.demo.DAO.CountryDAO;
import com.demo.model.CountryVO;

@Service
@Transactional
public class CountryServiceImpl implements CountryService{
	
	@Autowired
	private CountryDAO countryDAO;
	
	public void insert(CountryVO countryVO){
		this.countryDAO.insert(countryVO);
	}
	
	public List search(){
		return this.countryDAO.search();
	}
}
