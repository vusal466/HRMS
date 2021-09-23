package com.project.hrms.business.abstracts;

import java.util.List;

import com.project.hrms.entites.concretes.Users;

public interface UserService {

	List<Users> getAll();
}
