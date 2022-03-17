package com.covid19.dashboard.service;

import java.util.ArrayList;
import java.util.Optional;

import com.covid19.dashboard.entity.UserProfileEntity;

public interface UserService {
	
	public  ArrayList<UserProfileEntity> getAllUsers();
	
    public Optional<UserProfileEntity>  getUserById(int id );	

}
