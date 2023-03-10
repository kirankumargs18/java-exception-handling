package com.globallogic.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.globallogic.entity.Laptop;

@Repository
public interface LaptopRepository extends JpaRepository<Laptop, Long> {

}
