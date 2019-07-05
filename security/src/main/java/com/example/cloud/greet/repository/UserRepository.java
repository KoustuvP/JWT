package com.example.cloud.greet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.cloud.greet.domain.Member;

@Repository("userRepository")
public interface UserRepository extends JpaRepository<Member, Long> {
    Member findByEmail(String email);
}