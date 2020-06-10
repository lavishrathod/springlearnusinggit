package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.Repository.ARepo;
import com.example.demo.model.Alien;

@Controller
@ResponseBody
public class HomeController {
	@Autowired	
	ARepo repo;
	
	@RequestMapping( path = "lavish")
		public String aaa()
		{	
			return "home";
		}

	@RequestMapping("addalien")
	public String home(Alien alien){
		repo.save(alien);
		return "home.jsp";
	}

	
	@Controller
	public class HelloController {
	    @GetMapping({"/", "/hello"})
	    public String hello(Model model, @RequestParam(value="name", required=false, defaultValue="World") String name) {
	        model.addAttribute("name", name);
	        return "hello";
	    }
	
	
}
}	
	
	
	