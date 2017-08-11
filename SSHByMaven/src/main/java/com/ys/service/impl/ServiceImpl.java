package com.ys.service.impl;

import java.util.List;

import com.ys.dao.Dao;
import com.ys.entity.UserInfo;
import com.ys.service.Service;

public class ServiceImpl implements Service{
	private Dao dao;
	
	public void setDao(Dao dao) {
		this.dao = dao;
	}

	@SuppressWarnings("rawtypes")
	public List getAll() {
		return dao.getAll();
	}

	public void save(UserInfo user) {
		dao.save(user);
	}

}
