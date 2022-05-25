package com.spring.service;

import java.util.List;

import org.springframework.data.domain.Pageable;

import com.spring.dto.NewDTO;

public interface INewService {
	NewDTO save(NewDTO newDTO);
	void delete(long[] ids);
	List<NewDTO> findAll(Pageable pageable);
	List<NewDTO> finAll();
	int totalItem();
}
