package com.Dem.DAO;

import java.util.List;

import com.Dem.model.RegisterVO;

public interface RegDAO {

	void save(RegisterVO registerVO);
	
	List search();
	
	void delete(RegisterVO registerVO);
	
	RegisterVO findById(int id);

    void update(RegisterVO registerVO);
   

}
