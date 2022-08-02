package com.chris.behrens.track.that.track.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.chris.behrens.track.that.track.dao.UserDAO;
import com.chris.behrens.track.that.track.dao.UserRecordDAO;
import com.chris.behrens.track.that.track.entity.User;
import com.chris.behrens.track.that.track.entity.UserRecord;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserDAO userDAO;
	@Autowired
	private UserRecordDAO userRecordDAO;
	
	@Override
	@Transactional
	public List<User> getUsers() {
		return userDAO.getUsers();
	}
	
	@Override
	@Transactional
	public List<UserRecord> getUserRecords() {
		return userRecordDAO.getUserRecords();
	}
	
	@Override
	@Transactional
	public void saveUserRecord(UserRecord theUserRecord) {
		userRecordDAO.saveUserRecord(theUserRecord);
	}
	
	@Override
	@Transactional
	public void saveUser(User theUser) {
		userDAO.saveUser(theUser);
	}
}
