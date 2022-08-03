package com.chris.behrens.track.that.track.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.chris.behrens.track.that.track.entity.UserWishRecord;

@Repository
public class UserWishRecordDAOImpl implements UserWishRecordDAO{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<UserWishRecord> getUserWishRecords(){
		
		// get the current session from hibernate
		Session currentSession = sessionFactory.getCurrentSession();
		
		// create a query
		Query<UserWishRecord> theQuery = currentSession.createQuery("from UserWishRecord order by artist", UserWishRecord.class);

		// execute the query and get results
		List<UserWishRecord> userWishRecords = theQuery.getResultList();
		
		return userWishRecords;
	}
	
	@Override
	public void saveUserWishRecord(UserWishRecord theUserWishRecord) {
		Session currentSession = sessionFactory.getCurrentSession();
		
		currentSession.saveOrUpdate(theUserWishRecord);
	}
}
