package com.uniksoft.webstore.repository;

import java.util.List;
import java.util.Map;
import java.util.Set;

import com.uniksoft.webstore.entity.Product;

public interface ProductRepository {
	List<Product> getAllProducts();
	Product getProductById(String productId);
	List<Product> getProductsByCategory(String category);
	Set<Product> getProductsByFilter(Map<String, List<String>> filterParams);
}
