package com.inventory.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inventory.entity.Product;
import com.inventory.repository.ProductDao;



@Service
public class ProductService {

	@Autowired
	private ProductDao productDao;
//	private List<Product> products = new ArrayList<>(Arrays.asList(new Product("1", "note book", "book", "Stationary", 15, false, "today"),
//			new Product("2", "text book", "book", "Stationary", 25, true, "tomarrow")));
    
	public List<Product> getAllProducts() {
		List<Product> products = new ArrayList<>();
		productDao.findAll().forEach(products::add);
		return products;
	}
	
	public Object getProduct(Integer id) {
		List<Product> products = new ArrayList<>();
		productDao.findAll().forEach(products::add);
		
		//return productDao.findAll().
		return products.stream().filter(p -> p.getId().equals(id)).findFirst().get();
	}
	
	public void saveProduct(Product newProduct) {
		productDao.save(newProduct);
		
	}

	/*public void updateProduct(String id, Product product) {
		
		for(int i =0; i< products.size() ; i++)
		{
			Product updateProduct = products.get(i);
			if(updateProduct.getProductId().equals(id)) {
				products.set(i, product);
			}
		}
		// TODO Auto-generated method stub
		
	}*/
}
