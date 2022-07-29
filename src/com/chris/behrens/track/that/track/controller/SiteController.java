package com.chris.behrens.track.that.track.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.chris.behrens.track.that.track.entity.User;
import com.chris.behrens.track.that.track.entity.UserRecord;
import com.chris.behrens.track.that.track.service.UserService;




// Controller annotation tells us that this class is accessible over the Internet
@Controller
// RequestMapping annotation tells us the path that needs to be accessed to run this controller
@RequestMapping("")
public class SiteController {
	// need to inject our customer service
		@Autowired
		private UserService userService;
		
		@GetMapping("/list")
		public String listUsers(Model theModel) {
			
			// get customers from the service
			List<User> theUsers = userService.getUsers();
					
			// add the customers to the model
			theModel.addAttribute("users", theUsers);
			
			return "list-users";
		}
		
		@GetMapping("/about")
		public String about() {
			return "about";
		}
		
		@GetMapping("/signup")
		public String signup() {
			return "signup";
		}
		
		@GetMapping("/signin")
		public String signin() {
			return "signin";
		}
		
		@GetMapping("/mainUser")
		public String mainUser(Model theModel) {
			
			List<UserRecord> theUserRecords = userService.getUserRecords();
			theModel.addAttribute("userRecords", theUserRecords);
			return "mainUser";
		}
		
		@GetMapping("/addCollection")
		public String addCollection() {
			return "addCollection";
		}
		
		@GetMapping("/addWish")
		public String addWish() {
			return "addWish";
		}
}

