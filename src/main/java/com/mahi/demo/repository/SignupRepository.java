package com.mahi.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.mahi.demo.entity.Signup;

@Repository
public interface SignupRepository extends JpaRepository<Signup, Long>{

//	public void updateSignup(Signup signup,long id);

}
