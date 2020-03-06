package com.inspur.gradleproject.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.inspur.gradleproject.dao.UserDao;
import com.inspur.gradleproject.entity.UserEntity;
import com.inspur.gradleproject.service.UserService;

/**
 * @author zhangdongliang
 * create date:2019-11-22
 */
@Transactional
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	/**
	 * 添加
	 * @author zhangdongliang
	 * create date:2019-11-22
	 */
	@Override
	public boolean insertUser(UserEntity entity){
		boolean flag=false;
		int result = userDao.insertSelective(entity);
		if(result > 0){
			flag = true;
		}
		return flag;
	}
	/**
	 * 修改
	 * @author zhangdongliang
	 * create date:2019-11-22
	 */
	@Override
	public boolean updateUser(UserEntity entity){
		boolean flag=false;
		int result = userDao.updateByPrimaryKeySelective(entity);
		if(result > 0){
			flag = true;
		}
		return flag;
	}
	/**
	 * 根据ID删除
	 * @author zhangdongliang
	 * create date:2019-11-22
	 */
	@Override
	public boolean deleteUserById(Long id){
		boolean flag=false;
		int result = userDao.deleteByPrimaryKey(id);
		if(result > 0){
			flag = true;
		}
		return flag;
	}
	/**
	 * 根据ID查询
	 * @author zhangdongliang
	 * create date:2019-11-22
	 */
	@Override
	@Transactional(readOnly=true)
	public UserEntity getUserById(Long id){
		UserEntity entity = userDao.selectByPrimaryKey(id);
		return entity;
	}
	/**
	 * 获取全部
	 * @author zhangdongliang
	 * @param entityCondition
	 * create date:2019-11-22
	 */
	@Override
	@Transactional(readOnly=true)
	public List<UserEntity> getAllUserListByCondition(UserEntity entityCondition){
		List<UserEntity> list = userDao.selectAll(entityCondition);
		return list;
	}
}