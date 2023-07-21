package com.mahi.demo.service;

import java.util.List;

import java.util.Optional;

import com.mahi.demo.entity.Signup;

public interface SignupService {

	
	  public Signup saveSignup(Signup signup);
	  
	  public List<Signup> getSignup();
	 	  
	  public Optional<Signup> findById(long id) ;
	  
	  public void delete(long id);
	  
	//  public void update( Signup signup,long id);
	  
	 
}
