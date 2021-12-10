package com.example.demo.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Pojo.Product;
import com.example.demo.Services.productServiceJPA;

@RestController
@RequestMapping("product")
public class productController {
	
	@Autowired
	productServiceJPA ps;
	
	
	@PostMapping("add")
	public Product createProduct(@RequestBody Product newuser) {
		return this.ps.createProductService(newuser);
	}
	
	@GetMapping("all")
	public List<Product> getAllUser(){
		return this.ps.getAllProductsService();
	}
	
	@GetMapping("details/{id}")
	public Optional<Product> getDetails(@PathVariable("id") int id) {
		return ps.getDetailsService(id);
	}
	
	@DeleteMapping("delete/{id}")
	public int deleteUser(@PathVariable("id") int id) {
		return this.ps.deleteProductService(id);
	}
	
	@PutMapping("update/{id}")
	public Product updateUser(@RequestBody Product u, @PathVariable("id") int id) {
		return this.ps.updateProductServer(u, id);
	}
	
	
}
