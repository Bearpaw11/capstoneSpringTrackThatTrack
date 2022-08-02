package com.chris.behrens.track.that.track.dao;

import java.util.List;

import com.chris.behrens.track.that.track.entity.UserRecord;

public interface UserRecordDAO {

	
	public List<UserRecord> getUserRecords();
	public void saveUserRecord(UserRecord theUserRecord);
	
}
