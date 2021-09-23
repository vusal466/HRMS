package com.project.hrms.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.hrms.business.abstracts.UserService;
import com.project.hrms.entites.concretes.Users;


@RestController
@RequestMapping("/api/users")
public class UsersController {
	
	private UserService userservices;

	@Autowired
	public UsersController(UserService userservices) {
		super();
		this.userservices = userservices;
	}
	
	
	@GetMapping("/getall")
	public List<Users> getAll(){
		return this.userservices.getAll();	
		}
}
