package com.chris.behrens.track.that.track.dao;

import java.util.List;


import com.chris.behrens.track.that.track.entity.UserWishRecord;




public interface UserWishRecordDAO {
	public List<UserWishRecord> getUserWishRecords(int UserId);
	public void saveUserWishRecord(UserWishRecord theUserWishRecord);
	public UserWishRecord getUserWishRecord(int theId);
	public void deleteUserWishRecord(int theId);
}
