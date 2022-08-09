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
		
	
		Session currentSession = sessionFactory.getCurrentSession();
		
		UserRecord userRecord = currentSession.get(UserRecord.class, theId);

		
		return userRecord;
	}
	
	@Override
	public void saveUserRecord(UserRecord theUserRecord) {
		Session currentSession = sessionFactory.getCurrentSession();
		
		//save/update the 
		currentSession.saveOrUpdate(theUserRecord);
	}

	@Override
	public List<UserRecord> getUserRecords(int UserId) {
		Session currentSession = sessionFactory.getCurrentSession();
		System.out.println(UserId+"here is my number");
		Query<UserRecord> theQuery = currentSession.createQuery("from UserRecord where users_id=:UserId order by artist", UserRecord.class);
		theQuery.setParameter("UserId", UserId);
		List<UserRecord> theUserRecords = theQuery.getResultList();
		return theUserRecords;
	}

	@Override
	public void deleteUserRecord(int theId) {
		Session currentSession = sessionFactory.getCurrentSession();
		
		UserRecord theUserRecord = currentSession.get(UserRecord.class, theId);
	   currentSession.delete(theUserRecord);
			
	}
	
}
