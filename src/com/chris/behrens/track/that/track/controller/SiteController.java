package com.chris.behrens.track.that.track.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.chris.behrens.track.that.track.entity.User;
import com.chris.behrens.track.that.track.entity.UserRecord;
import com.chris.behrens.track.that.track.entity.UserWishRecord;
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
		public String signup(Model theModel) {
			
				User theUser = new User();
				theModel.addAttribute("user", theUser);
			return "signup";
		}
		
		@PostMapping("saveUser")
		public String saveUser(@ModelAttribute("user") User theUser) {
			//save the user using the service
			userService.saveUser(theUser);
			
			return "redirect:/signin";
		}
		
		@GetMapping("/signin")
		public String signin() {
			return "signin";
		}
		
		@GetMapping("/mainUser")
		public String mainUser(Model theModel) {
			
			List<UserRecord> theUserRecords = userService.getUserRecords();
			theModel.addAttribute("userRecords", theUserRecords);
			
			
			List<UserWishRecord> theUserWishRecords = userService.getUserWishRecords();
			theModel.addAttribute("userWishRecords", theUserWishRecords);
			return "mainUser";
		}
		
		
		@GetMapping("/addCollection")
		public String addCollection(Model theModel) {
			UserRecord theUserRecord = new UserRecord();
//			get user 9 from the DB
//			User userNine = userService.getUser(9);
//			theUserRecord.setUser(userNine);
			theModel.addAttribute("userRecord", theUserRecord);
			return "addCollection";
		}
		
		@PostMapping("/saveUserRecord")
		public String saveUserRecord(@ModelAttribute("userRecord") UserRecord theUserRecord) {
			userService.saveUserRecord(theUserRecord);
			
			return "redirect:/mainUser";
		}
	
		
		@GetMapping("/showFormForUpdate")
		public String showFormForUpdate(@RequestParam("recordId") int theId, Model theModel) {
			//get the customer from our service
				UserRecord theUserRecord = userService.getUserRecord(theId);
			
			// set customer as a model attribute to pre-populate the form
			theModel.addAttribute("userRecord", theUserRecord);
			
			//send over to our form
			return "addCollection";
		}
		
		@GetMapping("/deleteRecord")
		public String deleteRecord(@RequestParam("userRecordId") int theId) {
			
			// delete the customer
			userService.deleteUserRecord(theId);
			
			return "redirect:/mainUser";
		}
		
	
		@GetMapping("/addWish")
		public String addWish(Model theModel) {
			// create model attribute to bind form data
			UserWishRecord theUserWishRecord = new UserWishRecord();
			
			theModel.addAttribute("userWishRecord", theUserWishRecord);
			
			return "addWish";
		}
		
		@PostMapping("/saveUserWishRecord")
		public String saveUserWishRecord(@ModelAttribute("userWishRecord") UserWishRecord theUserWishRecord) {
			///save the customer using service
			userService.saveUserWishRecord(theUserWishRecord);
			
			return "redirect:/mainUser";
		}
		
		
}

