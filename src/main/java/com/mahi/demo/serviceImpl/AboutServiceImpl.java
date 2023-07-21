package com.mahi.demo.serviceImpl;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mahi.demo.entity.About;
import com.mahi.demo.repository.AboutRepository;
import com.mahi.demo.service.AboutService;

@Service
public class AboutServiceImpl implements AboutService{
	
	@Autowired
	private AboutRepository aboutRepository;

	@Override
	public About saveAbout(About about) {
		return aboutRepository.save(about);
	}

	@Override
	public List<About> getAbout() {
		return aboutRepository.findAll();
	}

	@Override
	public Optional<About> findById(long id) {
		return aboutRepository.findById(id);
	}

	@Override
	public void delete(long id) {
		aboutRepository.deleteById(id);		
	}

	/*
	 * @Override public void update(About about, long id) {
	 * aboutRepository.updateAbout(about, id); }
	 */

	
	
	
	
	
}
