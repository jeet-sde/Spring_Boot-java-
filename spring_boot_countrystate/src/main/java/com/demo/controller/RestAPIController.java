package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.demo.service.CityService;
import com.demo.service.CountryService;
import com.demo.service.StateService;

@RestController
@CrossOrigin
public class RestAPIController {

	@Autowired
	private CountryService countryService;

	@Autowired
	private StateService stateService;
	
	@Autowired
	private CityService cityService;

	@GetMapping("/country")
	public ResponseEntity getCountry() {
		List countryList = this.countryService.search();
		return new ResponseEntity(countryList, HttpStatus.OK);
	}

	@GetMapping("/stateByCountry/{countryId}")
	public ResponseEntity stateByCountry(@PathVariable int countryId) {
		List countryList = this.stateService.stateByCountry(countryId);
		return new ResponseEntity(countryList, HttpStatus.OK);
	}
	
	@GetMapping("/cityByState/{stateId}")
	public ResponseEntity cityByState(@PathVariable int stateId) {
		List stateList = this.cityService.cityByState(stateId);
		System.out.println(stateList);
		return new ResponseEntity(stateList, HttpStatus.OK);
	}

}
