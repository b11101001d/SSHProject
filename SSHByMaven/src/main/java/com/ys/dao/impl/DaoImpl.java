package com.ys.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import com.ys.dao.Dao;
import com.ys.entity.UserInfo;

public class DaoImpl extends HibernateDaoSupport implements Dao{
	@SuppressWarnings("rawtypes")
	public List getAll(){
		Session session=getHibernateTemplate().getSessionFactory().openSession();
		Transaction ctx=session.beginTransaction();
		Query q=session.createQuery("from UserInfo");
		List list=q.list();
		ctx.commit();
		session.close();
		return list;
	}

	public void save(UserInfo user) {
		getHibernateTemplate().save(user);
	}
}
