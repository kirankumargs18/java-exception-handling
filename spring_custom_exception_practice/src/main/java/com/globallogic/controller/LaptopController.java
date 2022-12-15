package com.globallogic.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.globallogic.entity.Laptop;
import com.globallogic.service.LaptopService;

@RestController
@RequestMapping("/api/v1")
public class LaptopController {

	@Autowired
	private LaptopService laptopService;

	@GetMapping("/laptops")
	public ResponseEntity<List<Laptop>> getAllLaptops() {

		return new ResponseEntity<List<Laptop>>(laptopService.getAllLaptops(), HttpStatus.OK);

	}

	@GetMapping("/laptops/{id}")
	public ResponseEntity<Laptop> getLaptopById(@PathVariable(value = "id") long id) {

		return new ResponseEntity<Laptop>(laptopService.getLaptopById(id), HttpStatus.OK);
	}

}
