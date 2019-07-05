package com.example.cloud.greet.services;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.cloud.greet.domain.Member;
import com.example.cloud.greet.repository.LoginRepository;



@Service
public class LoginService {

	@Autowired
	LoginRepository loginRepository;
	
	public Member getUser(String userName) {
		System.out.println(userName);
		return loginRepository.getUserByUserName(userName);
	}
	
	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logoutPage(HttpServletRequest request, HttpServletResponse response) {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		if (auth != null) {
			new SecurityContextLogoutHandler().logout(request, response, auth);
		}
		System.out.println("in logout controller");
		return "redirect:/login?logout=true";
	}
}
