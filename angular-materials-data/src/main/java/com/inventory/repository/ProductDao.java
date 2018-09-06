package com.inventory.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.inventory.entity.Product;


@Repository
public interface ProductDao extends CrudRepository<Product, String> {
 

}
