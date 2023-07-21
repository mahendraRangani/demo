package com.mahi.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mahi.demo.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

	User findById(String userName);

}
