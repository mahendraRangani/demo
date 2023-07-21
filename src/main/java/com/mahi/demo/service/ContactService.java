package com.mahi.demo.service;

import java.util.List;

import java.util.Optional;

import com.mahi.demo.entity.Contact;

public interface ContactService {
	
	
	  public Contact saveContact(Contact Contact);
	  
	  public List<Contact> getContact();
	 
	  
	  public Optional<Contact> findById(long id) ;
	  
	  public void delete(long id);
	  
	//  public void update( Contact contact,long id);
	 

}
