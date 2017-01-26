package com.hello.thymeleaf.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.hello.thymeleaf.domain.Friend;
import com.hello.thymeleaf.service.FriendRepository;
import com.hello.thymeleaf.service.StudentRepository;

@Controller
public class HelloController {

	@RequestMapping("/hello")
	public String greeting(@RequestParam(value = "name") String name,
			@RequestParam(value = "age") int age,
			Model model) {
		model.addAttribute("name", name);
		model.addAttribute("age", age);
		System.out.println(name);
		return "hello";
	}
	
	@RequestMapping(value = "/hello2", method=RequestMethod.GET)
	public String students(Model model) {
		String greeting = "Welcome to duckburg!";
		model.addAttribute("greeting", greeting);
		model.addAttribute("students", StudentRepository.findAll());
		return "hello2";
	}
	
    @RequestMapping(value="/index", method=RequestMethod.GET)
    public String friendList(Model model) {
   
    	
    	//model.addAttribute("friends", FriendRepository.findAll());
    	 model.addAttribute("friends", new Friend());
        return "index";
    }

    @RequestMapping(value="/index", method=RequestMethod.POST)
    public String friendSubmit(@ModelAttribute Friend friend, Model model) {
    	
    	
    	
        return "index";
        
        
        
        
    }

}