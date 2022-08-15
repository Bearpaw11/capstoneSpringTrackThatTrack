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
	public UserRecord getUserRecord(int theId) {
		return userRecordDAO.getUserRecord(theId);
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


	@Override
	@Transactional
	public List<UserRecord> getUserRecords(int UserId) {
		return userRecordDAO.getUserRecords(UserId);
	}

	@Override
	@Transactional
	public void deleteUserRecord(int theId) {
		userRecordDAO.deleteUserRecord(theId);
		
	}

	@Override
	@Transactional
	public User verifyLogin(String theUserName) {
		return userDAO.verifyLogin(theUserName);		
	}


	@Override
	@Transactional
	public void saveUserRecord(UserRecord theUserRecord, int UserId) {
		userDAO.saveUserRecord(theUserRecord, UserId);
		
	}

	@Override
	@Transactional
	public void saveUserWishRecord(UserWishRecord theUserWishRecord, int userId) {
		userDAO.saveUserWishRecord(theUserWishRecord, userId);
		
	}
	@Override
	@Transactional
	public List<UserWishRecord> getUserWishRecords(int UserId) {
		return userWishRecordDAO.getUserWishRecords(UserId);
	}

	@Override
	@Transactional
	public UserWishRecord getUserWishRecord(int theId) {
		return userWishRecordDAO.getUserWishRecord(theId);
	}


	@Override
	@Transactional
	public void deleteUserWishRecord(int theId) {
		userWishRecordDAO.deleteUserWishRecord(theId);
		
	}
}
