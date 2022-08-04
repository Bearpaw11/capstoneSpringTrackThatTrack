package com.chris.behrens.track.that.track.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.chris.behrens.track.that.track.dao.UserDAO;
import com.chris.behrens.track.that.track.dao.UserRecordDAO;
import com.chris.behrens.track.that.track.dao.UserWishRecordDAO;
import com.chris.behrens.track.that.track.entity.User;
import com.chris.behrens.track.that.track.entity.UserRecord;
import com.chris.behrens.track.that.track.entity.UserWishRecord;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserDAO userDAO;
	@Autowired
	private UserRecordDAO userRecordDAO;
	@Autowired
	private UserWishRecordDAO userWishRecordDAO;
	
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
	public List<UserWishRecord> getUserWishRecords() {
		return userWishRecordDAO.getUserWishRecords();
	}
	
	@Override
	@Transactional
	public void saveUserRecord(UserRecord theUserRecord) {
		userRecordDAO.saveUserRecord(theUserRecord);
	}
	
	@Override
	@Transactional
	public void saveUserWishRecord(UserWishRecord theUserWishRecord) {
		userWishRecordDAO.saveUserWishRecord(theUserWishRecord);
	}
	
	@Override
	@Transactional
	public void saveUser(User theUser) {
		userDAO.saveUser(theUser);
	}

	@Override
	@Transactional
	public User getUser(int i) {
		return userDAO.getUser(9);
		
	}

	@Override
	@Transactional
	public UserRecord getUserRecord(int theId) {
		return userRecordDAO.getUserRecord(theId);
	}

	@Override
	@Transactional
	public void deleteUserRecord(int theId) {
		userRecordDAO.deleteUserRecord(theId);
		
	}
}
