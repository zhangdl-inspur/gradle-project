package com.inspur.gradleproject.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
* @author zhangdongliang
* create date:2019-11-22
*/
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserEntity {

	private static final long serialVersionUID = 1L;

	@ApiModelProperty(value = "主键",name="id")
	private Long id;

	@ApiModelProperty(value = "登录名",name="loginName")
	private String loginName;

	@ApiModelProperty(value = "密码",name="password")
	private String password;

	@ApiModelProperty(value = "姓名",name="name")
	private String name;

	@ApiModelProperty(value = "联系电话",name="phone")
	private String phone;

	@ApiModelProperty(value = "邮箱",name="email")
	private String email;

	@ApiModelProperty(value = "入职日期",name="entryDate")
	private String entryDate;

	@ApiModelProperty(value = "部门id",name="organizeId")
	private Long organizeId;

	@ApiModelProperty(value = "是否可查询当前部门所有信息(0:否;1:是)",name="organizePerm")
	private Byte organizePerm;

	@ApiModelProperty(value = "是否可用(0:可用;1:不可用)",name="usable")
	private Byte usable;

}