package com.ys.dao;

import java.util.List;

import com.ys.entity.UserInfo;
@SuppressWarnings("rawtypes")
public interface Dao {
	 
	List getAll();
	void save(UserInfo user);
}
