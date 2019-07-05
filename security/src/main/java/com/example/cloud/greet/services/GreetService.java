package com.example.cloud.greet.services;

import java.io.IOException;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;

import com.example.cloud.greet.domain.GreetObject;

@Service
public class GreetService {


	public GreetObject getGreet() {
		  GreetObject greetObject=new GreetObject();
		  greetObject.setGreetMessage("Good Morning");
		  greetObject.setGreetOffer("Please take some tea");
		  return greetObject;
	}
	
	public GreetObject getGreet(String offer) {
		 GreetObject greetObject=new GreetObject();
		 greetObject.setGreetOffer(offer);
		return greetObject;
	}
	
	private static HttpEntity<?> getHeaders() throws IOException {
		HttpHeaders headers = new HttpHeaders();
		headers.set("Accept", MediaType.APPLICATION_JSON_VALUE);
		return new HttpEntity<>(headers);
	}
}
