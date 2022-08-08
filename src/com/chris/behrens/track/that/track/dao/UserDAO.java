package com.chris.behrens.track.that.track.dao;

import java.util.List;

import com.chris.behrens.track.that.track.entity.User;
import com.chris.behrens.track.that.track.entity.UserRecord;

public interface UserDAO {

	public List<User> getUsers();
	public void saveUser(User theUser);
	public User getUser(int i);
	public User verifyLogin(String theUserName, String thePassword);
	public List<UserRecord> getAUserRecords(int id);
	public void saveUserRecord(UserRecord theUserRecord, int i);
}
