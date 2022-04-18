package com.shin.test.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DummyControllerTest {

	@PostMapping("/dummy/join")//key=value 값 형태로 날아옴(약속된 규칙)
	public String join(String username, String password, String email) {//변수명이 동일해야함
		System.out.println("username: "+username);
		System.out.println("password: "+password);
		System.out.println("email: "+email);
		return "회원가입이 완료되었습니다.";
	}
	
	@PostMapping("/dummy/join2")//key=value 값 형태로 날아옴(약속된 규칙)
	public String join2(User user) {//객체로도 가능
		System.out.println("username: "+user.username);
		System.out.println("password: "+user.password);
		System.out.println("email: "+user.email);
		return "회원가입이 완료되었습니다.";
	}
	
	
}
