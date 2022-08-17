package com.chris.behrens.track.that.track.service;

import java.util.List;

import com.chris.behrens.track.that.track.entity.User;
import com.chris.behrens.track.that.track.entity.UserRecord;
import com.chris.behrens.track.that.track.entity.UserWishRecord;


public interface UserService {
	
	public UserRecord getUserRecord(int theId);
	
	public List<UserWishRecord> getUserWishRecords(int UserId);
	
	public void saveUserRecord(UserRecord theUserRecord);
	
	public void saveUser(User theUser);
	
	public List<UserRecord> getUserRecords(int UserId);
	
	public void deleteUserRecord(int theId);

	public User verifyLogin(String userName);

	public void saveUserRecord(UserRecord theUserRecord, int i);

	public void saveUserWishRecord(UserWishRecord theUserWishRecord, int userId);

	public UserWishRecord getUserWishRecord(int theId);

	public void deleteUserWishRecord(int theId);
	
	
}
