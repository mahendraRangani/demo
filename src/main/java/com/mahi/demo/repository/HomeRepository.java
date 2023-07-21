package com.mahi.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.mahi.demo.entity.Home;

@Repository
public interface HomeRepository extends JpaRepository<Home, Long>{
	
	//public void updateHome(Home home,long id);

}