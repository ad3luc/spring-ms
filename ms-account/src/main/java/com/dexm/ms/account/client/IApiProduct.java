package com.dexm.ms.account.client;

import com.dexm.ms.account.client.config.ApiProductConf;
import com.dexm.ms.account.client.dto.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@FeignClient(
		path = "/product",
		value = "ms-product",
		decode404 = true,
		configuration = ApiProductConf.class
)
public interface IApiProduct {

	@RequestMapping(method = GET, value = "/all")
	List<Product> getAllProduct();
}
