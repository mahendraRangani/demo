package com.mahi.demo.service;

import java.util.List;

import java.util.Optional;

import com.mahi.demo.entity.About;

public interface AboutService {
	
	
	  public About saveAbout(About about);
	  
	  public List<About> getAbout();
	  	  
	  public Optional<About> findById(long id) ;
	  
	  public void delete(long id);  

	  //public void update(About about, long id);
	 

}
