package com.simpletech.anniversaryd.service.impl;

import com.simpletech.anniversaryd.dao.UserDao;
import com.simpletech.anniversaryd.model.User;
import com.simpletech.anniversaryd.model.base.ModelBase;
import com.simpletech.anniversaryd.service.UserService;
import com.simpletech.anniversaryd.service.base.BaseServiceImpl;
import com.simpletech.anniversaryd.util.Page;
import com.simpletech.anniversaryd.util.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 数据库表user的Service接实现
 * @author zimu
 * @date 2015-12-16 11:53:03 中国标准时间
 */
@Service
public class UserServiceImpl extends BaseServiceImpl<User> implements UserService{

	@Autowired
	UserDao dao;
	
	@Override
	public int insert(User model) throws Exception{
		ModelBase.check(model);
		ModelBase.fillNullID(model);
		return dao.insert(model);
	}
	
	@Override
	public int update(User model) throws Exception {
		User old = findById(getModelID(model));
		if (old == null) {
			throw new ServiceException("请求更新记录不存在或已经被删除！");
		}
		model = checkNullField(old, model);
		return dao.update(model);
	}

	@Override
	public int delete(Object id) throws Exception {
		return dao.delete(id);
	}

	@Override
	public User findById(Object id) throws Exception{
		return dao.findById(id);
	}

	@Override
	public List<User> findAll() throws Exception{
		return dao.findAll();
	}

	@Override
	public int delete(String id) throws Exception{
		return dao.delete(id);
	}

	@Override
	public List<User> findByPage(int limit, int start) throws Exception {
		return dao.findByPage(limit,start);
	}

	@Override
	public User findById(String id) throws Exception {
		return dao.findById(id);
	}
	
	@Override
	public Page<User> listByPage(int pageSize, int pageNo) throws Exception{
		int limit = pageSize; 
		int start = pageNo*pageSize;
		int totalRecord = dao.countAll();
		int totalPage = 1 + (totalRecord - 1) / pageSize;
		
		List<User> list = dao.findByPage(limit, start);
		
		return new Page<User>(pageNo,pageSize,totalPage,totalRecord,list){};
	}

	@Override
	public int countAll() throws Exception {
		return dao.countAll();
	}
}
