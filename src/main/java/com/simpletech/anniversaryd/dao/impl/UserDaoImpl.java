package com.simpletech.anniversaryd.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.simpletech.anniversaryd.dao.base.BaseDaoImpl;
import com.simpletech.anniversaryd.dao.UserDao;
import com.simpletech.anniversaryd.model.User;

/**
 * 数据库表user的Dao实现
 * @author zimu
 * @date 2015-12-16 11:53:02 中国标准时间
 */
@Repository
public class UserDaoImpl extends BaseDaoImpl<User> implements UserDao{

	@Override
	public int insert(User t) throws Exception {
		return super.insert(t);
	}

	@Override
	public int update(User t) throws Exception {
		return super.update(t);
	}

	@Override
	public int delete(Object id) throws Exception {
		return super.delete(id);
	}

	@Override
	public int countAll() throws Exception {
		return super.countAll();
	}

	@Override
	public User findById(Object id) throws Exception {
		return super.findById(id);
	}

	@Override
	public List<User> findAll() throws Exception {
		return super.findAll();
	}

	@Override
	public List<User> findByPage(int limit, int start) throws Exception {
		return super.findByPage(limit, start);
	}
}

