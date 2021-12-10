package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Pojo.Product;

public interface ProductDao extends JpaRepository<Product, Integer>{

}
