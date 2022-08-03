package com.chris.behrens.track.that.track.service;

import java.util.List;

import com.chris.behrens.track.that.track.entity.User;
import com.chris.behrens.track.that.track.entity.UserRecord;
import com.chris.behrens.track.that.track.entity.UserWishRecord;

public interface UserService {
	public List<User> getUsers();
	
	public List<UserRecord> getUserRecords();
	
	public List<UserWishRecord> getUserWishRecords();
	
	public void saveUserRecord(UserRecord theUserRecord);
	
	public void saveUserWishRecord(UserWishRecord theUserWishRecord);
	
	public void saveUser(User theUser);
	
}
