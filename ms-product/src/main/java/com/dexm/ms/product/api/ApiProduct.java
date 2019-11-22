package com.dexm.ms.product.api;

import com.dexm.ms.product.business.ServiceProduct;
import com.dexm.ms.product.ntt.Product;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j(topic = "api product")
@RestController
@RequestMapping("/product")
public class ApiProduct {

	@Autowired private ServiceProduct serviceProduct;

	@GetMapping("/all")
	public ResponseEntity<List<Product>> getAllProduct() {

		log.info("getAllProduct");
		return new ResponseEntity<>(
				serviceProduct.getAllProduct(),
				HttpStatus.OK
		);
	}
}
