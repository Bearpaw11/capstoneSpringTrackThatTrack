package com.chris.behrens.track.that.track.dao;

import java.util.List;


import com.chris.behrens.track.that.track.entity.UserRecord;

public interface UserRecordDAO {

	public UserRecord getUserRecord(int theId);
	public void saveUserRecord(UserRecord theUserRecord);
	public List<UserRecord> getUserRecords(int UserId);
	public void deleteUserRecord(int theId);
	
}
