package com.globallogic.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.globallogic.entity.Laptop;
import com.globallogic.exception.ResourceNotFoundException;
import com.globallogic.repository.LaptopRepository;
import com.globallogic.service.LaptopService;

@Service
public class LaptopServiceImpl implements LaptopService {
	
	@Autowired
	private LaptopRepository laptopRepository;

	@Override
	public List<Laptop> getAllLaptops() {
		
		//Sort.by("name");
		
		return laptopRepository.findAll(Sort.by("id").descending());
	}

	@Override
	public Laptop getLaptopById(long id) {
		
		return laptopRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Laptop Not Found With ID : "+id));
	}
	
	

}
