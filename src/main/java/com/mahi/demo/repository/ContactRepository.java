package com.mahi.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.mahi.demo.entity.Contact;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Long>{
	
	//public void updateContact(Contact contact,long id);

}
