package com.chris.behrens.track.that.track.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.chris.behrens.track.that.track.entity.User;
import com.chris.behrens.track.that.track.entity.UserRecord;
import com.chris.behrens.track.that.track.entity.UserWishRecord;


@Repository
public class UserDAOImpl implements UserDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	//Save a user 
	@Override
	public void saveUser(User theUser) {
		Session currentSession = sessionFactory.getCurrentSession();
		
		currentSession.saveOrUpdate(theUser);
	}


	//method to get User from the database based on the userName entered in login
	@Override
	public User verifyLogin(String theUserName) {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<User> theQuery = currentSession.createQuery("from User where userName=:theUserName", User.class);
		theQuery.setParameter("theUserName", theUserName);
		User user = theQuery.uniqueResult();
		//check to see if user contains a user or if it null
		if(user !=null) {
			return user;
		}
		return null;
	}


	//Method to save a userRecord
	@Override
	public void saveUserRecord(UserRecord theUserRecord, int UserId) {
		Session currentSession = sessionFactory.getCurrentSession();
		User user = currentSession.get(User.class, UserId);
		theUserRecord.setUser(user);
		currentSession.saveOrUpdate(theUserRecord);
		
	}
	
	//Method to save a userWishRecord
	@Override
	public void saveUserWishRecord(UserWishRecord theUserWishRecord, int userId) {
		Session currentSession = sessionFactory.getCurrentSession();
		User user = currentSession.get(User.class, userId);
		theUserWishRecord.setUser(user);
		currentSession.saveOrUpdate(theUserWishRecord);
		
	}
}
