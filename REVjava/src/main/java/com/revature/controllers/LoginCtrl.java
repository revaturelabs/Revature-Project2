package com.revature.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.revature.beans.Credentials;
import com.revature.beans.User;
import com.revature.services.AuthServiceImp;

@RestController
public class LoginCtrl {
	
	@Autowired
	private AuthServiceImp authService;
	
	@CrossOrigin(origins="http://localhost:4200")
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String loginGet(HttpSession sess){
		System.out.println("inside loginGet()");
		if (sess.getAttribute("user") != null){
			return "home";
		}
		return "login";
	}
	
	@CrossOrigin(origins="http://localhost:4200")
	@RequestMapping(value="/login", method=RequestMethod.POST, consumes= {"application/json"})
	public String loginPost(@Valid Credentials cred, BindingResult bindingResult, ModelMap modelMap, HttpSession sess){
		
		System.out.println("inside loginPost");
		User u = authService.validate(cred);
		
		if (bindingResult.hasErrors()){
			modelMap.addAttribute("errorMessage", bindingResult.getAllErrors().get(0).getDefaultMessage());
			return "login";
		}
		
		if(u != null){
			sess.setAttribute("user", u);
			return "home";
		}
		
		modelMap.addAttribute("errorMessage", "Username or password incorrect");
		
		return "login";
	}
	
	@RequestMapping(value="/login", method=RequestMethod.OPTIONS)
	public void options() {
		
	}

}