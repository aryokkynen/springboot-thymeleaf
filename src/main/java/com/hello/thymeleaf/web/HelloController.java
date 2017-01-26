package com.hello.thymeleaf.web;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.hello.thymeleaf.domain.Friend;
import com.hello.thymeleaf.service.StudentRepository;
import com.hello.thymeleaf.utils.FriendUtils;

@Controller
public class HelloController {

	@RequestMapping("/hello")
	public String greeting(@RequestParam(value = "name") String name,
			@RequestParam(value = "age") int age, Model model) {
		model.addAttribute("name", name);
		model.addAttribute("age", age);
		System.out.println(name);
		return "hello";
	}

	@RequestMapping(value = "/hello2", method = RequestMethod.GET)
	public String students(Model model) {
		String greeting = "Welcome to duckburg!";
		model.addAttribute("greeting", greeting);
		model.addAttribute("students", StudentRepository.populateStudentList());
		return "hello2";
	}

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String friendList(Model model) {
		List<Friend> friends = FriendUtils.buildFriends();

		model.addAttribute("friend", new Friend());
		model.addAttribute("friends", friends);
		return "index";
	}

	@RequestMapping(value = "/saveFriend", method = RequestMethod.POST)
	public String saveStudent(@ModelAttribute Friend friend,
			BindingResult errors, Model model) {

		List<Friend> friends = FriendUtils.buildFriends();
		friends.add(friend);
		model.addAttribute("friends", friends);
		System.out.println(friends);

		return "redirect:index";
	}

}