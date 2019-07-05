package com.example.cloud.greet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.cloud.greet.domain.Member;



@Repository
public interface LoginRepository extends JpaRepository<Member, Long> {

	
	  @Query("select u from Member u where u.email=:userName") Member
	  getUserByUserName(@Param("userName") String userName);
	 
	 
}
