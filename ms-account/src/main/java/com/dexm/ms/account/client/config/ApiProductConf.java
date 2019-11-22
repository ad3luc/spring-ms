package com.dexm.ms.account.client.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApiProductConf {

	@Bean
	Logger.Level feignLoggerLevel() {

		return Logger.Level.HEADERS;
	}
}