package com.chris.behrens.track.that.track.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

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
	
		// need to inject our user service
		@Autowired
		private UserService userService;
		
		//Route to about page
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
		public String signin(Model theModel) {
			
			LoginHelper loginHelper = new LoginHelper();
			theModel.addAttribute("loginHelper", loginHelper);
			
			return "signin";
		}
		
		
		//verifies user and if they match the database it directs to the user home page
		@PostMapping("/loginUser")
			public String verifyLogin(@ModelAttribute("loginHelper") LoginHelper loginHelper, Model theModel, HttpSession session){
				User user = userService.verifyLogin(loginHelper.getUserName(), loginHelper.getPassword());
				
				if(user == null) {
					//error message if login fails
					theModel.addAttribute("loginError", "Error logging in. Please Try again.");
					return "signin";
				}
				//add loggedInUser to http session
				session.setAttribute("loggedInUser", user);
				return "redirect:/mainUser";
			}			
		
		//removed loggedInUser from http session and redirects to landing page
		@GetMapping("/logout")
		public String logout(HttpSession session) {
			session.removeAttribute("loggedInUser");
			System.out.println(session.getAttribute("loggedInUser"));
			return "redirect:/";
		}
		
		
		// This is the Main user page
		@GetMapping("/mainUser")
		public String mainUser(Model theModel, HttpSession session) {
		
		//gets the user from the http session attribute and gets the User Id		
		User user =  (User) (session.getAttribute("loggedInUser"));
		int UserId =(user.getId());
		
		//uses the UserId to get the userRecords using the userService
		List<UserRecord> theUserRecords = userService.getUserRecords(UserId);
		session.setAttribute("userRecords", theUserRecords);
		
		//uses the UserId to get the userWishRecords using the userService
		List<UserWishRecord> theUserWishRecords = userService.getUserWishRecords(UserId);
		theModel.addAttribute("userWishRecords", theUserWishRecords);
			
		return "mainUser";
		}
		
		
		//creates model attribute to bind the form data. Returns the add collection page
		@GetMapping("/addCollection")
		public String addCollection(Model theModel, HttpSession session) {
			UserRecord theUserRecord = new UserRecord();
			theModel.addAttribute("userRecord", theUserRecord);
			
			return "addCollection";
		}
		
		//saves the user records. Redirects to mainUser
		@PostMapping("/saveUserRecord")
		public String saveUserRecord(@ModelAttribute("userRecord") UserRecord theUserRecord, @ModelAttribute("loggedInUser") User user, HttpSession session) {
			
			//gets the user Id from http session
			User user1 =  (User) (session.getAttribute("loggedInUser"));
			int UserId =(user1.getId());
			
			//save the record using the userService
			userService.saveUserRecord(theUserRecord, UserId);
			
			return "redirect:/mainUser";
		}
	
		//get record info to populate form for update
		@GetMapping("/showFormForUpdate")
		public String showFormForUpdate(@RequestParam("recordId") int theId, Model theModel) {
			//get the record from our service
			UserRecord theUserRecord = userService.getUserRecord(theId);
			
			// set record as a model attribute to pre-populate the form
			theModel.addAttribute("userRecord", theUserRecord);
			
			//send to add form
			return "addCollection";
		}
		
		@GetMapping("/deleteRecord")
		public String deleteRecord(@RequestParam("userRecordId") int theId) {
			//use the service to delete the record
			userService.deleteUserRecord(theId);
			return "redirect:/mainUser";
		}
		
	
		@GetMapping("/addWish")
		public String addWish(Model theModel, HttpSession session) {
			UserWishRecord theUserWishRecord = new UserWishRecord();
			theModel.addAttribute("userWishRecord", theUserWishRecord);
			return "addWish";
		}
	
		@PostMapping("/saveUserWishRecord")
		public String saveUserWishRecord(@ModelAttribute("userWishRecord") UserWishRecord theUserWishRecord, @ModelAttribute("loggedInUser") User user, HttpSession session) {
			//gets the user Id from http session
			User user1 =  (User) (session.getAttribute("loggedInUser"));
			int UserId =(user1.getId());
			
			//save the record using service
			userService.saveUserWishRecord(theUserWishRecord, UserId);
			
			return "redirect:/mainUser";
		}
		
		//get record info to populate form for update
		@GetMapping("/showFormForWishUpdate")
		public String showFormForWishUpdate(@RequestParam("recordId") int theId, Model theModel) {
			//get the record from our service
			UserWishRecord theUserWishRecord = userService.getUserWishRecord(theId);
			
			// set record as a model attribute to pre-populate the form
			theModel.addAttribute("userWishRecord", theUserWishRecord);
			
			//send to add form
			return "addWish";
		}
		
		@GetMapping("/deleteWishRecord")
		public String deleteWishRecord(@RequestParam("userWishRecordId") int theId) {
			//use the service to delete the record
			userService.deleteUserWishRecord(theId);
			return "redirect:/mainUser";
		}
		
		
}

