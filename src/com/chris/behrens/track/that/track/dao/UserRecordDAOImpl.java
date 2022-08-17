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
public class UserRecordDAOImpl implements UserRecordDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	
	@Override
	public UserRecord getUserRecord(int theId){
		
		//creating a session with the database
		Session currentSession = sessionFactory.getCurrentSession();
		//getting the userRecord with the Id and setting it to userRecord
		UserRecord userRecord = currentSession.get(UserRecord.class, theId);
		//returning the userRecord
		return userRecord;
	}
	
	//method to save or update a record
	@Override
	public void saveUserRecord(UserRecord theUserRecord) {
		Session currentSession = sessionFactory.getCurrentSession();
		
		currentSession.saveOrUpdate(theUserRecord);
	}
	
	//method to get and return a list of userRecords
	@Override
	public List<UserRecord> getUserRecords(int UserId) {
		Session currentSession = sessionFactory.getCurrentSession();
		//Parameterized Query to get userRecords by UserId
		Query<UserRecord> theQuery = currentSession.createQuery("from UserRecord where users_id=:UserId order by artist", UserRecord.class);
		//setting the Parameter to the UserId
		theQuery.setParameter("UserId", UserId);
		//Creating a list of records based on theQuery results
		List<UserRecord> theUserRecords = theQuery.getResultList();
		//Return the User records
		return theUserRecords;
	}
	//Method to delete a userRecords
	@Override
	public void deleteUserRecord(int theId) {
		Session currentSession = sessionFactory.getCurrentSession();
		
		UserRecord theUserRecord = currentSession.get(UserRecord.class, theId);
		
		currentSession.delete(theUserRecord);
			
	}
	
}
