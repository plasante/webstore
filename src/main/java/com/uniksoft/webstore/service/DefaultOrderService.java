package com.uniksoft.webstore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uniksoft.webstore.entity.Product;
import com.uniksoft.webstore.repository.ProductRepository;

@Service
public class DefaultOrderService implements OrderService {

	@Autowired
	private ProductRepository productRepository;
	
	@Override
	public void processOrder(String productId, long quantity) {
		Product productById = productRepository.getProductById(productId);
		if (productById.getUnitsInStock() < quantity) {
			throw new IllegalArgumentException("Out of Stock. Available Units in stock " + 
					productById.getUnitsInStock());
		}
		productById.setUnitsInStock(productById.getUnitsInStock() - quantity);
	}

}
