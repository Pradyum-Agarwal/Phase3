package com.example.demo.repository;


import org.springframework.stereotype.Repository;

import com.example.demo.model.Product;

import org.springframework.data.repository.CrudRepository;




@Repository
public interface Repo extends CrudRepository<Product, Long>{
	
}
