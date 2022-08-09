package com.chris.behrens.track.that.track.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.chris.behrens.track.that.track.entity.User;
import com.chris.behrens.track.that.track.entity.UserRecord;


@Repository
public class UserDAOImpl implements UserDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<User> getUsers() {

		// get the current session from hibernate
		Session currentSession = sessionFactory.getCurrentSession();

		// create a query
		Query<User> theQuery = currentSession.createQuery("from User", User.class);

		// execute the query and get results
		List<User> users = theQuery.getResultList();

		// return the results
		return users;
	}

	@Override
	public void saveUser(User theUser) {
		Session currentSession = sessionFactory.getCurrentSession();
		
		currentSession.saveOrUpdate(theUser);
	}

	@Override
	public User getUser(int i) {
		// get the current session from hibernate
		Session currentSession = sessionFactory.getCurrentSession();
		User user = currentSession.get(User.class, i);
		return user;
	}

	@Override
	public User verifyLogin(String theUserName, String thePassword) {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<User> theQuery = currentSession.createQuery("from User where userName=:theUserName", User.class);
		theQuery.setParameter("theUserName", theUserName);
		User user = theQuery.uniqueResult();
		if(user !=null && user.getPassword().equals(thePassword)) {
			return user;
		}
		return null;
	}

	@Override
	public List<UserRecord> getAUserRecords(int id) {
		Session currentSession = sessionFactory.getCurrentSession();
		//get the user based on the id
		User user = currentSession.get(User.class, id);
		List<UserRecord> userRecords = user.getUserRecords();
		return null;
	}

	@Override
	public void saveUserRecord(UserRecord theUserRecord, int UserId) {
		Session currentSession = sessionFactory.getCurrentSession();
		User user = currentSession.get(User.class, UserId);
		theUserRecord.setUser(user);
		currentSession.saveOrUpdate(theUserRecord);
		
	}
}
