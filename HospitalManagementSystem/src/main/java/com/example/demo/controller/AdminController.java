package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/Admin")
@Controller
public class AdminController {
		@RequestMapping("/Home")
	    public String Home(){
	    		return "adminhome";
	    }
		@RequestMapping("/Patient")
	    public String Patient(){
	    		return "Patient";
	    }
	    @RequestMapping("/Doctor")
	    public String Doctor(){
	    		return "Doctor";
	    }
	    @RequestMapping("/AddDoctor")
	    public String AddDoctor(){
	    		return "AddDoctor";
	    }
	    @RequestMapping("/Doctorlist")
	    public String 	Doctorlist(){
	    		return "Doctorlist";
	    }
}
