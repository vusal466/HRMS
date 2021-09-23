package com.project.hrms.dataAcces.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.hrms.entites.concretes.Users;

public interface UserDao extends JpaRepository<Users, Integer> {

}
