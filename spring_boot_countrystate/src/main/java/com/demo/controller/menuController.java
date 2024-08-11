package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.demo.DAO.CityDAO;
import com.demo.DAO.CountryDAO;
import com.demo.DAO.StateDAO;
import com.demo.model.CountryVO;
import com.demo.model.StateVO;
import com.demo.service.CityService;
import com.demo.service.CountryService;
import com.demo.service.StateService;
import com.demo.model.CityVO;


@Controller
public class menuController {

	@Autowired
	CountryDAO countryDAO;

	@Autowired
	StateDAO stateDAO;
	
	@Autowired
	CityDAO cityDAO;
	
	@Autowired
	StateService stateService;
	
	@Autowired
	CityService cityService;
	
	@Autowired
	CountryService countryService;
	
	@GetMapping("/")
	public ModelAndView menu() {
		return new ModelAndView("index");
	}
	
	@GetMapping("load_country")
	public ModelAndView load_country() {
		return new ModelAndView("AddCountry","CountryVO",new CountryVO());
	}
	
	@PostMapping("add_country")
	public ModelAndView insert_country(@ModelAttribute CountryVO countryVO) {

		countryService.insert(countryVO);
		return new ModelAndView("redirect:/view_country.html");
	}
	
	@GetMapping("view_country")
	public ModelAndView Country_Search() {

		List searchList = countryService.search();
		return new ModelAndView("ViewCountry", "SearchList", searchList);

	}

	@GetMapping("load_state")
	public ModelAndView load_state() {
		
		List searchList = countryService.search();
		return new ModelAndView("AddState", "StateVO", new StateVO()).addObject("searchList", searchList);
	}
	
	
	@PostMapping("add_state")
	public ModelAndView insert_state(@ModelAttribute StateVO stateVO) {

		stateService.insert(stateVO);
		return new ModelAndView("redirect:/view_state.html");
	}
	
	@GetMapping("view_state")
	public ModelAndView State_Search() {

		List searchList = stateService.search();
		return new ModelAndView("ViewState", "SearchList", searchList);

	}
	
	@RequestMapping(value = "load_city", method = RequestMethod.GET)
	public ModelAndView City_Load() {

		List countryList = countryService.search();
		List stateList = stateService.search();
		return new ModelAndView("AddCity", "CityVO", new CityVO()).addObject("stateList", stateList).addObject("countryList", countryList);
	}

	@RequestMapping(value = "add_city", method = RequestMethod.POST)
	public ModelAndView City_Add(@ModelAttribute CityVO cityVO) {

		cityService.insert(cityVO);
		return new ModelAndView("redirect:/view_city.html");
	}

	@RequestMapping(value = "view_city", method = RequestMethod.GET)
	public ModelAndView City_Search() {

		List searchList = cityService.search();
		return new ModelAndView("ViewCity", "SearchList", searchList);

	}
}
