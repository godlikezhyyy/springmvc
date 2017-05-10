package com.zhong.test.controller;

import javax.annotation.Resource;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zhong.test.pojo.User;
import com.zhong.test.service.TestService;

@Controller
public class Test{

	@Resource
	private TestService testService;
	
	private User user;
	
	
	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}


	@RequestMapping("test")
	@ResponseBody
	public ResponseEntity<User> execute() throws Exception {
		
		user =testService.getUser(1);
		System.out.println(user);
		return ResponseEntity.ok(user);
	}

	
}
