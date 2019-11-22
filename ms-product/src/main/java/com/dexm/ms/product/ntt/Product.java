package com.dexm.ms.product.ntt;

import lombok.Data;

import java.util.UUID;

@Data
public class Product {

	private UUID uuid = UUID.randomUUID();
	private String name;
	private String customer;
	private Integer quantity;

	public Product() {
	}

	public Product(String name, String customer, Integer quantity) {
		this.name = name;
		this.customer = customer;
		this.quantity = quantity;
	}
}
