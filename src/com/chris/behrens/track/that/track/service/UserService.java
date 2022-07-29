package com.chris.behrens.track.that.track.service;

import java.util.List;

import com.chris.behrens.track.that.track.entity.User;
import com.chris.behrens.track.that.track.entity.UserRecord;

public interface UserService {
	public List<User> getUsers();
	
	public List<UserRecord> getUserRecords();
	
}
