package com.simpletech.anniversaryd.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.simpletech.anniversaryd.dao.base.BaseDaoImpl;
import com.simpletech.anniversaryd.dao.MessageDao;
import com.simpletech.anniversaryd.model.Message;

/**
 * 数据库表message的Dao实现
 * @author zimu
 * @date 2015-12-16 11:53:02 中国标准时间
 */
@Repository
public class MessageDaoImpl extends BaseDaoImpl<Message> implements MessageDao{

	@Override
	public int insert(Message t) throws Exception {
		return super.insert(t);
	}

	@Override
	public int update(Message t) throws Exception {
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
	public Message findById(Object id) throws Exception {
		return super.findById(id);
	}

	@Override
	public List<Message> findAll() throws Exception {
		return super.findAll();
	}

	@Override
	public List<Message> findByPage(int limit, int start) throws Exception {
		return super.findByPage(limit, start);
	}
}

