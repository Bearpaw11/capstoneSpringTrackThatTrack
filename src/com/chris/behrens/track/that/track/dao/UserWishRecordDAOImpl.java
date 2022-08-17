package com.chris.behrens.track.that.track.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.chris.behrens.track.that.track.entity.UserRecord;
import com.chris.behrens.track.that.track.entity.UserWishRecord;

@Repository
public class UserWishRecordDAOImpl implements UserWishRecordDAO{

	@Autowired
	private SessionFactory sessionFactory;
	
	//get list of UserWishReords and return it
	@Override
	public List<UserWishRecord> getUserWishRecords(int UserId){
		
		// get the current session 
		Session currentSession = sessionFactory.getCurrentSession();
		//Parameterized Query to get userWishRecords by UserId
		Query<UserWishRecord> theQuery = currentSession.createQuery("from UserWishRecord where users_id=:UserId order by artist", UserWishRecord.class);
		//setting the Parameter to the UserId
		theQuery.setParameter("UserId", UserId);
		List<UserWishRecord> theUserWishRecords = theQuery.getResultList();
		return theUserWishRecords;
	}
	
	//method to save or update a record
	@Override
	public void saveUserWishRecord(UserWishRecord theUserWishRecord) {
		Session currentSession = sessionFactory.getCurrentSession();
		currentSession.saveOrUpdate(theUserWishRecord);
	}

	//getting the userWishRecord with the Id and setting it to userWishRecord and then returning the userWishRecord
	@Override
	public UserWishRecord getUserWishRecord(int theId) {
		Session currentSession = sessionFactory.getCurrentSession();
		
		UserWishRecord userWishRecord = currentSession.get(UserWishRecord.class, theId);

		return userWishRecord;// 
		
	}

	//deleting a UserWishRecord
	@Override
	public void deleteUserWishRecord(int theId) {
		Session currentSession = sessionFactory.getCurrentSession();
		
		UserWishRecord theUserWishRecord = currentSession.get(UserWishRecord.class, theId);
	    
		currentSession.delete(theUserWishRecord);
		
	}
}
