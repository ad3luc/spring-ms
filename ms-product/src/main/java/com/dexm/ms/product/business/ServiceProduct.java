package com.dexm.ms.product.business;

import com.dexm.ms.product.ntt.Product;
import org.apache.commons.lang.RandomStringUtils;
import org.apache.commons.lang.math.RandomUtils;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ServiceProduct {

	public List<Product> getAllProduct() {

		List<Product> products = Arrays.asList(
				new Product(RandomStringUtils.randomAlphabetic(10), RandomStringUtils.randomAlphanumeric(15), RandomUtils.nextInt()),
				new Product(RandomStringUtils.randomAlphabetic(10), RandomStringUtils.randomAlphanumeric(15), RandomUtils.nextInt()),
				new Product(RandomStringUtils.randomAlphabetic(10), RandomStringUtils.randomAlphanumeric(15), RandomUtils.nextInt())
		);

		return products;
	}
}
