package com.covid19.dashboard.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.covid19.dashboard.entity.UserProfileEntity;

@Repository
public interface UserProfileCrudRepo extends CrudRepository<UserProfileEntity, Integer> {

}
