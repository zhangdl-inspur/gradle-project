package com.inspur.gradleproject.dao;

import java.util.List;


import com.inspur.gradleproject.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author zhangdongliang
 * create date:2019-11-22
 */
@Repository
public interface UserDao {

	/**
	 * 添加所有
	 * @author zhangdongliang
	 * create date:2019-11-22
	 */
	public int insert(UserEntity entity);

	/**
	 * 添加非空字段
	 * @author zhangdongliang
	 * create date:2019-11-22
	 */
	public int insertSelective(UserEntity entity);

	/**
	 * 根据ID修改所有
	 * @author zhangdongliang
	 * create date:2019-11-22
	 */
	public int updateByPrimaryKey(UserEntity entity);

	/**
	 * 根据ID修改非空字段
	 * @author zhangdongliang
	 * create date:2019-11-22
	 */
	public int updateByPrimaryKeySelective(UserEntity entity);

	/**
	 * 根据ID删除数据
	 * @author zhangdongliang
	 * create date:2019-11-22
	 */
	public int deleteByPrimaryKey(Long id);

	/**
	 * 根据ID查询数据
	 * @author zhangdongliang
	 * create date:2019-11-22
	 */
	public UserEntity selectByPrimaryKey(Long id);

	/**
	 * 查询所有数据
	 * @author zhangdongliang
	 * create date:2019-11-22
	 */
	public List<UserEntity> selectAll(UserEntity entity);

}