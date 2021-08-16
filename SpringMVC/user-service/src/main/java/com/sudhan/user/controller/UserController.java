package com.sudhan.user.controller;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sudhan.user.entity.User;
import com.sudhan.user.service.UserService;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/users")
@Slf4j
public class UserController {

	private static final String USER_SERVICE = "userService";
	@Autowired
	private UserService userService;

	@PostMapping("/")
	public User saveUser(@RequestBody User user) {
	        log.info("Inside saveUser of UserController");
		return userService.saveUser(user);
	}

//	    @GetMapping("/{id}")
//	    public ResponseTemplateVO getUserWithDepartment(@PathVariable("id") Long userId) {
////	        log.info("Inside getUserWithDepartment of UserController");
//	        return userService.getUserWithDepartment(userId);
//	    }
	// working till here

	@GetMapping("/{id}")
	@CircuitBreaker(name = USER_SERVICE, fallbackMethod = "userFallback")
	public ResponseEntity<Object> getUserWithDepartment(@PathVariable("id") Long userId) {
	        log.info("Inside getUserWithDepartment of UserController"); 
				 JSONObject jsonObj = new JSONObject( userService.getUserWithDepartment(userId) );
			        return new ResponseEntity<>(jsonObj.toMap(), HttpStatus.OK);     
	}
	public ResponseEntity<Object> userFallback(@PathVariable("id") Long userId, Exception e) {
		return new ResponseEntity<>("Department service is down", HttpStatus.OK);

	}
}
