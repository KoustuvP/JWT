package com.example.cloud.greet.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.cloud.greet.domain.Member;
import com.example.cloud.greet.services.LoginService;






//@RestController
//@RequestMapping(value="/api/user")
//public class LoginResource {
//	 @Autowired
//	 LoginService loginService ;
//
//	@GetMapping(value="/{userName}")
//	public ResponseEntity<Member> getUser(@PathVariable("userName") String userName){
//		
//		return ResponseEntity.ok(loginServic e.getUser(userName));
//	}
//}
