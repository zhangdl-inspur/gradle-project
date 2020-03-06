package com.inspur.gradleproject.service;

import java.util.List;

import com.inspur.gradleproject.entity.UserEntity;

/**
 * @author zhangdongliang
 * create date:2019-11-22
 */
public interface UserService {
	/**
	 * 添加
	 * @author zhangdongliang
	 * create date:2019-11-22
	 */
	public boolean insertUser(UserEntity entity);
	/**
	 * 修改
	 * @author zhangdongliang
	 * create date:2019-11-22
	 */
	public boolean updateUser(UserEntity entity);
	/**
	 * 根据ID删除
	 * @author zhangdongliang
	 * create date:2019-11-22
	 */
	public boolean deleteUserById(Long id);
	/**
	 * 根据ID查询
	 * @author zhangdongliang
	 * create date:2019-11-22
	 */
	public UserEntity getUserById(Long id);
	/**
	 * 按条件获取全部
	 * @author zhangdongliang
	 * create date:2019-11-22
	 */
	public List<UserEntity> getAllUserListByCondition(UserEntity entityCondition);
}