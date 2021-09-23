package com.project.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.hrms.business.abstracts.UserService;
import com.project.hrms.dataAcces.abstracts.UserDao;
import com.project.hrms.entites.concretes.Users;

@Service
public class UserManager implements UserService{
	private UserDao userdao;
	
	@Autowired
	public UserManager(UserDao userdao) {
		super();
		this.userdao = userdao;
	}

	@Override
	public List<Users> getAll() {
		// TODO Auto-generated method stub
		return this.userdao.findAll();
	}
}