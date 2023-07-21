package com.mahi.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.mahi.demo.entity.About;

@Repository
public interface AboutRepository extends JpaRepository<About, Long>{

	/*
	 * @Query("update About u set u.active=false where u.lastLoginDate<:date")
	 * public void updateAbout(About about,long id);
	 */
	
	
}
