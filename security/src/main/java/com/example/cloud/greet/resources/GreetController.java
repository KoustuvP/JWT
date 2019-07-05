package com.example.cloud.greet.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.cloud.greet.domain.GreetObject;
import com.example.cloud.greet.services.GreetService;

@RestController
public class GreetController {
	
	@GetMapping(value="/")
	public String getHome() {
		return "Hello from Home";
	}
	
//	@PostMapping(value="/login")
//	public String login() {
//		return "You are signed in";
//	}
	@GetMapping(value="/offers")
	public List getOffers() {

    ArrayList<String> arrayList = new ArrayList<>(Arrays.asList("Cha","coffee","sprite","bread"));
		return arrayList;
	}
	@Autowired
	GreetService greetService;
//	 @GetMapping(value="/greetapi/greet")
//	 public ResponseEntity<GreetObject> getGreetings(){
//		  GreetObject greetObject=greetService.getGreet();
//		  System.out.println(greetObject);
//		 return ResponseEntity.ok(greetObject);
//	 }
	 @GetMapping(value="/greetapi")
	 public ResponseEntity<GreetObject> getGreets(){
		 GreetObject greetObject=new GreetObject();
		 greetObject.setGreetOffer("Take some Coffee");
		 greetObject.setGreetMessage("Hello");
		 return ResponseEntity.ok(greetObject);
	 }
	 
}
