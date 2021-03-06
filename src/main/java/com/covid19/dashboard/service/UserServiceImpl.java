package com.covid19.dashboard.service;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.covid19.dashboard.entity.UserProfileEntity;
import com.covid19.dashboard.exception.UserExceptions;
import com.covid19.dashboard.repository.UserProfileRepo;

@Component
public class UserServiceImpl implements UserService {

	@Autowired
	private UserProfileRepo userProfileRepo;

	@Override
	public ArrayList<UserProfileEntity> getAllUsers() {
		ArrayList<UserProfileEntity> usersList = (ArrayList<UserProfileEntity>) userProfileRepo.findAll();
		return usersList;
	}

	@Override
	public Optional<UserProfileEntity> getUserById(int id) {
		Optional<UserProfileEntity> user = userProfileRepo.findById(id);
		try {
			if (!user.isPresent())
				throw new UserExceptions("User id" + id);

		} catch (Exception e) {
			// TODO: handle exception
		}
		return user;

	}

	public UserProfileEntity getUserBYname(String userName) {
		System.out.println("calling getUserbyName from service "+ userName);
		UserProfileEntity username = userProfileRepo.findByUserName(userName);
		//System.out.println("calling getUserbyName from service "+ username.toString());
		return username;

	}

	public UserProfileEntity uploadUser(UserProfileEntity userProfileEntity) {

		try {
			System.out.println("calling uploadUser from service ");
			Optional<UserProfileEntity> byuser = userProfileRepo.findById(userProfileEntity.getUserid());
			UserProfileEntity userEntity = null;
			if (byuser.isPresent()) {
				
				userEntity = byuser.get();
				userEntity.setFirstname(userProfileEntity.getFirstname());
				userEntity.setLastname(userProfileEntity.getLastname());
				//userEntity.setPasscode(userProfileEntity.getPasscode());
				userEntity.setPhone(userProfileEntity.getPhone());
				userEntity.setEmail(userProfileEntity.getEmail());
				userEntity.setUsername(userProfileEntity.getUsername());
				userEntity.setPasscode(userProfileEntity.getPasscode());
				userProfileRepo.save(userEntity);
				return userEntity;
			} else {
				userProfileRepo.save(userProfileEntity);
			   
			}
			// UserProfileEntity entity = userProfileRepo.save(userProfileEntity);
			// return entity;
			

		} catch (Exception e) {
			e.printStackTrace();
			
		}
		System.out.println("Exiting uploadUser from service");
		return userProfileEntity;

	}

}
