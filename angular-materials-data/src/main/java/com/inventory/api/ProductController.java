package com.inventory.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.inventory.entity.Product;
import com.inventory.service.ProductService;





@RestController
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	
	@RequestMapping(value = "/getProducts", method = RequestMethod.GET)
	public List<Product> retrieveProducts() {
		return productService.getAllProducts();
		
	}
	
	@RequestMapping(value = "/getProduct/{id}", method = RequestMethod.GET)
	public Product getProduct(@PathVariable Integer id) {
		return (Product)productService.getProduct(id);
		
	}
	
	@RequestMapping(value = "/addProduct", method = RequestMethod.POST)
    public void saveProduct(@RequestBody Product product) {
		productService.saveProduct(product);
  
    }
	
	@RequestMapping(value = "/addProduct/{id}", method = RequestMethod.PUT)
    public void updateProduct(@RequestBody Product product, @PathVariable String id) {
		//productService.updateProduct(id, product);
  
    }

}
