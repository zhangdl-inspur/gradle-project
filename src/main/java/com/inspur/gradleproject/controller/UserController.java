package com.inspur.gradleproject.controller;

import io.swagger.annotations.*;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;
import com.inspur.gradleproject.entity.UserEntity;
import com.inspur.gradleproject.service.UserService;

/**
 * @author zhangdongliang
 * create date:2019-11-22
 */
@RestController
@RequestMapping(value = "/v1/user", produces = {"application/json;charset=UTF-8"})
@Api(value = "UserController")
@Slf4j
public class UserController {

	@Autowired
	private UserService userService;

	/**
	 * 添加
	 * @author zhangdongliang
	 * create date:2019-11-22
	 */
	@ApiOperation(value="添加", response= ResponseEntity.class)
	@PostMapping(value = "insert")
	public ResponseEntity insertUser(HttpServletRequest request, UserEntity entity){
		boolean flag = userService.insertUser(entity);
		if(flag){
			return new ResponseEntity(HttpStatus.OK);
		}
		return new ResponseEntity(HttpStatus.EXPECTATION_FAILED);
	}
	/**
	 * 修改
	 * @author zhangdongliang
	 * create date:2019-11-22
	 */
	@ApiIgnore
	@ApiOperation(value="修改", response=ResponseEntity.class)
	@PostMapping(value = "update")
	public ResponseEntity updateUser(HttpServletRequest request, UserEntity entity){
		boolean flag = userService.updateUser(entity);
		if(flag){
			return new ResponseEntity(HttpStatus.OK);
		}
		return new ResponseEntity(HttpStatus.EXPECTATION_FAILED);
	}
	/**
	 * 根据id进行删除
	 * @author zhangdongliang
	 * create date:2019-11-22
	 */
	@ApiIgnore
	@ApiOperation(value="根据id进行删除", response=ResponseEntity.class)
	@PostMapping("/delete")
	public ResponseEntity deleteUser(
			@ApiParam(value = "id",required = true)@RequestParam(value = "id")Long id){
		if(id == null){
			return new ResponseEntity(HttpStatus.EXPECTATION_FAILED);
		}

		boolean flag = userService.deleteUserById(id);
		if(flag){
			return new ResponseEntity(HttpStatus.OK);
		}
		return new ResponseEntity(HttpStatus.EXPECTATION_FAILED);
	}
	/**
	 * 根据id查询数据
	 * @author zhangdongliang
	 * create date:2019-11-22
	 */
	@ApiIgnore
	@ApiOperation(value="根据id进行查询", response=ResponseEntity.class)
	@ApiResponses({
		@ApiResponse(code=200,message="成功,返回content中vo类参数如下", response= UserEntity.class)
	})
	@PostMapping(value = "getById")
	public ResponseEntity geUserById(
			@ApiParam(value = "id",required = true)@RequestParam(value = "id")Long id){
		if(id == null){
			return new ResponseEntity(HttpStatus.EXPECTATION_FAILED);
		}

		UserEntity userEntity = userService.getUserById(id);
		return ResponseEntity.ok(userEntity);
	}
	/**
	 * 查询所有数据
	 * @author zhangdongliang
	 * create date 2019-11-22
	 */
	@ApiIgnore
	@ApiOperation(value="查询所有数据", response=ResponseEntity.class)
	@ApiResponses({
		@ApiResponse(code=200,message="成功,返回content中vo类参数如下", response= UserEntity.class)
	})
	@PostMapping(value = "getAll")
	public ResponseEntity getAllUser(HttpServletRequest request, UserEntity entity){
		List<UserEntity> list = userService.getAllUserListByCondition(entity);
		return ResponseEntity.ok(list);
	}
}