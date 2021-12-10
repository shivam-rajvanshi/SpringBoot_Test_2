package com.example.demo.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Pojo.Product;
import com.example.demo.dao.ProductDao;

@Service
public class productServiceJPA {
	
	@Autowired
	ProductDao pd;
	
	public Product createProductService(Product newproduct) {
		return this.pd.save(newproduct);
	}
	
	public List<Product> getAllProductsService() {
		return this.pd.findAll();
	}
	
	public Optional<Product> getDetailsService(int id) {
		return this.pd.findById(id);
	}
	
	public int deleteProductService(int id) {
		try {
			this.pd.deleteById(id);
			return 1;
		} catch (Exception e) {
			// TODO: handle exception
			return 0;
		}
	}
	
	public Product updateProductServer(Product pToUpdate, int id) {
		Optional<Product> foundProduct = this.pd.findById(id);
		if (foundProduct.isPresent()) {
			Product oldProduct = foundProduct.get();
			oldProduct.setName(pToUpdate.getName());
			oldProduct.setCategory(pToUpdate.getCategory());
			oldProduct.setPrice(pToUpdate.getPrice());
			return this.pd.save(oldProduct);
		}
		else {
			return null;
		}
	}
	
}
