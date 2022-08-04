package com.chris.behrens.track.that.track.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.chris.behrens.track.that.track.entity.UserRecord;

@Repository
public class UserRecordDAOImpl implements UserRecordDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<UserRecord> getUserRecords(){
		
		// get the current session from hibernate
		Session currentSession = sessionFactory.getCurrentSession();
		
		// create a query
		Query<UserRecord> theQuery = currentSession.createQuery("from UserRecord order by artist", UserRecord.class);

		// execute the query and get results
		List<UserRecord> userRecords = theQuery.getResultList();
		
		return userRecords;
	}
	
	@Override
	public void saveUserRecord(UserRecord theUserRecord) {
		Session currentSession = sessionFactory.getCurrentSession();
		
		//save/update the customer
		currentSession.saveOrUpdate(theUserRecord);
	}

	@Override
	public UserRecord getUserRecord(int theId) {
		Session currentSession = sessionFactory.getCurrentSession();
		UserRecord theUserRecord = currentSession.get(UserRecord.class, theId);
		return theUserRecord;
	}

	@Override
	public void deleteUserRecord(int theId) {
		Session currentSession = sessionFactory.getCurrentSession();
		
		UserRecord theUserRecord = currentSession.get(UserRecord.class, theId);
	   currentSession.delete(theUserRecord);
			
	}
	
}
