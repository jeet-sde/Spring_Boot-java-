package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.demo.DAO.loginDAO;
import com.demo.DAO.RegDAO;
import com.demo.model.LoginVO;
import com.demo.model.RegisterVO;
import com.demo.service.LogService;
import com.demo.service.RegService;

@Controller
public class RegController {

	@Autowired
	private RegService service;
	@Autowired
	 private LogService logservice;

	
	@Autowired RegDAO RegDAO;
	@Autowired loginDAO loginDAO;
	

	

	@GetMapping("/")
	public ModelAndView load(){
		return new ModelAndView("registration", "RegisterVO", new RegisterVO());

	}
	
	@PostMapping("insert")
	public ModelAndView insert(@ModelAttribute RegisterVO registerVO) {
	
		LoginVO loginvo = registerVO.getLoginVO();
		this.logservice.save(loginvo);
		this.service.save(registerVO);	
		return new ModelAndView("redirect:/");
	}
	@GetMapping("search")
	public ModelAndView Search() {
		List searchList1 = RegDAO.search();
		
		return new ModelAndView("search", "List", searchList1);

	}
		
		
	@GetMapping("delete")
	public ModelAndView Delete(@RequestParam int id) {

		List ls= RegDAO.findById(id);
		RegisterVO r= (RegisterVO)ls.get(0);
		
		LoginVO v= r.getLoginVO();
		
		RegDAO.delete(r);
		loginDAO.delete(v);

		return new ModelAndView("redirect:/search.html");

	}
	
	
	
	@GetMapping("edit")
	public ModelAndView edit(@ModelAttribute RegisterVO registerVO, @RequestParam int id){
		
		List ls = RegDAO.findById(id);
		return new ModelAndView("registration", "RegisterVO",ls.get(0));
	}

}

