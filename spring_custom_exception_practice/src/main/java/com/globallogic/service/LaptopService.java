package com.globallogic.service;

import java.util.List;

import com.globallogic.entity.Laptop;

public interface LaptopService {
	
	List<Laptop> getAllLaptops();
	
	Laptop getLaptopById(long id);

}
