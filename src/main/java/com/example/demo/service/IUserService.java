package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.User;

public interface IUserService {

	public List<User> findAll();
	
	public void save(User user);
	
	public User findById(Long id);
}
