package com.chris.behrens.track.that.track.dao;

import java.util.List;

import com.chris.behrens.track.that.track.entity.User;
import com.chris.behrens.track.that.track.entity.UserRecord;
import com.chris.behrens.track.that.track.entity.UserWishRecord;

public interface UserDAO {

	public void saveUser(User theUser);
	public User verifyLogin(String theUserName);
	public void saveUserRecord(UserRecord theUserRecord, int i);
	public void saveUserWishRecord(UserWishRecord theUserWishRecord, int userId);
	
}
