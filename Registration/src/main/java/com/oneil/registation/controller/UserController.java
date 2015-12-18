package com.oneil.registation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.oneil.registation.config.entity.User;
import com.oneil.registation.repository.UserRepository;
@Controller
public class UserController {
	private final UserRepository userRepository;
	@Autowired
	 public UserController(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}

@RequestMapping( value="/home" ,method=RequestMethod.GET)
	  public String greetingForm(Model model) {
	      model.addAttribute("user", new User());
	      return "registration";
	  }
	
	 @RequestMapping(value = "/users",method = RequestMethod.POST)
		    public String createSubscription(@ModelAttribute User user, Model model){
	        System.out.println("user.getFirstName()"+user.getFirstName());
	      
	        userRepository.save(user);
	 
	       return "regResults";
	    }

}
