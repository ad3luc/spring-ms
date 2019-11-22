package com.dexm.ms.account.service;

import com.dexm.ms.account.client.IApiProduct;
import com.dexm.ms.account.client.dto.Product;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j(topic = "service account")
@Service
public class ServiceAccount {

	@Autowired private IApiProduct iApiProduct;

	public List<Product> getAllProductOfAccount() {

		log.info("calling feign Product client");
		List<Product> allProduct = iApiProduct.getAllProduct();
		return allProduct;
	}
}
