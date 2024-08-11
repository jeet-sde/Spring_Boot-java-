package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.demo.DAO.StateDAO;
import com.demo.model.StateVO;

@Repository
@Transactional
public class StateServiceImpl implements StateService{

	@Autowired
	private StateDAO stateDAO;
	
	public void insert(StateVO stateVO){
		this.stateDAO.insert(stateVO);
	}
	
	public List search(){
		return this.stateDAO.search();
	}

	public List stateByCountry(int countryId) {
		return this.stateDAO.stateByCountry(countryId);
	}

}
