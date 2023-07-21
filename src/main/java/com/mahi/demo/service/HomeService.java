package com.mahi.demo.service;

import java.util.List;

import java.util.Optional;

import com.mahi.demo.entity.Home;

public interface HomeService {

	
	  public Home saveHome(Home home);
	  
	  public List<Home> getHome();
	 	  
	  public Optional<Home> findById(long id) ;
	  
	  public void delete(long id);
	  
	 // public void update( Home home,long id);
	 

}
