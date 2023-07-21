package com.mahi.demo.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mahi.demo.entity.Home;
import com.mahi.demo.repository.HomeRepository;
import com.mahi.demo.service.HomeService;

@Service
public class HomeServiceImpl implements HomeService{

	@Autowired
	private HomeRepository homeRepository;

	@Override
	public Home saveHome(Home home) {
		return homeRepository.save(home);
	}

	@Override
	public List<Home> getHome() {
		return homeRepository.findAll();
	}

	@Override
	public Optional<Home> findById(long id) {
		return homeRepository.findById(id);
	}

	@Override
	public void delete(long id) {
		homeRepository.deleteById(id);		
	}

	/*
	 * @Override public void update(Home home, long id) {
	 * homeRepository.updateHome(home, id); }
	 */

	

	
	

	
	
}
