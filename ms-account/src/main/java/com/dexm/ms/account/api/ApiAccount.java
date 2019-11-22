package com.dexm.ms.account.api;

import com.dexm.ms.account.client.dto.Product;
import com.dexm.ms.account.service.ServiceAccount;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j(topic = "api account")
@RestController
@RequestMapping("/account")
public class ApiAccount {

	@Autowired private ServiceAccount serviceAccount;

	@GetMapping("/all")
	public ResponseEntity<List<Product>> getAllProductOfAccount() {

		log.info("get All product");
		return new ResponseEntity<>(
				serviceAccount.getAllProductOfAccount(),
				HttpStatus.OK
		);
	}
}
