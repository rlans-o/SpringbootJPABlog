package com.gi.blog.controller.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gi.blog.dto.ResponseDto;
import com.gi.blog.model.User;
import com.gi.blog.service.UserService;

@RestController
public class UserApiController {

	@Autowired
	private UserService UserService;
	
	
	@PostMapping("/auth/joinProc")
	public ResponseDto<Integer> save(@RequestBody User user) { // username, password, email
		System.out.println("UserApiController : save 호출됨");
		// 실제로 DB에 insert를 하고 아래에서 return이 되면됨.
		UserService.회원가입(user);
		return new ResponseDto<Integer>(HttpStatus.OK.value(),  1); // 자바오브젝트를 JSON으로 변환해서 리턴 (Jackson)
	}

}
