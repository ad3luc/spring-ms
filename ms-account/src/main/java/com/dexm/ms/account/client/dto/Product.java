package com.dexm.ms.account.client.dto;

import lombok.Data;

import java.util.UUID;

@Data
public class Product {
	private UUID uuid;
	private String name;
	private String customer;
	private Integer quantity;
}