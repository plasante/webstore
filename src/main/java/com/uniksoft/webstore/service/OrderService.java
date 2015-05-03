package com.uniksoft.webstore.service;

public interface OrderService {
	void processOrder(String productId, long quantity);
}
