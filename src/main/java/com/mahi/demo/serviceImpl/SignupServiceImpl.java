package com.mahi.demo.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mahi.demo.entity.Signup;
import com.mahi.demo.repository.SignupRepository;
import com.mahi.demo.service.SignupService;

@Service
public class SignupServiceImpl implements SignupService{
	
	@Autowired
	private SignupRepository signupRepository;

	@Override
	public Signup saveSignup(Signup signup) {
		return signupRepository.save(signup);
	}

	@Override
	public List<Signup> getSignup() {
		return signupRepository.findAll();
	}

	@Override
	public Optional<Signup> findById(long id) {
		return signupRepository.findById(id);
	}

	@Override
	public void delete(long id) {
		signupRepository.deleteById(id);		
	}

	/*
	 * @Override public void update(Signup signup, long id) {
	 * signupRepository.updateSignup(signup, id); }
	 */

	

	
	

	
	

}
