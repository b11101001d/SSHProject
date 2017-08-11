package com.ys.service;

import java.util.List;

import com.ys.entity.UserInfo;
@SuppressWarnings("rawtypes")
public interface Service {
	List getAll();
	void save(UserInfo user);
}
