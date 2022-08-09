package com.chris.behrens.track.that.track.service;

import java.util.List;

import com.chris.behrens.track.that.track.entity.User;
import com.chris.behrens.track.that.track.entity.UserRecord;
import com.chris.behrens.track.that.track.entity.UserWishRecord;


public interface UserService {
	public List<User> getUsers();
	
	public UserRecord getUserRecord(int theId);
	
	public List<UserWishRecord> getUserWishRecords();
	
	public void saveUserRecord(UserRecord theUserRecord);
	
	public void saveUserWishRecord(UserWishRecord theUserWishRecord);
	
	public void saveUser(User theUser);

	public User getUser(int i);
	
	public List<UserRecord> getUserRecords(int UserId);
	
	public void deleteUserRecord(int theId);

	public User verifyLogin(String userName, String password);

	public List<UserRecord> getAUserRecords(int id);

	public void saveUserRecord(UserRecord theUserRecord, int i);
	
	
}
