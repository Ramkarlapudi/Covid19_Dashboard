package com.covid19.dashboard.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.covid19.dashboard.entity.UserProfileEntity;
import com.covid19.dashboard.exception.UploadProfileException;
import com.covid19.dashboard.repository.UserProfileCrudRepo;

@Component
public class UserServiceCrud {

	@Autowired
	private UserProfileCrudRepo userProfileCrudRepo;

	/*
	 * @Autowired private UserProfileEntity userProfileEntity;
	 */
	public UserProfileEntity save(UserProfileEntity userProfileEntity) {

		UserProfileEntity savedObject = userProfileCrudRepo.save(userProfileEntity);
		if (savedObject == null) {
			throw new UploadProfileException("Entity object doesnt saved ");
		}
		return savedObject;

	}

	public List<UserProfileEntity> saveAllUsers(List<UserProfileEntity> userProfileEntity)
	{
		Iterable<UserProfileEntity> savedUsersList = userProfileCrudRepo.saveAll(userProfileEntity);
		return (List<UserProfileEntity>) savedUsersList;

	}
}
