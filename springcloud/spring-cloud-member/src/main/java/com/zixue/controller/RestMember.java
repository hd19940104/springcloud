package com.zixue.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zixue.beans.User;
import com.zixue.service.UserRestService;

/**
 * 会员接口
 * 
 * @author houdo
 *
 */
@RestController
public class RestMember {
	@Autowired
	UserRestService userService;

	@RequestMapping("/restGetUser")
	public User getUser(Integer id) {
		User user = userService.findUserById(id);
		return user;
	}

}
