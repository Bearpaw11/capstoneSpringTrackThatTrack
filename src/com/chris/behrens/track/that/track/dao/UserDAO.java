package com.chris.behrens.track.that.track.dao;

import java.util.List;

import com.chris.behrens.track.that.track.entity.User;

public interface UserDAO {

	public List<User> getUsers();
	public void saveUser(User theUser);
	public User getUser(int i);
}
