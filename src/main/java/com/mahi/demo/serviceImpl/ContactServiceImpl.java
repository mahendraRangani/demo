package com.mahi.demo.serviceImpl;


import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mahi.demo.entity.Contact;
import com.mahi.demo.repository.ContactRepository;
import com.mahi.demo.service.ContactService;

@Service
public class ContactServiceImpl implements ContactService{

	@Autowired
	private ContactRepository contactRepository;

	@Override
	public Contact saveContact(Contact Contact) {
		return contactRepository.save(Contact);
	}

	@Override
	public List<Contact> getContact() {
		return contactRepository.findAll();
	}

	@Override
	public Optional<Contact> findById(long id) {
		return contactRepository.findById(id);
	}

	@Override
	public void delete(long id) {
		contactRepository.deleteById(id);		
	}

	/*
	 * @Override public void update(Contact contact, long id) {
	 * contactRepository.updateContact(contact, id); }
	 */
	

	
	
	 
}
