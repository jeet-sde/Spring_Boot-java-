package com.Dem.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.Dem.DAO.RegDAO;
import com.Dem.model.RegisterVO;
import com.Dem.service.RegService;

@Controller
public class RegController {

	@Autowired
	private RegService service;
	
	@Autowired RegDAO RegDAO;

	@GetMapping("/")
	public ModelAndView load() {
		return new ModelAndView("registration", "RegisterVO", new RegisterVO());
	}

	@PostMapping("insert")
	public ModelAndView insert(@ModelAttribute RegisterVO registerVO) {
		this.service.save(registerVO);
		return new ModelAndView("redirect:/");
	}
	
	@GetMapping("search")
	public ModelAndView Search() {

		List searchList = RegDAO.search();
		return new ModelAndView("search", "List", searchList);

	}
	
	@GetMapping("delete")
	public ModelAndView delete(@ModelAttribute RegisterVO registerVO, @RequestParam int id){
		registerVO.setId(id);
		this.service.delete(registerVO);
		
		return new ModelAndView("redirect:search");
	}
	@GetMapping("edit")
	public ModelAndView edit(@RequestParam int id) {
	    RegisterVO registerVO = this.service.findById(id);
	    ModelAndView modelAndView = new ModelAndView("edit");
	    modelAndView.addObject("RegisterVO", registerVO);
	    return modelAndView;
	}
	@PostMapping("update")
	public ModelAndView update(@ModelAttribute RegisterVO registerVO) {
	    this.service.update(registerVO);
	    return new ModelAndView("redirect:/search");
	}


	
	}
