package com.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.entity.NewEntity;

public interface NewRepository extends JpaRepository<NewEntity, Long> {
	
	
}
