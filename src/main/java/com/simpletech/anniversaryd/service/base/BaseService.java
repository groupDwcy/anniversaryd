package com.simpletech.anniversaryd.service.base;

import com.simpletech.anniversaryd.dao.base.BaseDao;
import com.simpletech.anniversaryd.util.Page;

/**
 * 通用Service层接口
 * @param <T>
 * @author zimu
 * @date 2015-12-16 11:53:03 中国标准时间
 */
public interface BaseService<T> extends BaseDao<T>{
	int delete(String id) throws Exception;
	T findById(String id) throws Exception;
	Page<T> listByPage(int pageSize, int pageNo) throws Exception;
}
